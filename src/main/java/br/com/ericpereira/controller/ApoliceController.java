package br.com.ericpereira.controller;

import br.com.ericpereira.model.Apolice;
import br.com.ericpereira.service.ApoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apolice")
public class ApoliceController {

    @Autowired
    private ApoliceService apoliceService;

    @GetMapping
    public List<Apolice> obterTodos(){
        return this.apoliceService.obterTodos();
    }

    @GetMapping("/{id}")
    public Apolice obterPorId(@PathVariable String id){
        return this.apoliceService.obterPorId(id);
    }

    @PostMapping
    public Apolice criar(@RequestBody Apolice apolice){
        return this.apoliceService.criar(apolice);
    }

}

package br.com.ericpereira.controller;

import br.com.ericpereira.model.Cliente;
import br.com.ericpereira.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> obterTodos() {
        return this.clienteService.obterTodos();
    }

    @GetMapping("/{id}")
    public Cliente obterPorId(@PathVariable String id) {
        return this.clienteService.obterPorId(id);
    }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) {
        return this.clienteService.criar(cliente);
    }


}

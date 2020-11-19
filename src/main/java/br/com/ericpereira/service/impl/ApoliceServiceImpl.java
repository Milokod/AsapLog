package br.com.ericpereira.service.impl;

import br.com.ericpereira.model.Apolice;
import br.com.ericpereira.repository.ApoliceRepository;
import br.com.ericpereira.service.ApoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApoliceServiceImpl implements ApoliceService {

    @Autowired
    private ApoliceRepository apoliceRepository;

    @Override
    public List<Apolice> obterTodos() {
        return this.apoliceRepository.findAll();
    }

    @Override
    public Apolice obterPorId(String id) {
        return this.apoliceRepository
                .findById(id)
                .orElseThrow(() ->new IllegalArgumentException("Apólice não encontrada."));
    }

    @Override
    public Apolice criar(Apolice apolice) {
        return this.apoliceRepository.save(apolice);
    }


}

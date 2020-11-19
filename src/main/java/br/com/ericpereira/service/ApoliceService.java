package br.com.ericpereira.service;

import br.com.ericpereira.model.Apolice;

import java.util.List;

public interface ApoliceService {
    public List<Apolice> obterTodos();

    public Apolice obterPorId(String id);

    public Apolice criar(Apolice apolice);
}

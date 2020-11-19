package br.com.ericpereira.service;

import br.com.ericpereira.model.Cliente;

import java.util.List;

public interface ClienteService {
    public List<Cliente> obterTodos();

    public Cliente obterPorId(String id);

    public Cliente criar(Cliente cliente);
}

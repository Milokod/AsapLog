package br.com.ericpereira.service.impl;

import br.com.ericpereira.utils.StringUtils;
import br.com.ericpereira.model.Cliente;
import br.com.ericpereira.repository.ClienteRepository;
import br.com.ericpereira.service.ClienteService;
import br.com.ericpereira.utils.ValidaCPF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> obterTodos() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente obterPorId(String id) {
        return this.clienteRepository
                .findById(id)
                .orElseThrow(()->new IllegalArgumentException(("Cliente não encontrado.")));
    }

    @Override
    public Cliente criar(Cliente cliente) {

        if (isClientValid(cliente)) {
            return this.clienteRepository.save(cliente);
        }else {
            return null;
        }
    }

    private boolean isClientValid(Cliente cliente) {
        if (StringUtils.isNullOrEmpty(cliente.getCpf())) return false;
        if (!ValidaCPF.isCPF(cliente.getCpf())) return false;
        if (StringUtils.isNullOrEmpty(cliente.getId())) return false;
        if (StringUtils.isNullOrEmpty(cliente.getCidade())) return false;
        if (StringUtils.isNullOrEmpty(cliente.getNome())) return false;
        if (StringUtils.isNullOrEmpty(cliente.getUf())) return false;
        return true;
    }

}

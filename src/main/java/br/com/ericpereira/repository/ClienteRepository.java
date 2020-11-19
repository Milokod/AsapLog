package br.com.ericpereira.repository;

import br.com.ericpereira.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente,String> {
}

package br.com.ericpereira.repository;

import br.com.ericpereira.model.Apolice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ApoliceRepository extends MongoRepository<Apolice,String> {
}

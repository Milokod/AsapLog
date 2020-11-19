package br.com.ericpereira.model;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Cliente {

    @Id
    private String id;
    private String cpf;
    private String nome;
    private String cidade;
    private String uf;
}

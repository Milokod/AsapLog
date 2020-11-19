package br.com.ericpereira.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Apolice {

    @Id
    private String id;
    private String numeroApolice;
    private String inicioVigencia;
    private String fimVigencia;
    private String placaVeiculo;
    private String valorApolice;
}

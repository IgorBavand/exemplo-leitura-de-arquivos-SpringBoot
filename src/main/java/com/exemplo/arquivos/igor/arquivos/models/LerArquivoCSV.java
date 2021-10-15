package com.exemplo.arquivos.igor.arquivos.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LerArquivoCSV {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String rodada;

    private int posicao_ebt;

    private double nota;

}

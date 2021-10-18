package com.exemplo.arquivos.igor.arquivos.models;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "csv")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ArquivoCsv {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int rodada;

    private int posicao_ebt;

    private double nota;

}

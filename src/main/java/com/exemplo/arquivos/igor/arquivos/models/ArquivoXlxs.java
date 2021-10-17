package com.exemplo.arquivos.igor.arquivos.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArquivoXlxs {

	
	private Date data;
	private String idLoja;
	private String produto;
	private int quantidade;
	private BigDecimal valor;
	
	
}

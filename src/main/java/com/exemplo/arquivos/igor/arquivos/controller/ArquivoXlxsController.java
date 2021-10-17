package com.exemplo.arquivos.igor.arquivos.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.arquivos.igor.arquivos.services.ArquivoXlxsService;

import com.exemplo.arquivos.igor.arquivos.models.*;

@RestController
public class ArquivoXlxsController {
	
	@Autowired
	private ArquivoXlxsService service;
	
	@RequestMapping("/arquivo-xlxs")
	public void lerXlxs() throws IOException {
		List<ArquivoXlxs> mandar = service.lerArquivo();
		service.imprimir(mandar);
	}

}

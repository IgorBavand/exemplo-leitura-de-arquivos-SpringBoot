package com.exemplo.arquivos.igor.arquivos.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.arquivos.igor.arquivos.services.ArquivoService;

@RestController
@RequestMapping("/api")
public class ArquivoController {
	
	@Autowired
	private ArquivoService service;
	
	@PostMapping("/arquivo-xlxs")
	public void lerXlsx() throws IOException {
		//System.out.println(file.getArquivo());

		 service.lerArquivo();
		//service.imprimir(mandar);
	}


	@PostMapping("/arquivo-csv")
	public void setInDb(){
		service.saveArquivo();
	}
}

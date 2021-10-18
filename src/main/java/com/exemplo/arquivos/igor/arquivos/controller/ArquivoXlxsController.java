package com.exemplo.arquivos.igor.arquivos.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.arquivos.igor.arquivos.services.ArquivoXlxsService;

import com.exemplo.arquivos.igor.arquivos.models.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class ArquivoXlxsController {
	
	@Autowired
	private ArquivoXlxsService service;
	
	@PostMapping("/arquivo-xlxs")
	public void lerXlxs() throws IOException {
		//System.out.println(file.getArquivo());

		 service.lerArquivo();
		//service.imprimir(mandar);
	}
}

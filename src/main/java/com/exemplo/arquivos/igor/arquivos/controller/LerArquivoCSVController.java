package com.exemplo.arquivos.igor.arquivos.controller;

import com.exemplo.arquivos.igor.arquivos.services.ArquivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LerArquivoCSVController {

    @Autowired
    private ArquivoService service;

    @PostMapping("/arquivo-csv")
    public void setInDb(){
        service.saveArquivo();
    }
}

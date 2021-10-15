package com.exemplo.arquivos.igor.arquivos.controller;

import com.exemplo.arquivos.igor.arquivos.services.LerArquivoCSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LerArquivoCSVController {

    @Autowired
    private LerArquivoCSVService service;

    @RequestMapping(path = "/arquivoCsv")
    public void setInDb(){
        service.saveArquivo();
    }
}

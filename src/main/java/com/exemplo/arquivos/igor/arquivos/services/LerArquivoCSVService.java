package com.exemplo.arquivos.igor.arquivos.services;

import com.exemplo.arquivos.igor.arquivos.models.LerArquivoCSV;
import com.exemplo.arquivos.igor.arquivos.repository.LerArquivoCSVDTO;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


@Service
@Slf4j
public class LerArquivoCSVService {

    @Autowired
    private LerArquivoCSVDTO dto;

    String line = "";
    public void saveArquivo(){

        log.info("procurando arquivo...");
        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/desenvolvedor/Documents/igor/cvs-exemplo/EBT.csv"));
            while((line=br.readLine()) != null){

                String [] data=line.split(",");

                LerArquivoCSV arquivo = new LerArquivoCSV();

                System.out.println(data[0]);

                arquivo.setRodada(data[0]);
                arquivo.setPosicao_ebt(Integer.parseInt(data[1]));
                arquivo.setNota(Double.parseDouble(data[2]));

                dto.save(arquivo);


            }
        }catch (FileNotFoundException e) {
            log.info("nenhum arqwuivo encontrado...");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package com.exemplo.arquivos.igor.arquivos.repository;

import org.springframework.data.repository.CrudRepository;
import com.exemplo.arquivos.igor.arquivos.models.ArquivoCsv;
import org.springframework.stereotype.Repository;

@Repository
public interface LerArquivoCSVDTO extends CrudRepository<ArquivoCsv, Long> {

}

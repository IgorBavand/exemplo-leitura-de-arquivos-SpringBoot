package com.exemplo.arquivos.igor.arquivos.services;

import org.apache.commons.collections4.IteratorUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

import com.exemplo.arquivos.igor.arquivos.models.*;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.processing.FilerException;
import javax.imageio.stream.FileImageInputStream;

@Service
public class ArquivoXlxsService{

	
	public List<ArquivoXlxs> lerArquivo() throws IOException{
		List <ArquivoXlxs> arquivoXlxs = new ArrayList<>(); 

		
		try {
			@Cleanup
			FileInputStream file = new FileInputStream("/home/igornardenio/Downloads");
			
			Workbook workbook = new HSSFWorkbook(file);
			
			
				org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
				
				//setando as linhas
				List <Row> rows = (List<Row>)toList(sheet.iterator());
				rows.remove(0);
				
				rows.forEach(row ->{
					//setando as celulas
					List <Cell> cells = (List<Cell>)toList(row.cellIterator());
			
					ArquivoXlxs arquivoBuild = ArquivoXlxs.builder()
							.data(cells.get(0).getDateCellValue())
							.idLoja(cells.get(1).getStringCellValue())
							.produto(cells.get(2).getStringCellValue())
							.quantidade((int)cells.get(3).getNumericCellValue())
							.valor(new BigDecimal(cells.get(4).getNumericCellValue()))
							.build();
					
					arquivoXlxs.add(arquivoBuild);
					
				});
			
			
			Iterator <Row> iterator = sheet.iterator();
			
			
			

		}catch(FileNotFoundException e) {
			System.out.println("arquivo nao encontrado "+e);
		}

		return arquivoXlxs;
	}
	
	public List<?> toList(Iterator<?> iterator){
		return IteratorUtils.toList(iterator);
	}
	
	public void imprimir(List<ArquivoXlxs> xlxs) {
		xlxs.forEach(System.out::println);
	}
}

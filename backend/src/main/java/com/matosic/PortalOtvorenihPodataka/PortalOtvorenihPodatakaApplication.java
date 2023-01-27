package com.matosic.PortalOtvorenihPodataka;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matosic.PortalOtvorenihPodataka.models.UziceBudzet;
import com.matosic.PortalOtvorenihPodataka.repositories.UziceBudzetRepository;

@SpringBootApplication
public class PortalOtvorenihPodatakaApplication {

	@Autowired
	UziceBudzetRepository urepo;
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(PortalOtvorenihPodatakaApplication.class, args);
//		
//		FileReader fileReader = new FileReader("C:\\Users\\Korisnik\\Desktop\\FTN\\BackAndFront\\EUprava\\csvs\\uzice-budzet-2020-rashodi");
//        CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT);
//		int iterator = 0;
//        for (CSVRecord record : csvParser) {
//            // Create a new object and set its properties
//        	if(iterator != 0) {        		
//        		UziceBudzet obj = new UziceBudzet();
//        		obj.setId(iterator + 1);
//        		obj.setRazdeo(Integer.parseInt(record.get(0)));
//        		obj.setRazdeoNaziv(record.get(1));
//        		obj.setNazivPrograma(record.get(6));
//        		obj.setNazivEkonomskeKlasifikacije(record.get(13));
//        		obj.setSredstvaIzBudzeta(Integer.parseInt(record.get(14)));
//        		iterator++;
//        	}
//            // Do something with the object
//        }
//
//        csvParser.close();
//        
//		
//		FileInputStream file = new FileInputStream("C:\\Users\\Korisnik\\Desktop\\FTN\\BackAndFront\\EUprava\\csvs\\uzice-budzet-2020-rashodi.xlsx");
//        Workbook workbook = WorkbookFactory.create(file);
//        Sheet sheet = workbook.getSheetAt(0);
//        int iterator = 0;
//        for (Row row : sheet) {
//            if (row.getRowNum() == 0) {
//                continue;
//            }
//            UziceBudzet obj = new UziceBudzet();
//            obj.setId(iterator + 1);
//    		obj.setRazdeo((int)row.getCell(0).getNumericCellValue());
//    		obj.setRazdeoNaziv(row.getCell(1).getStringCellValue());
//    		obj.setNazivPrograma(row.getCell(6).getStringCellValue());
//    		obj.setNazivEkonomskeKlasifikacije(row.getCell(13).getStringCellValue());
//    		obj.setSredstvaIzBudzeta((float)row.getCell(14).getNumericCellValue());
//    		
//    		System.out.println(obj.getId());
//    		
//        }
//        file.close();
//		
	}

}

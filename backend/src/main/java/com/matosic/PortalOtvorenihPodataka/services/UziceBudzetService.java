package com.matosic.PortalOtvorenihPodataka.services;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matosic.PortalOtvorenihPodataka.models.UziceBudzet;
import com.matosic.PortalOtvorenihPodataka.repositories.UziceBudzetRepository;


@Service
public class UziceBudzetService {
	
	@Autowired
	UziceBudzetRepository uziceBudzetRepository;
	
	public void ucitajFajlUBazu() throws EncryptedDocumentException, IOException{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Korisnik\\Desktop\\FTN\\BackAndFront\\EUprava\\csvs\\uzice-budzet-2020-rashodi.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);
        int iterator = 0;
        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                continue;
            }
            UziceBudzet obj = new UziceBudzet();
            obj.setId(iterator + 1);
    		obj.setRazdeo((int)row.getCell(0).getNumericCellValue());
    		obj.setRazdeoNaziv(row.getCell(1).getStringCellValue());
    		obj.setNazivPrograma(row.getCell(6).getStringCellValue());
    		obj.setNazivEkonomskeKlasifikacije(row.getCell(13).getStringCellValue());
    		obj.setSredstvaIzBudzeta((float)row.getCell(14).getNumericCellValue());
    		
    		uziceBudzetRepository.save(obj);
    		iterator ++;
        }
        file.close();
		
	}
	
}

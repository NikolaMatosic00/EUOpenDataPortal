package com.matosic.PortalOtvorenihPodataka.controllers;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matosic.PortalOtvorenihPodataka.services.UziceBudzetService;
import com.matosic.PortalOtvorenihPodataka.services.VisokoObrazovanjeService;

@RestController
@RequestMapping("/")
public class MainController {
	
	@Autowired
	UziceBudzetService ubs;
	
	@Autowired
	VisokoObrazovanjeService vos;
	
	
	@GetMapping("ucitajub")
	public void ucitajXlsxUziceBudzetIUpisiPodatkeUBazu() throws EncryptedDocumentException, IOException{
		ubs.ucitajFajlUBazu();
	}
	
	
	@GetMapping("ucitajvo")
	public void ucitajJsonVisokoObrazovanjeIUpisiPodatkeUBazu() throws EncryptedDocumentException, IOException{
		vos.ucitajFajlUBazu();
	}
	
	
	
}

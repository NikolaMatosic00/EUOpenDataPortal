package com.matosic.PortalOtvorenihPodataka.services;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matosic.PortalOtvorenihPodataka.models.VisokoObrazovanje;
import com.matosic.PortalOtvorenihPodataka.repositories.VisokoObrazovanjeRepository;

@Service
public class VisokoObrazovanjeService {

	@Autowired
	private VisokoObrazovanjeRepository voRepository;

	public void ucitajFajlUBazu() throws EncryptedDocumentException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(new File("C:\\\\Users\\\\Korisnik\\\\Desktop\\\\FTN\\\\BackAndFront\\\\EUprava\\\\csvs\\\\Visoko obrazovanje - Podaci o skolarinama.json"));

		JsonNode skolarineArray = rootNode.get("Skolarine");
		
		 int iterator = 1;
		for (JsonNode skolaObj : skolarineArray) {
		    VisokoObrazovanje skola = mapper.treeToValue(skolaObj, VisokoObrazovanje.class);
		    skola.setId(iterator);
		    voRepository.save(skola);
        	iterator++;
		}

	}

}

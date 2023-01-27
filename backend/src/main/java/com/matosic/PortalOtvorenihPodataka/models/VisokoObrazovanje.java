package com.matosic.PortalOtvorenihPodataka.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisokoObrazovanje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vrstaUstanove;
	private String vrstaOsnivacaPoUstanovi;
	private String nazivPrograma;
	private String okrug;
	private String opstina;
	private String sredstvaIzBudzeta;
	private String mesto;
	private String nazivUstanove;
	private String naSamofinansiranju;
	private String naBudzetu;
	
}

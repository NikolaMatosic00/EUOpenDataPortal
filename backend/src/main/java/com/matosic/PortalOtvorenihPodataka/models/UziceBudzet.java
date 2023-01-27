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
public class UziceBudzet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int razdeo;
	private String razdeoNaziv;
	private String nazivPrograma;
	private String nazivEkonomskeKlasifikacije;
	private float sredstvaIzBudzeta;
}

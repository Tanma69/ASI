package com.sp.tools;

import org.springframework.web.client.RestTemplate;

import com.sp.controller.CarteDao;
import com.sp.model.Carte;

public class Comm {
	static final String URL_CARTES = "http://localhost:8070/cards";
	
	static RestTemplate restTemplate = new RestTemplate();
	
	CarteDao cartedao;
	
	public static Carte[] getRemoteCartes() {
		Carte[] result = restTemplate.getForObject(URL_CARTES, Carte[].class);
		return result;
	}
	
	
	public static void AjoutCartes(CarteDao cartedao) {
		Carte[] result = restTemplate.getForObject(URL_CARTES, Carte[].class);
		if (result != null) {
			for (Carte e : result) {
				cartedao.addCarte(e.getFamily_src(),e.getFamily_name(),e.getImg_src(),e.getName(),e.getDescription(),e.getHp(),e.getEnergy(),e.getAttack(),e.getDefense(),e.getAffinity(),e.getPrice());
			}
		}
	}

}
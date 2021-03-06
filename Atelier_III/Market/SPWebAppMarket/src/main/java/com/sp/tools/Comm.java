package com.sp.tools;

import org.springframework.web.client.RestTemplate;


import com.sp.controller.CarteDao;
import com.sp.model.Carte;
import com.sp.model.User;

public class Comm {
	static final String URL_CARTES = "http://localhost:8070/all_cards";
	
	static final String URL_ARGENT = "http://localhost:8060/argent";
	
	static final String URL_USER = "http://localhost:8060/user_name/";
	
	static final String URL_CARTE="http://localhost:8080/vendu";
	static final String URL_ID="http://localhost:8080/vendu_id";
	static final String URL_TRANS="http://localhost:8060/change_money/";
	
	
	
	
	CarteDao cartedao;
	
	public static CarteDao getRemoteCartes() {
		RestTemplate restTemplate = new RestTemplate();
		CarteDao result = restTemplate.getForObject(URL_CARTES, CarteDao.class);
		return result;
	}
	
	
	public static void AjoutCartes(CarteDao cartedao) {
		RestTemplate restTemplate = new RestTemplate();
		Carte[] result = restTemplate.getForObject(URL_CARTES, Carte[].class);
		if (result != null) {
			for (Carte e : result) {
				cartedao.addCarte(e.getFamily_src(),e.getFamily_name(),e.getImg_src(),e.getName(),e.getDescription(),e.getHp(),e.getEnergy(),e.getAttack(),e.getDefense(),e.getAffinity(),e.getPrice(),e.getCard_id(),e.getUser_id());
			}
		}
	}
	
	public static String recuperer_argent() {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(URL_ARGENT, String.class);
		return result;
	}
	
	public static String recuperer_user_name(int id ) {
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(URL_USER+id, String.class);
		return result;	
	}
	
	
	public static Carte recuper_card() {
		RestTemplate restTemplate = new RestTemplate();;
		Carte result = restTemplate.getForObject(URL_CARTE, Carte.class);
		return result;
	}
	
	public static int recuperer_id_user() {
		RestTemplate restTemplate = new RestTemplate();
		int result = restTemplate.getForObject(URL_ID, int.class);
		return result;
	}
	
	public static String transaction_service(int id, int prix) {
		RestTemplate restTemplate = new RestTemplate();
		String result =restTemplate.getForObject(URL_TRANS+id+"/"+prix, String.class);
		return result;
	}

}

package com.sp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sp.model.Carte;

import com.sp.model.User;
import com.sp.tools.Comm;

@CrossOrigin

@RestController
public class CardsRestController {
	
	@Autowired
	CarteDao carteDao;
	Carte carte_vendu;
	String id_vendu ;
	
    @RequestMapping(value = { "/cardsget"}, method = RequestMethod.GET)
    public List<Carte> viewList() {
    	carteDao.supprimer();
    	Comm.AjoutCartes(carteDao);
    	return carteDao.getCarteList();
    	
    }
    
    @RequestMapping(value = { "/vendre"}, method = RequestMethod.POST)
    public void carte_vendu(@RequestBody Carte body) {
    	carte_vendu=body;
    	
    }
    
    @RequestMapping(value = { "/vendu"}, method = RequestMethod.GET)
    public Carte carte_vendu2() {
    	return carte_vendu;
    	
    }
    @RequestMapping(value = { "/vendre_id"}, method = RequestMethod.POST)
    public void carte_vendu_id(@RequestBody String body) {
    	id_vendu=body;
    	
    }
    
    @RequestMapping(value = { "/vendu_id"}, method = RequestMethod.GET)
    public int carte_vendu2_id() {
    	id_vendu=getNbr(id_vendu);
    	int result= Integer.parseInt(id_vendu);
    	return result;
    	
    }
    
    static String getNbr(String str) 
    { 
        // Remplacer chaque nombre non numérique par un espace
        str = str.replaceAll("[^\\d]", " "); 
        // Supprimer les espaces de début et de fin 
        str = str.trim(); 
        // Remplacez les espaces consécutifs par un seul espace
        str = str.replaceAll(" +", " "); 
  
        return str; 
    } 
    
    
    @RequestMapping(value ="/transaction", method =RequestMethod.POST)
    public void transaction() {
    	Carte card_recup= Comm.recuper_card();
    	int id = Comm.recuperer_id_user();
    	String a =Comm.transaction_service(id,card_recup.getPrice());
    }
    
}

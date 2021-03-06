package com.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.sp.model.Carte;
import com.sp.tools.Comm;

@Controller 
public class Shop_controller {
	
 
 	/* --------------------------------SHOP ----------------------------------------------*/
 	


 	
    @RequestMapping(value = { "/card_sell"}, method = RequestMethod.GET)
    public String card_sell(Model model) {
    	
    	/*int id = 0;
    	String Utilisateur =Comm.recuperer_user(id).getFirstname() + Comm.recuperer_user(id).getLastname();*/
    	
     	String Utilisateur ="Arthur OLIVIER ";
     	/*String Argent = Comm.recuperer_argent();*/
     	String Argent = "50";
     	
    	model.addAttribute("utilisateur",Utilisateur );
    	model.addAttribute("argent",Argent );
    	model.addAttribute("vendre_acheter1","SELL" );
    	model.addAttribute("vendre_acheter2"," Vous pouvez ici vendre vos cartes : " );

  	  	return "market";
    }
    @RequestMapping(value = { "/card_buy"}, method = RequestMethod.GET)
    public String card_buy(Model model) {
    	
    	/*int id = 0;
    	String Utilisateur =Comm.recuperer_user(id).getFirstname() + Comm.recuperer_user(id).getLastname();*/
    	
     	String Utilisateur ="Arthur OLIVIER";
     	/*String Argent = Comm.recuperer_argent();*/
     	String Argent = "50";
     	
    	model.addAttribute("utilisateur",Utilisateur );
    	model.addAttribute("argent",Argent );
    	model.addAttribute("vendre_acheter1","BUY" );
    	model.addAttribute("vendre_acheter2"," Vous pouvez ici acheter vos cartes : " );
    
  	  	return "market";
    }
    
    
    @RequestMapping(value = { "/menu"}, method = RequestMethod.GET)
    public String menu() {

  	  	return "menu";
    }
    
    @RequestMapping(value = { "/menuplay"}, method = RequestMethod.GET)
    public String menuplay() {

  	  	return "menuPlay";
    }
 	
}

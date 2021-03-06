package com.sp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sp.model.Card;
import com.sp.services.CardDAO;
import com.sp.tools.Communication;

@CrossOrigin

@RestController
public class CardRestController {
	
	@Autowired
	CardDAO cardDao;
	
    @RequestMapping(value = { "/all_cards"}, method = RequestMethod.GET)
    public List<Card> viewList() {
    	return cardDao.getCardList();
    	
    }
    
    @RequestMapping(value ="/cards_generator/{id}", method =RequestMethod.GET)
    public String card_generator(@PathVariable int id) {
		int user_id=id;
		cardDao.newUser5Cards(user_id);
		return "all_cards";
    }
    

    
    

}
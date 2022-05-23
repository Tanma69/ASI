package com.sp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sp.model.Carte;
import com.sp.tools.Comm;

@RestController
public class CardsRestController {
	
	@Autowired
	CarteDao carteDao;
	
    @RequestMapping(value = { "/cardsget"}, method = RequestMethod.GET)
    public List<Carte> viewList() {
    	carteDao.supprimer();
    	Comm.AjoutCartes(carteDao);
    	return carteDao.getCarteList();
    }
}

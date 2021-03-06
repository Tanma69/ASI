package com.sp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.Carte;

@RestController
public class CardsRestController {
	
	@Autowired
	CarteDao carteDao;
	
    @RequestMapping(value = { "/cards"}, method = RequestMethod.GET)
    public List<Carte> viewList() {
  	  	return carteDao.getCarteList();
    }
}

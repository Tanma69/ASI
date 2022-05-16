package com.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sp.model.Carte;
import com.sp.model.CarteForm;
import com.sp.service.CarteDao;

@Controller 
public class RequestCrt {

  	@Value("${welcome.message}")
  	private String message;	

	private static String messageLocal="Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("message", message);
		model.addAttribute("messageLocal", messageLocal);
		return "index";
	}

    @Autowired
    CarteDao CarteDao;

   	@RequestMapping(value = { "/view"}, method = RequestMethod.GET)
    public String view(Model model) {
   		model.addAttribute("myCarte",CarteDao.getRandomCarte() );
   		return "CarteView";
    }

    @RequestMapping(value = { "/addCarte"}, method = RequestMethod.GET)
    public String addCarte(Model model) {
    	CarteForm carteForm = new CarteForm();
    	model.addAttribute("CarteForm", carteForm);
    	return "create_carte";
    }

    @RequestMapping(value = { "/addCarte"}, method = RequestMethod.POST)
    public String addCarte(Model model, @ModelAttribute("CarteForm") CarteForm carteForm) {
    	Carte p=CarteDao.addCarte(carteForm.getfamily_src(),carteForm.getfamily_name(), carteForm.getimg_src(), carteForm.getname(), carteForm.getdescription(), carteForm.gethp(), carteForm.getenergy(), carteForm.getattack(), carteForm.getdefense(), carteForm.getaffinity());
    	model.addAttribute("myCarte",p );
    	return "affiche_carte";
    }

    @RequestMapping(value = { "/list"}, method = RequestMethod.GET)
    public String viewList(Model model) {
  	  	model.addAttribute("CarteList",CarteDao.getCarteList() );
  	  	return "CarteViewList";
    }

}

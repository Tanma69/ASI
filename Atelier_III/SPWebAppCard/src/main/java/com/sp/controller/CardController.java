  package com.sp.controller;

  import java.util.List;
  import org.springframework.beans.factory.annotation.Autowired;
  import org.springframework.beans.factory.annotation.Value;
  import org.springframework.stereotype.Controller;
  import org.springframework.ui.Model;
  import org.springframework.web.bind.annotation.ModelAttribute;
  import org.springframework.web.bind.annotation.RequestMapping;
  import org.springframework.web.bind.annotation.RequestMethod;
  import com.sp.model.Card;
  import com.sp.services.CardDAO;
  
@Controller 
public class CardController {
	  
  	@Value("${welcome.message}")
  	private String message;
  	private static String messageLocal="Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";

  	@Autowired
  	CardDAO cardDao;
  	
  	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
  		public String index(Model model) {
    
  		model.addAttribute("message", message);
  		model.addAttribute("messageLocal", messageLocal);
  		model.addAttribute("myCard", cardDao.getRandomCard());
  
  		return "index";
  	}
}

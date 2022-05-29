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
  import com.sp.model.CardDTO;
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
  	
    @RequestMapping(value = { "/addCard" }, method = RequestMethod.GET)
    public String addCarte(Model model) {
    	Card myCard = new Card();
    	model.addAttribute("myCard", myCard);
    	return "createNewCard";
    }

    @RequestMapping(value = { "/addCard" }, method = RequestMethod.POST)
    public String addCarte(Model model, @ModelAttribute("myCard") Card myCard) {
    	Card myNewCard = cardDao.addCard(myCard.getFamily_src(),myCard.getFamily_name(), myCard.getImg_src(), myCard.getName(), myCard.getDescription(), myCard.getHp(), myCard.getEnergy(), myCard.getAttack(), myCard.getDefense(), myCard.getAffinity(), myCard.getPrice(), myCard.getUser_id());
    	model.addAttribute("myCard",myNewCard);
    	return "displayNewCard";
    }
    
}

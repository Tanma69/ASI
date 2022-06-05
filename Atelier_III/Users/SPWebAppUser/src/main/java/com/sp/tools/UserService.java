package com.sp.tools;

import java.io.IOException;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import com.sp.model.User;
import com.sp.repository.UserRepository;

@CrossOrigin

@Service
public class UserService {
	@Autowired
	UserRepository uRepository;

	
//Partie Register
	static String URL_CARTES ="http://localhost:8000/cards";
	RestTemplate restTemplate =  new RestTemplate();
	
	//Creation d'un user dans le repository
	public void addUser (User u) {
		User createdUser = uRepository.save(u);
		System.out.println(createdUser);
	}
	
	//si l'id existe retourne le user dont l'id est demandé  sinon user null
	public User getUser(int id) {
		Optional<User> uOpt =uRepository.findById(id);
		if (uOpt.isPresent()) {
			return uOpt.get();
		}else {
			User u = new User();
			return u;
		}
	}

	//recheche un user avec le username et le mot de passe
	//renvoie true s'il existe
	public boolean compareUser(String username, String password) {
		boolean existe = false;
		List<User> ListU = uRepository.findByUsername(username);
		for (User u : ListU){
			if ((u.getUsername().equals(username)) && (u.getPassword().equals(password))){
				int iduser = u.getId();
				existe=true;
				System.out.println(iduser);
			}
		}
		return existe;	
	}	


		public void affichageUser1 (User u) {
        System.out.println(u);
    }

	//récupère l'argent du user
		public int Argent_User(User u) {
			return u.getMoney();
			}
		
		//mise à  jour de l'argent d'un user après achat de cartes
		public void SetMoney(User u,int moneyCard) {
			u.setMoney(u.getMoney()-moneyCard);
			uRepository.save(u);
			System.out.println(u.getMoney());
		}
		
		//mise à jour de l'argent d'un user après la vente de carte
		public void AddMoney(User u,int moneyCard) {
			u.setMoney(u.getMoney()+ moneyCard);
			uRepository.save(u);
			System.out.println(u.getMoney());
		}
		
		public void affichageUser (User u) {
	        System.out.println(u);
	    }
		
		public static void Create5Cards(int id) {
			
			RestTemplate restTemplate = new RestTemplate();
			String URL_CARTES2 ="http://localhost:8070/cards_generator/"+id;
			String result = restTemplate.getForObject(URL_CARTES2, String.class);
		}


}

//Partie Login


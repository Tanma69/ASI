package com.sp.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.User;
import com.sp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository uRepository;

	
//Partie Register
	
	
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


	public void affichageUser (User u) {
        System.out.println(u);
    }

}

//Partie Login


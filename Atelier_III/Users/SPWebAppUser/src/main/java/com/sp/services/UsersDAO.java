package com.sp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sp.model.*;
import com.sp.tools.UserService;

@Service
public class UsersDAO {
	private List<User> liste_user;

	public UsersDAO() {
		liste_user = new ArrayList<User>();
		createUsers();
	}

	private void createUsers() {
		
		liste_user.add( new User("Arthur", "OLIVIER", "arthur1", "mdp1"));	
		liste_user.add( new User("Tom", "OLIVIER", "arthur2", "mdp2"));
		liste_user.add( new User("Jean", "OLIVIER", "arthur3", "mdp3"));
	}

	public List<User> getallUsers() {
		return this.liste_user;
	}
	
	public User find_by_id(int id) {
		User User_trouve = new User();
	    for (int i = 0; i < liste_user.size(); i++) {
	    	if (liste_user.get(i).getId() == id ) {
	    		User_trouve=liste_user.get(i);
	    	}
	      }
		return User_trouve;
	}
	
	public void add_user(User u) {
		liste_user.add(u);
		int user_id = u.getId();
		UserService.Create5Cards(user_id);
	}


}

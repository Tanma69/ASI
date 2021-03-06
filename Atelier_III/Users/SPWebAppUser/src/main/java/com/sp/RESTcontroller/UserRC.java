package com.sp.RESTcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.User;
import com.sp.tools.UserService;
import com.sp.services.*;


@CrossOrigin

@RestController
public class UserRC {
	
	@Autowired
    UserService uService;
	UsersDAO UsersDAO = new UsersDAO();
	
	@RequestMapping(method=RequestMethod.GET,value="/all_user")
    public List<User> all_user() {
		return UsersDAO.getallUsers();
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/user_id/{id1}")
    public User user_by_id(@PathVariable String id1) {
		int id = Integer.parseInt(id1);
		User user_trouve = UsersDAO.find_by_id(id);
		return user_trouve;
    }
	
	@RequestMapping(method=RequestMethod.GET,value="/user_money/{id1}")
    public int user_get_money_by_id(@PathVariable String id1) {
		int id = Integer.parseInt(id1);
		User user_trouve = UsersDAO.find_by_id(id);
		int money = user_trouve.getMoney();
		return money;
    }
	
	//Ajouter un utilisateur 
	@RequestMapping(method=RequestMethod.POST,value="/user_add")
    public void addUser(@RequestBody User u) {
		UsersDAO.add_user(u);
    }
	
	
	
	
	
	
	
  //Permet de retourner un user grace à son id
	@RequestMapping(method=RequestMethod.GET,value="/user/{id}")
	public User showLog(@PathVariable String id) {
		User u = uService.getUser(Integer.valueOf(id));
		return u;
	}
	
	//verification de connexion
	//RequestBody : "username=xxxx et password=xxx" password étant le paramètre.
	@RequestMapping(method=RequestMethod.POST,value="/send")
    public boolean receive(@RequestBody String m) {
		
		String[] name = m.split("&");
		String username = name[0].split("=")[1];
		String pass = name[1].split("=")[1];
	
		boolean x = uService.compareUser(username,pass);	
		System.out.println(x);
		return x;
	
    }	
	
	
	//Permet la MAJ de l'argent du User
	
	@RequestMapping(method = RequestMethod.GET , value="/change_money/{id}/{prix}")	
    public String change_money (@PathVariable int id,@PathVariable int prix) {
		User u = UsersDAO.find_by_id(id);
		int money1= u.getMoney();
		int money2=money1-prix;
		u.setMoney(money2);
		
		return "ok";
		
		
	}

}
package com.sp.RESTcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.CarteForm;
import com.sp.model.User;
import com.sp.service.UserService;

@RestController
public class UserRC {
	@Autowired
    UserService uService;
	
	//Ajouter un utilisateur 
	@RequestMapping(method=RequestMethod.POST,value="/user")
    public void addUser(@RequestBody User u) {
        uService.addUser(u);
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
}
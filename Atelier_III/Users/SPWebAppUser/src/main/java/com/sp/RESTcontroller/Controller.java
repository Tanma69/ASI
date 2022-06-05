package com.sp.RESTcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

	
    @RequestMapping(value = { "/login" }, method = RequestMethod.GET)
    public String login() {
    	return "userLoging";
    }
    
    @RequestMapping(value = { "/register" }, method = RequestMethod.GET)
    public String register() {
    	return "userRegister";
    }
}

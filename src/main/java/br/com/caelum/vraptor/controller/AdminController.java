package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;

@Controller
public class AdminController {

	private final Result result;
	
	public AdminController(){
		this(null);
	}
	
	@Inject 
	public AdminController(Result result){
		this.result = result;
	}
	
	@Path("/adminregister")
	public registerAdmin(){
	
	}
}

package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.AdminDAO;
import br.com.caelum.vraptor.model.Admin;

@Controller
public class AdminController {

	private final Result result;
	private final AdminDAO adminDAO;
	
	/*
	 * CDI only
	 */
	public AdminController(){
		this(null, null);
	}
	
	@Inject 
	public AdminController(Result result, AdminDAO adminDAO){
		this.result = result;
		this.adminDAO = adminDAO;
	}
	
	@Get
	@Path("/registeradmin")
	public void register(){
		
	}
	
	@Post
	@Path("/registeradmin")
	public void register(Admin admin){
		adminDAO.add(admin);
		result.redirectTo(IndexController.class).index();
	}
	
	
}

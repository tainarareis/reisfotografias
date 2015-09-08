package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Admin;

@RequestScoped
public class AdminDAO {

	@Inject
	private EntityManager manager;
	
	public void add(Admin admin){
		manager.persist(admin);
	}
	
	public Admin get(String name){
		return null;
	}
	
	
}

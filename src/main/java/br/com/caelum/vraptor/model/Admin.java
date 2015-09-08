package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//A anotação @Entity faz com que o JPA saiba que aquela classe deve ser manipulada por ele.
@Entity
public class Admin {

	@Id
	@GeneratedValue
	private long id;
	@NotNull
	@Size(min=3, max=10)
	private String name;
	@NotNull
	@Size(min=3, max=10)
	private String login;
	@NotNull
	@Size(min=3, max=15)
	private String email;
	@NotNull
	@Size(min=6, max=10)
	private String password;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

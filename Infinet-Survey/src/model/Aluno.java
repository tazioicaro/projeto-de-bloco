package model;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable{
	
	private Integer id;
	private String login;
	private String senha;
	
	
	//Método cadastrar, alterar e excluir ficará no ManagerBean
	
	public Aluno(){
		
	}
	
	public Aluno(Integer id, String login, String senha) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	

}

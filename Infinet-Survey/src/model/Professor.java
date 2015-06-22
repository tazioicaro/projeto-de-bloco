package model;

import java.io.Serializable;

public class Professor  extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Metodos CRUDS no ManagerBean
	
	private Integer id;
	private String titulacao;
	private String formacao;
	
	public Professor(){		
		
	}
	
	public Professor(Integer id, String titulacao, String formacao) {
		super();
		this.id = id;
		this.titulacao = titulacao;
		this.formacao = formacao;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	
	
	

}

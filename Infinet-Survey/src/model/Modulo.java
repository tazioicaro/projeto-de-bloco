package model;

import java.io.Serializable;

public class Modulo implements Serializable{
	
	private Integer id;
	private String nome;
	
	public Modulo(){
		
	}
	
	public Modulo(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}

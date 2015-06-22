package model;

import java.io.Serializable;

public class Questoes implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String descricao;
	private Topico topico;
	
	public Questoes(){
		
	}
	
	public Questoes(Integer id, String descricao, Topico topico) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.topico = topico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Topico getTopico() {
		return topico;
	}

	public void setTopico(Topico topico) {
		this.topico = topico;
	}
	
	
	

}

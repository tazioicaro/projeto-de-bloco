package model;

import java.io.Serializable;

public class ModeloDeAvalicao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//GRUD no ManagerBean
	private Integer id;
	private Questoes questoes;
	private Curso curso;
	private Professor professor;
	
	
	public ModeloDeAvalicao(){
		
	}
	
	public ModeloDeAvalicao(Integer id, Questoes questoes, Curso curso,
			Professor professor) {
		super();
		this.id = id;
		this.questoes = questoes;
		this.curso = curso;
		this.professor = professor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Questoes getQuestoes() {
		return questoes;
	}

	public void setQuestoes(Questoes questoes) {
		this.questoes = questoes;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	

}

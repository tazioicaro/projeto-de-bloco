package model;

import java.io.Serializable;
import java.util.Collection;

public class Avaliacao  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private AberturaDeAvaliacao aberturaDeAvaliacao;
	private Aluno aluno;
	private Collection<Questoes> questoes;
	private String respostas;
	
	
	public Avaliacao(){
		
	}
	
	public Avaliacao(AberturaDeAvaliacao aberturaDeAvaliacao, Aluno aluno,
			Collection<Questoes> questoes, String respostas) {
		super();
		this.aberturaDeAvaliacao = aberturaDeAvaliacao;
		this.aluno = aluno;
		this.questoes = questoes;
		this.respostas = respostas;
	}

	public AberturaDeAvaliacao getAberturaDeAvaliacao() {
		return aberturaDeAvaliacao;
	}

	public void setAberturaDeAvaliacao(AberturaDeAvaliacao aberturaDeAvaliacao) {
		this.aberturaDeAvaliacao = aberturaDeAvaliacao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Collection<Questoes> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(Collection<Questoes> questoes) {
		this.questoes = questoes;
	}

	public String getRespostas() {
		return respostas;
	}

	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}
	
	
	
	
	
	

}

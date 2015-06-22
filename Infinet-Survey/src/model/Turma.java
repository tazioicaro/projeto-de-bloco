package model;

public class Turma {
	
	private Integer id;
	private String nome;
	private Curso curso;
	private Aluno aluno;
	private Professor professor;
	
	//CadastrarTruma, Alterar e excluir será no ManagerBean
	
	public Turma(){
		
	}	

	public Turma(Integer id, String nome, Curso curso, Aluno aluno,
			Professor professor) {
		super();
		this.id = id;
		this.nome = nome;
		this.curso = curso;
		this.aluno = aluno;
		this.professor = professor;
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
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
}

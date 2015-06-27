package controller.repositorio;

import java.util.List;

public interface Aluno {
	
	public List<Aluno> todos();
	public Modulo  guardar(Aluno aluno);
	public void remover( Aluno aluno);

}

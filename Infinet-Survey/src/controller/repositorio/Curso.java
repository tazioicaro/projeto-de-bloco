package controller.repositorio;

import java.util.List;

public interface Curso {
	
	public List<Curso> todos();
	public Curso  guardar(Curso curso);
	public void remover( Curso curso);

}

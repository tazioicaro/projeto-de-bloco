package controller.repositorio;

import java.util.List;

public interface Professor {
	
	public List<Professor> todos();
	public Professor  guardar(Professor professor);
	public void remover( Professor professor);

}

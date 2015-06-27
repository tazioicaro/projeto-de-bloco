package controller.repositorio;

import java.util.List;

public interface Turma {
	
	public List<Turma> todos();
	public Turma  guardar(Turma turma);
	public void remover( Turma turma);


}

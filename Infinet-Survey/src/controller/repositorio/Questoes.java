package controller.repositorio;

import java.util.List;

public interface Questoes {
	
	public List<Questoes> todos();
	public Questoes  guardar(Questoes questoes);
	public void remover( Questoes questoes);


}

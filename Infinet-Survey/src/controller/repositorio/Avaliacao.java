package controller.repositorio;

import java.util.List;

public interface Avaliacao {
	
	public List<Avaliacao> todos();
	public Modulo  guardar(Avaliacao avaliacao);
	public void remover( Avaliacao avaliacao);

}

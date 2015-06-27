package controller.repositorio;

import java.util.List;

public interface Topico {
	
	public List<Topico> todos();
	public Topico  guardar(Topico topico);
	public void remover( Topico topico);

}

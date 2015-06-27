package controller.repositorio;

import java.util.List;

public interface Bloco {
	
	public List<Bloco> todos();
	public Modulo  guardar(Bloco bloco);
	public void remover( Bloco bloco);


}

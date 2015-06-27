package controller.repositorio;

import java.util.List;

public interface Pessoa {
	
	public List<Pessoa> todos();
	public Pessoa  guardar(Pessoa pessoa);
	public void remover( Pessoa pessoa);


}

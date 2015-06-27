package controller.repositorio;

import java.util.List;

public interface Modulo {
	
	public List<Modulo> todos();
	public Modulo  guardar(Modulo modulo);
	public void remover( Modulo modulo);

}

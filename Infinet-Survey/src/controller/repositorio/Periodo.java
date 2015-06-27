package controller.repositorio;

import java.util.List;

public interface Periodo {
	
	public List<Periodo> todos();
	public Periodo  guardar(Periodo periodo);
	public void remover( Periodo periodo);
	

}

package controller.repositorio;

import java.util.List;

public interface Usuario {
	
	public List<Usuario> todos();
	public Usuario  guardar(Usuario usuario);
	public void remover( Usuario usuario);
	
	

}

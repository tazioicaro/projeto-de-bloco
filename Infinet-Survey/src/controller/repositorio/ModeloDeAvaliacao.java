package controller.repositorio;

import java.util.List;

public interface ModeloDeAvaliacao {
	
	public List<ModeloDeAvaliacao> todos();
	public Modulo  guardar(ModeloDeAvaliacao modeloAvaliacao);
	public void remover( ModeloDeAvaliacao modeloAvaliacao);

}

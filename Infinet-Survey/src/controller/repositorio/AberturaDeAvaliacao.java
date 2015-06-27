package controller.repositorio;

import java.util.List;

public interface AberturaDeAvaliacao {
	
	public List<AberturaDeAvaliacao> todos();
	public Modulo  guardar(AberturaDeAvaliacao aberturaAvalicao);
	public void remover( AberturaDeAvaliacao aberturaAvalicao);

}

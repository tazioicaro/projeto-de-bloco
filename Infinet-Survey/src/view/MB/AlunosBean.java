package view.MB;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean	
@ViewScoped
public class AlunosBean {


private List<Integer> alunosFiltrados;
	


	public AlunosBean(){
		alunosFiltrados = new ArrayList<Integer>();
		for(int i=0; i<50; i++){
			alunosFiltrados.add(i);
		}
	}
	
	
	public List<Integer> getAlunosFiltrados() {
		return alunosFiltrados;
	}
}

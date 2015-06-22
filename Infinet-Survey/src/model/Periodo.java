package model;

import java.io.Serializable;

public class Periodo implements Serializable{
	private static final long serialVersionUID = 1L;
	//GRUD no ManagerBean
	
	private Integer id;
	private String periodo;
	
	public Periodo(){
		
	}
	public Periodo(Integer id, String periodo) {
		super();
		this.id = id;
		this.periodo = periodo;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
	
	

}

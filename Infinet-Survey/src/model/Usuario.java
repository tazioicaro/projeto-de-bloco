package model;

public class Usuario extends Pessoa {
	
	private Integer id;
	private String perfil;
	private String login;
	private String senha;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Usuario(){
		
	}	
	
	public Usuario(Integer id, String perfil, String login, String senha) {
		super();
		this.id = id;
		this.perfil = perfil;
		this.login = login;
		this.senha = senha;
	}
	

}

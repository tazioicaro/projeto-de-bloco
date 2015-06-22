package model;

import java.io.Serializable;
import java.util.Calendar;

public class AberturaDeAvaliacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//GRUD ManagerBean
	private Integer id;
	private ModeloDeAvalicao modeloDeAvalicao;
	private Turma turma;
	private String objetivo;
	private Calendar dataInicio;
	private Calendar dataFim;
	private Calendar horaInicio;
	private Calendar horaFim;
	private String textoConvidativo;
	
	public AberturaDeAvaliacao(){
		
	}
	
	public AberturaDeAvaliacao(Integer id, ModeloDeAvalicao modeloDeAvalicao,
			Turma turma, String objetivo, Calendar dataInicio,
			Calendar dataFim, Calendar horaInicio, Calendar horaFim,
			String textoConvidativo) {
		super();
		this.id = id;
		this.modeloDeAvalicao = modeloDeAvalicao;
		this.turma = turma;
		this.objetivo = objetivo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.textoConvidativo = textoConvidativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ModeloDeAvalicao getModeloDeAvalicao() {
		return modeloDeAvalicao;
	}

	public void setModeloDeAvalicao(ModeloDeAvalicao modeloDeAvalicao) {
		this.modeloDeAvalicao = modeloDeAvalicao;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public Calendar getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Calendar horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Calendar getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Calendar horaFim) {
		this.horaFim = horaFim;
	}

	public String getTextoConvidativo() {
		return textoConvidativo;
	}

	public void setTextoConvidativo(String textoConvidativo) {
		this.textoConvidativo = textoConvidativo;
	}
	
	
	
	
	
	

}

package com.tatiane.GerenciaColaboradores.entities;

import java.io.Serializable;

public class Setor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id_setor;
	private String descricao;
	
	public Setor() {
		
	}

	public Setor(Long id_setor, String descricao) {
		super();
		this.id_setor = id_setor;
		this.descricao = descricao;
	}

	public Long getId_setor() {
		return id_setor;
	}

	public void setId_setor(Long id_setor) {
		this.id_setor = id_setor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

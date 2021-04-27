package com.tatiane.GerenciaColaboradores.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Setor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_setor;
	private String descricao;
	
	@JsonIgnore
	@OneToMany(mappedBy = "setor")
	public List<Pessoa> pessoas = new ArrayList<>();
	
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

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_setor == null) ? 0 : id_setor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Setor other = (Setor) obj;
		if (id_setor == null) {
			if (other.id_setor != null)
				return false;
		} else if (!id_setor.equals(other.id_setor))
			return false;
		return true;
	}

}

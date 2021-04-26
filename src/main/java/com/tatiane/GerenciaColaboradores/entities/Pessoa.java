package com.tatiane.GerenciaColaboradores.entities;

import java.io.Serializable;
import java.util.Date;

public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id_pessoa;
	private String cpf;
	private String nome;
	private String telefone;
	private String email;
	private Date dt_nascimento;
	
	public Pessoa() {
		
	}

	public Pessoa(Long id_pessoa, String cpf, String nome, String telefone, String email, Date dt_nascimento) {
		super();
		this.id_pessoa = id_pessoa;
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dt_nascimento = dt_nascimento;
	}

	public Long getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Long id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

}

package com.tatiane.GerenciaColaboradores.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatiane.GerenciaColaboradores.entities.Pessoa;
import com.tatiane.GerenciaColaboradores.repositories.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa buscarPessoa(Long id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		return pessoa.orElseThrow();
	}
	
}



////	public Conta findById(Long id) {
//		Optional<Conta> conta = contaRepository.findById(id);
//		return conta.orElseThrow(() -> new ObjectNotFoundException("Conta não encontrada!"));
//	}
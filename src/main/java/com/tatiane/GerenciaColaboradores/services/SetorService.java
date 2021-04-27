package com.tatiane.GerenciaColaboradores.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatiane.GerenciaColaboradores.entities.Setor;
import com.tatiane.GerenciaColaboradores.repositories.SetorRepository;

@Service
public class SetorService {

	@Autowired
	private SetorRepository setorRepository;
	
	public Setor buscarSetor(Long id) {
		Optional<Setor> setor = setorRepository.findById(id);
		return setor.orElseThrow();
	}	
}
package com.tatiane.GerenciaColaboradores.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatiane.GerenciaColaboradores.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}

package com.tatiane.GerenciaColaboradores.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tatiane.GerenciaColaboradores.entities.Pessoa;
import com.tatiane.GerenciaColaboradores.services.PessoaService;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping(value = "{id}/consultaPessoa")
	public ResponseEntity<Pessoa> buscarPessoa(@PathVariable Long id) {
		Pessoa pessoa = pessoaService.buscarPessoa(id);
		return ResponseEntity.ok().body(pessoa);
	}
}
package com.tatiane.GerenciaColaboradores.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tatiane.GerenciaColaboradores.entities.Setor;
import com.tatiane.GerenciaColaboradores.services.SetorService;

@RestController
@RequestMapping(value = "/setores")
public class SetorController {

	@Autowired
	private SetorService setorService;

	@GetMapping(value = "{id}/consultaSetor")
	public ResponseEntity<Setor> buscarSetor(@PathVariable Long id) {
		Setor setor = setorService.buscarSetor(id);
		return ResponseEntity.ok().body(setor);
	}
}
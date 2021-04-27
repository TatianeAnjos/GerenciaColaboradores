package com.tatiane.GerenciaColaboradores;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tatiane.GerenciaColaboradores.entities.Pessoa;
import com.tatiane.GerenciaColaboradores.entities.Setor;
import com.tatiane.GerenciaColaboradores.repositories.PessoaRepository;
import com.tatiane.GerenciaColaboradores.repositories.SetorRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private SetorRepository setorRepository;
	
	@Override
	public void run(String... args) throws Exception {

		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Date data = sdf.parse("23/11/2015");
		Setor s1 = new Setor(null,"Desenvolvimento");
		setorRepository.saveAll(Arrays.asList(s1));
		
		Pessoa p1 = new Pessoa(null, "12345678912", "Maria Carvalho", "11-999999999", "maria@gmail.com", new Date(),s1);
		pessoaRepository.saveAll(Arrays.asList(p1));
		
	}

}

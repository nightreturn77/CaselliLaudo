package br.com.caselliti.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.caselliti.entities.Proprietario;
import br.com.caselliti.repositories.ProprietarioRepository;

@Configuration
@Profile("test")
public class Test implements CommandLineRunner{
	
	@Autowired
	private ProprietarioRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Proprietario prop = new Proprietario();
		
		repository.saveAll(Arrays.asList(prop));
		
	}
	
	
	

}

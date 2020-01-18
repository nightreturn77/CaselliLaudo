package br.com.caselliti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caselliti.entities.Proprietario;
import br.com.caselliti.repositories.ProprietarioRepository;

@Service 
public class ProprietarioService {
	
	@Autowired
	private ProprietarioRepository repository;
	
	//metodo para inserir proprietario
	public void insert(Proprietario prop) { 
		repository.save(prop);
		
	}
	
	public List<Proprietario> findAll(){ 
		return repository.findAll();
	}
	
	
	public void delete(Long id) { 
		repository.deleteById(id);
	}
	


}

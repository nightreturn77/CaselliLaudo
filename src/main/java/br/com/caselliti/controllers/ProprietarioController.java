package br.com.caselliti.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caselliti.entities.Proprietario;
import br.com.caselliti.services.ProprietarioService;

@Controller
public class ProprietarioController {
	
	
	@Autowired
	private ProprietarioService service;
	
	
	@RequestMapping("/json")
	public ResponseEntity<List<Proprietario>> findAll(){
		List<Proprietario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@DeleteMapping("/json/{id}")
	public ResponseEntity <Void> delete(@PathVariable Long id){ 
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}

}

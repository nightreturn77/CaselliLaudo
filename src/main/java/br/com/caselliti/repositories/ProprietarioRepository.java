package br.com.caselliti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.caselliti.entities.Proprietario;

public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {

}

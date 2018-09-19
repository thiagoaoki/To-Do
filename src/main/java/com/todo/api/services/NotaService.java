package com.todo.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.api.domain.Nota;
import com.todo.api.repository.NotaRepository;

@Service
public class NotaService {

	@Autowired
	private NotaRepository repository;
	
	public List<Nota> findAll() {
		return repository.findAll();
	}

	public Nota save(Nota nota) {
		return repository.save(nota);
	}

	public String delete(Integer id) {	
		Optional<Nota> nota = repository.findById(id);
		if (nota == null) {
			return String.format("Nota com id: %d. Não Encontrada.", id);
		}
		
		repository.deleteById(id);
		
		return String.format("Nota com id: %d. Deletada Com Sucesso.", id); 
	}

}

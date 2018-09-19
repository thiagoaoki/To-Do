package com.todo.api.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.api.domain.ToDoDetalhe;
import com.todo.api.repository.ToDoDetalheRepository;

@Service
public class ToDoDetalheService {

	@Autowired
	private ToDoDetalheRepository repository;
	
	public List<ToDoDetalhe> findAll() {
		return repository.findAll();
	}

	public ToDoDetalhe save(@Valid ToDoDetalhe todoDetalhe) {
		return repository.save(todoDetalhe);
	}

	public String delete(Integer id) {		
		Optional<ToDoDetalhe> todo = repository.findById(id);
		if (todo == null) {
			String.format("To-Do-Detalhe com id: %d. Não Encontrado.", id);
		}
				
		repository.deleteById(id);
		
		return String.format("To-Do-Detalhe com id: %d. Não Encontrado. ", id); 	
	}
}

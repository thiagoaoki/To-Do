package com.todo.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.api.domain.ToDo;
import com.todo.api.repository.ToDoRepository;

@Service
public class ToDoService {

	@Autowired
	private ToDoRepository repository;
	
	public List<ToDo> findAll() {
		return repository.findAll();
	}

	public ToDo save(ToDo todo) {
		return repository.save(todo);
	}

	public String delete(Integer id) {
		Optional<ToDo> todo = repository.findById(id);
		if (todo == null) {
			String.format("To-Do com id: %d. Não Encontrado.", id);
		}
				
		repository.deleteById(id);
		
		return String.format("To-Do com id: %d. Não Encontrado. ", id); 
	}

}

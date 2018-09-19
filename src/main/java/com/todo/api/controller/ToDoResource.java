package com.todo.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.todo.api.domain.ToDo;
import com.todo.api.services.ToDoService;

@RestController
@RequestMapping("/todo")
public class ToDoResource {

	@Autowired
	private ToDoService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ToDo>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	public ResponseEntity<ToDo> save(@RequestBody @Valid ToDo todo) {
		return ResponseEntity.ok(service.save(todo));
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}") 
	public ResponseEntity<ToDo> update(@RequestBody @Valid ToDo todo, @PathVariable Integer id) {
		todo.setId(id);
		return ResponseEntity.ok(service.save(todo));
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}") 
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		return ResponseEntity.ok(service.delete(id));
	}
	
}

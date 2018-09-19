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

import com.todo.api.domain.ToDoDetalhe;
import com.todo.api.services.ToDoDetalheService;

@RestController
@RequestMapping("/tododetalhe")
public class ToDoDetalheResource {
	
	@Autowired
	private ToDoDetalheService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ToDoDetalhe>> findAll() {
		return ResponseEntity.ok(service.findAll());		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<ToDoDetalhe> save(@RequestBody @Valid ToDoDetalhe todoDetalhe) {
		return ResponseEntity.ok(service.save(todoDetalhe));		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public ResponseEntity<ToDoDetalhe> update(@RequestBody @Valid ToDoDetalhe todoDetalhe, @PathVariable Integer id) {
		todoDetalhe.setId(id);
		return ResponseEntity.ok(service.save(todoDetalhe));		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		return ResponseEntity.ok(service.delete(id));		
	}
}

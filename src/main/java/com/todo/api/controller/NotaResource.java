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

import com.todo.api.domain.Nota;
import com.todo.api.services.NotaService;

@RestController
@RequestMapping("/notas")
public class NotaResource {
	
	@Autowired 
	private NotaService notaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Nota>> findAll() {		
		return ResponseEntity.ok(notaService.findAll());
	}
	
	@RequestMapping(method = RequestMethod.POST) 
	public ResponseEntity<Nota> save(@RequestBody @Valid Nota nota) {
		return ResponseEntity.ok(notaService.save(nota));		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/{id}")
	public ResponseEntity<Nota> update(@RequestBody @Valid Nota nota, @PathVariable Integer id) {
		nota.setId(id);
		return ResponseEntity.ok(notaService.save(nota));
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id) {
		return ResponseEntity.ok(notaService.delete(id));
	}

}

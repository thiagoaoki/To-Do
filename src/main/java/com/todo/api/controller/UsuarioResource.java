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

import com.todo.api.domain.Usuario;
import com.todo.api.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Usuario> save(@RequestBody @Valid Usuario usuario) {
		return ResponseEntity.ok(service.save(usuario));
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public ResponseEntity<Usuario> update(@RequestBody @Valid Usuario usuario, @PathVariable("id") Integer id) {
		usuario.setId(id);
		return ResponseEntity.ok(service.update(usuario));
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
		return ResponseEntity.ok(service.delete(id));
	}

}

package com.todo.api.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.api.domain.Usuario;
import com.todo.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;

	public List<Usuario> findAll() {
		return repository.findAll();
	}

	public Usuario save(@Valid Usuario usuario) {
		return repository.save(usuario);
	}

	public Usuario update(@Valid Usuario usuario) {
		return repository.save(usuario);
	}

	public String delete(Integer id) {
		Optional<Usuario> usuario = repository.findById(id);
		if (usuario == null) {
			return String.format("Usuário com id: %d. Não Encontrado.", id);
		}
		
		repository.deleteById(id);
		
		return String.format("Usuário com id: %d. Deletado com Sucesso.", id); 
	}

}

package com.todo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.api.domain.ToDoDetalhe;

public interface ToDoDetalheRepository extends JpaRepository<ToDoDetalhe, Integer>{

}

package com.todo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.api.domain.Nota;

public interface NotaRepository extends JpaRepository<Nota, Integer>{

}

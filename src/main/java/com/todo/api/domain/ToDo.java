package com.todo.api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class ToDo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GEN_TODO")
	private Integer id;
	private String texto;
	
	public ToDo() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", texto=" + texto + "]";
	}
		
}

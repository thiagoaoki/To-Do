package com.todo.api.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "todo_detalhe")
public class ToDoDetalhe implements Serializable {
	
	private static final long serialVersionUID = -4140506167812698569L;

	@Id
	@SequenceGenerator(name="gen_tododetalhe", sequenceName="gen_tododetalhe" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="gen_tododetalhe")
	private Integer id;
	
	private LocalDate data;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ToDoDetalhe [id=" + id + ", data=" + data + "]";
	}
	
}

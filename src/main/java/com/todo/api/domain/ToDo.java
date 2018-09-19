package com.todo.api.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class ToDo implements Serializable {
		
	private static final long serialVersionUID = 1712862394672503445L;
	
	@Id
	@SequenceGenerator(name="gen_todo", sequenceName="gen_todo" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="gen_todo")
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

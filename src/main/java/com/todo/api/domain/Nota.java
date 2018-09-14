package com.todo.api.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "nota")
public class Nota implements Serializable{
	
	private static final long serialVersionUID = 5380119726184160498L;
	
	@Id
	@SequenceGenerator(name="gen_nota", sequenceName="gen_nota" )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="gen_nota")	
	private Integer id;
	private String texto;
	
	public Nota() {
		
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
		return "Nota [id=" + id + ", texto=" + texto + "]";
	}
	
}

package com.todo.api.domain;

public class ToDo {
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
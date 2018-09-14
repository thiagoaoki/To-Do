package com.todo.api.domain;

import java.util.Date;

public class ToDoDetalhe {
	private Integer id;
	private Date data;
	private ToDo todo;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public ToDo getTodo() {
		return todo;
	}
	
	public void setTodo(ToDo todo) {
		this.todo = todo;
	}

	@Override
	public String toString() {
		return "ToDoDetalhe [id=" + id + ", data=" + data + "]";
	}
	
}

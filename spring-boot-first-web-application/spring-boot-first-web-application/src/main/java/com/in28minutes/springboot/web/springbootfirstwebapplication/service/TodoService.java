package com.in28minutes.springboot.web.springbootfirstwebapplication.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.in28minutes.springboot.web.springbootfirstwebapplication.model.Todo;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	static {
		todos.add(new Todo(1, "admin", "Learn Spring MVC", new Date(), false));
		todos.add(new Todo(2, "admin", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "admin", "Learn Hibernate", new Date(), false));
	}

	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user)) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
	}

	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}

	public Todo getTodo(int id) {
		return todos.stream().filter(todo -> todo.getId() == id).findAny().orElse(null);
	}

	public void updateTodo(@Valid Todo todo) {
		for (int i = 0; i < todos.size(); i++) {
			if (todos.get(i).getId() == todo.getId()) {
				todos.set(i, todo);
				break;
			}
		}
		System.out.println(todos);
	}
}
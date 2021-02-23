package com.in28minutes.springboot.web.springbootfirstwebapplication.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.springbootfirstwebapplication.model.Todo;
import com.in28minutes.springboot.web.springbootfirstwebapplication.service.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	@Autowired
	private TodoService todoService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
	}

	@GetMapping(path = "/list-todos")
	public String listTodos(ModelMap map) {
		String name = getLoggedInUser(map);
		map.addAttribute("todos", todoService.retrieveTodos(name));
		return "list-todo";
	}

	@GetMapping(path = "/add-todo")
	public String getAddTodoPage(ModelMap map) {
		map.addAttribute("todo", new Todo());
		return "add-todo";
	}

	@PostMapping(path = "/add-todo")
	public String addTodo(ModelMap map, @Valid @ModelAttribute("todo") Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "add-todo";
		}
		String name = getLoggedInUser(map);
		todoService.addTodo(name, todo.getDesc(), todo.getTargetDate(), todo.isDone());
		return "redirect:/list-todos";
	}

	private String getLoggedInUser(ModelMap map) {
		return (String) map.get("name");
	}

	@GetMapping(path = "/delete-todo")
	public String deleteTodo(@RequestParam("id") int id) {
		todoService.deleteTodo(id);
		return "redirect:/list-todos";
	}

	@GetMapping(value = "/update-todo")
	public String getUpdateTodoPage(ModelMap map, @RequestParam("id") int id) {
		Todo todo = todoService.getTodo(id);
		map.addAttribute("todo", todo != null ? todo : new Todo());
		return "add-todo";
	}

	@PostMapping(value = "/update-todo")
	public String updateTodo(@Valid @ModelAttribute("todo") Todo todo, BindingResult result, ModelMap map) {
		if (result.hasErrors()) {
			return "add-todo";
		}
		String user = map.get("name").toString();

		todo.setUser(user);

		todo.setTargetDate(new Date());
		todoService.updateTodo(todo);
		return "redirect:/list-todos";
	}
}

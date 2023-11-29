package test.service;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {
  public static void main(String[] args) {
    testRemoveTodoList();
  }

  public static void testShowTodoList() {
    TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
    todolistRepository.todos[0] = new Todolist("Belajar Java Dasar");
    todolistRepository.todos[1] = new Todolist("Belajar Java OOP");
    todolistRepository.todos[2] = new Todolist("Belajar Java Generic");
    TodolistService todolistService = new TodolistServiceImpl(todolistRepository);

    todolistService.showTodoList();

  }

  public static void testAddTodoList() {
    TodolistRepositoryImpl todolistRepositoryImpl = new TodolistRepositoryImpl();
    TodolistService todolistService = new TodolistServiceImpl(todolistRepositoryImpl);

    todolistService.addTodo("Belajar Java Dasar");
    todolistService.addTodo("Belajar Java OOP");
    todolistService.addTodo("Belajar Java Standard Classes");

    todolistService.showTodoList();
  }

  public static void testRemoveTodoList() {
    TodolistRepositoryImpl todolistRepositoryImpl = new TodolistRepositoryImpl();
    TodolistService todolistService = new TodolistServiceImpl(todolistRepositoryImpl);

    todolistService.addTodo("Belajar Java Dasar");
    todolistService.addTodo("Belajar Java OOP");
    todolistService.addTodo("Belajar Java Standard Classes");

    todolistService.showTodoList();

    todolistService.removeTodo(2);
    todolistService.removeTodo(10);

    todolistService.showTodoList();
  }
}

package test.view;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

public class TodolistViewTest {
  public static void main(String[] args) {
    testRemoveTodoList();
  }

  public static void testShowTodoList() {
    TodolistRepository todolistRepository = new TodolistRepositoryImpl();
    TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
    TodolistView view = new TodolistView(todolistService);

    todolistService.addTodo("Belajar java dasar");
    todolistService.addTodo("Belajar java OOP");
    todolistService.addTodo("Belajar java Standard Classes");

    view.showTodoList();
  }

  public static void testAddTodoList() {
    TodolistRepository todolistRepository = new TodolistRepositoryImpl();
    TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
    TodolistView view = new TodolistView(todolistService);

    view.addTodo();

    todolistService.showTodoList();
  }

  public static void testRemoveTodoList() {
    TodolistRepository todolistRepository = new TodolistRepositoryImpl();
    TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
    TodolistView view = new TodolistView(todolistService);

    todolistService.addTodo("Belajar java dasar");
    todolistService.addTodo("Belajar java OOP");
    todolistService.addTodo("Belajar java Standard Classes");

    view.removeTodo();

    todolistService.showTodoList();

  }
}

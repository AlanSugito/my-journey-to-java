package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService {

  private TodolistRepository todolistRepository;

  public TodolistServiceImpl(TodolistRepository todolistRepository) {
    this.todolistRepository = todolistRepository;
  }

  @Override
  public void showTodoList() {
    Todolist[] todos = todolistRepository.getAll();

    System.out.println("Todos: ");
    for (int i = 0; i < todos.length; i++) {
      var todolist = todos[i];
      int num = i + 1;

      if (todolist != null) {
        System.out.println(num + ". " + todolist.getTodo());
      }

    }
  }

  @Override
  public void addTodo(String todo) {
    Todolist newTodo = new Todolist(todo);
    todolistRepository.add(newTodo);
    System.out.println("Successfully added new Todo: " + todo);
  }

  @Override
  public void removeTodo(Integer number) {
    Todolist[] todolists = todolistRepository.getAll();
    String todo = todolists[number - 1].getTodo();

    boolean removeIsSuccess = todolistRepository.remove(number);

    if (!removeIsSuccess) {
      System.out.println("Failed to remove Todo!");
      return;
    }

    System.out.println("Successfully removed Todo!: " + todo);

  }
}

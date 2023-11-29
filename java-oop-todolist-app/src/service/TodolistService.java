package service;

public interface TodolistService {
  void showTodoList();

  void addTodo(String todo);

  void removeTodo(Integer number);
}

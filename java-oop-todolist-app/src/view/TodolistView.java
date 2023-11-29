package view;

import service.TodolistService;
import util.InputUtil;

public class TodolistView {

  private TodolistService todolistService;

  public TodolistView(TodolistService todolistService) {
    this.todolistService = todolistService;
  }

  private void showMenu() {
    System.out.println("Menu: ");
    System.out.println("1. Tambah: ");
    System.out.println("2. Hapus: ");
    System.out.println("x. keluar: ");
  }

  public void showTodoList() {
    while (true) {
      System.out.println("==============================");
      todolistService.showTodoList();
      System.out.println("==============================");
      showMenu();
      String operation = InputUtil.input("Pilih");

      if (operation.equals("1")) {
        addTodo();
      } else if (operation.equals("2")) {
        removeTodo();
      } else if (operation.equals("x")) {
        break;
      } else {
        System.out.println("Unknown operation");
      }
    }
  }

  public void addTodo() {
    System.out.println("Add your new Todo, type x for cancel: ");
    String todo = InputUtil.input("Todo");

    if (todo.equals("x")) {
      return;
    }

    todolistService.addTodo(todo);
  }

  public void removeTodo() {
    System.out.println("Remove todo, type x to cancel");

    String data = InputUtil.input("Todo Number");

    if (data.equals("x")) {
      return;
    }

    Integer number = Integer.parseInt(data);

    todolistService.removeTodo(number);
  }
}

package repository;

import entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository {

  public Todolist[] todos = new Todolist[10];

  public boolean isFull() {
    boolean isTodoFull = true;
    for (var value : todos) {
      if (value == null) {
        isTodoFull = false;
        break;
      }
    }

    return isTodoFull;
  }

  private void resizeStorage() {
    Todolist[] temp = todos;
    todos = new Todolist[todos.length * 2];
    for (int i = 0; i < temp.length; i++) {
      todos[i] = temp[i];
    }
  }

  @Override
  public void add(Todolist todo) {
    if (isFull()) {
      resizeStorage();
    }

    for (int i = 0; i < todos.length; i++) {
      if (todos[i] == null) {
        todos[i] = todo;
        break;
      }
    }

  }

  @Override
  public Todolist[] getAll() {
    // TODO Auto-generated method stub
    return todos;
  }

  @Override
  public boolean remove(Integer number) {
    // TODO Auto-generated method stub
    if ((number - 1) > todos.length) {
      return false;
    }

    if (todos[number - 1] == null) {
      return false;
    }

    for (int i = (number - 1); i < todos.length; i++) {
      if (i == (todos.length - 1)) {
        todos[i] = null;
      } else {
        todos[i] = todos[i + 1];
      }
    }

    return true;
  }

}

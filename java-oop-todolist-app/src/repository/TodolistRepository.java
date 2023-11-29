package repository;

import entity.Todolist;

public interface TodolistRepository {

  Todolist[] getAll();

  void add(Todolist todo);

  boolean remove(Integer number);
}

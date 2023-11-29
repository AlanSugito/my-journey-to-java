package entity;

public class Todolist {

  private String todo;

  public Todolist() {
    todo = null;
  }

  public Todolist(String todo) {
    this.todo = todo;
  }

  public String getTodo() {
    return todo;
  }

  public void setTodo(String todo) {
    this.todo = todo;
  }

}

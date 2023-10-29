package main.java.com.javaoop;

class person {
  public String name;

  Person(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println(this.name + " is Eating a sandwich");
  }
}
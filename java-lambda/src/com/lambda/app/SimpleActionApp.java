package app;

import interfaces.SimpleAction;

public class SimpleActionApp {
  public static void main(String[] args) {
    // Traditional way
    // SimpleAction simpleAction1 = new SimpleAction() {
    // public String action() {
    // return "Alan";
    // }
    // };

    // // Lambda way
    // SimpleAction simpleAction2 = () -> {
    // return "Alan";
    // };

    // lambda with parameter type
    SimpleAction simpleAction1 = (String name) -> {
      return "Hello " + name;
    };

    // lambda without parameter type
    SimpleAction simpleAction2 = (name) -> {
      return "Hello " + name;
    };

    // lambda without curly braces
    SimpleAction simpleAction3 = name -> "Hello " + name;

    System.out.println(simpleAction1.action("Alan Sugito"));
    System.out.println(simpleAction2.action("Julia Choi"));
    System.out.println(simpleAction3.action("Evie"));
  }

}

package com.javatodolist;

import java.util.Scanner;

public class Main {

    public static String[] todos = new String[10];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodos();
    }

    public static void testShowTodos() {
        todos[0] = "Belajar java";
        todos[1] = "Belajar bikin aplikasi java";
        showTodos();
    }

    public static void testAddTodo() {
        for (int i = 0; i < 25; i++) {
            addTodo("Belajar java ke " + i);
        }
        showTodos();
    }

    public static void testInput() {
        String name = input("Name");
        System.out.println("Hi, " + name);
    }

    public static void testRemoveTodo() {
        for (int i = 0; i < 10; i++) {
            addTodo("Belajar java ke " + i);
        }
        showTodos();
        boolean isSuccess = removeTodo(2);
        if (isSuccess) {
            System.out.println("todo removed");
        } else {
            System.out.println("todo remove failed");
        }
        showTodos();
    }

    public static String input(String info) {
        System.out.print(info + ": ");
        String data = scanner.nextLine();
        return data;
    }

    public static void showTodos() {
        for (int i = 0; i < todos.length; i++) {
            String todo = todos[i];
            int num = i + 1;

            if (todo != null) {
                System.out.println(num + ". " + todo);
            }

        }
    }

    public static void addTodo(String todo) {
        boolean isTodoFull = true;
        for (String value : todos) {
            if (value == null) {
                isTodoFull = false;
                break;
            }
        }

        if (isTodoFull) {
            String[] temp = todos;
            todos = new String[todos.length * 2];
            for (int i = 0; i < temp.length; i++) {
                todos[i] = temp[i];
            }
        }

        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = todo;
                break;
            }
        }
    }

    public static boolean removeTodo(Integer number) {
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

    public static void viewShowTodos() {
        while (true) {
            System.out.println("=================");
            System.out.println("Your Todos: ");
            showTodos();
            System.out.println("=================");

            System.out.println("Menu: ");
            System.out.println("1. Tambah: ");
            System.out.println("2. Hapus: ");
            System.out.println("3. keluar: ");

            String operation = input("Pilih");

            if (operation.equals("1")) {
                viewAddTodo();
            } else if (operation.equals("2")) {
                viewRemoveTodo();
            } else if (operation.equals("3")) {
                break;
            } else {
                System.out.println("Operasi salah!");
            }
        }
    }

    public static void viewAddTodo() {
        System.out.println("Masukan todo");
        String todo = input("Todo");

        addTodo(todo);
    }

    public static void viewRemoveTodo() {
        System.out.println("Hapus todo");

        Integer number = Integer.parseInt(input("Nomor"));

        boolean isSuccess = removeTodo(number);
        if (isSuccess) {
            System.out.println("Todo berhasil dihapus");
        } else {
            System.out.println("Todo gagal dihapus");
        }

    }
}
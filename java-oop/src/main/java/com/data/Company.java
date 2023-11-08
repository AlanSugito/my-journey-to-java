package com.data;

public class Company {
  // kita juga bisa membuat inner class
  // yaitu class yang di buat didalam class
  // inner class hanya bisa dibuat pada object outer classnya

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Company(String name) {
    this.name = name;
  }

  public class Employee { // employee adalah inner class dari Company
    private String name;

    public Employee(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getCompany() {
      return Company.this.name; // inner class dapat mengakses field outer classnya dengan menyematkan nama
                                // outer class sebelum kata this
    }

  }

}

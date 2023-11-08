package com.applications;

import com.data.Company;

public class CompanyApplication {
  public static void main(String[] args) {
    // membuat object dari inner class
    Company company = new Company("Cooli"); // buat dulu object class outernya

    Company.Employee employee = company.new Employee("Joe"); // inner class bisa diakses

    System.out.println(company.getName());
    System.out.println(employee.getName());
    System.out.println(employee.getCompany());

  }
}

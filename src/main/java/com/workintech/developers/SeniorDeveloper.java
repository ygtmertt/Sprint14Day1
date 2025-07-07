package com.workintech.developers;

public class SeniorDeveloper extends Employee {

  public SeniorDeveloper(int id, String name, int salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    setSalary(getSalary() + 3000);
    System.out.println("Senior Developer is designing architecture. New salary: " + getSalary());
  }
}

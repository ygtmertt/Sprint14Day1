package com.workintech.developers;

public class MidDeveloper extends Employee {

  public MidDeveloper(int id, String name, int salary) {
    super(id, name, salary);
  }

  @Override
  public void work() {
    setSalary(getSalary() + 2000);
    System.out.println("Mid Developer is developing. New salary: " + getSalary());
  }
}

package com.workintech.developers;

public class HRManager extends Employee {

  private JuniorDeveloper[] juniorDevelopers;
  private MidDeveloper[] midDevelopers;
  private SeniorDeveloper[] seniorDevelopers;

  public HRManager(int id, String name, int salary) {
    super(id, name, salary);
    juniorDevelopers = new JuniorDeveloper[3];
    midDevelopers = new MidDeveloper[3];
    seniorDevelopers = new SeniorDeveloper[3];
  }

  // JuniorDeveloper ekleme
  public void addEmployee(JuniorDeveloper developer) {
    boolean added = false;
    for (int i = 0; i < juniorDevelopers.length; i++) {
      if (juniorDevelopers[i] == null) {
        juniorDevelopers[i] = developer;
        System.out.println(developer.getName() + " added to Junior Developers.");
        added = true;
        break;
      }
    }
    if (!added) {
      System.out.println("No empty slot in Junior Developers array. Cannot add " + developer.getName());
    }
  }

  // MidDeveloper ekleme
  public void addEmployee(MidDeveloper developer) {
    boolean added = false;
    for (int i = 0; i < midDevelopers.length; i++) {
      if (midDevelopers[i] == null) {
        midDevelopers[i] = developer;
        System.out.println(developer.getName() + " added to Mid Developers.");
        added = true;
        break;
      }
    }
    if (!added) {
      System.out.println("No empty slot in Mid Developers array. Cannot add " + developer.getName());
    }
  }

  // SeniorDeveloper ekleme
  public void addEmployee(SeniorDeveloper developer) {
    boolean added = false;
    for (int i = 0; i < seniorDevelopers.length; i++) {
      if (seniorDevelopers[i] == null) {
        seniorDevelopers[i] = developer;
        System.out.println(developer.getName() + " added to Senior Developers.");
        added = true;
        break;
      }
    }
    if (!added) {
      System.out.println("No empty slot in Senior Developers array. Cannot add " + developer.getName());
    }
  }

  @Override
  public void work() {
    setSalary(getSalary() + 1500);
    System.out.println("HR Manager is managing developers. New salary: " + getSalary());
  }
}

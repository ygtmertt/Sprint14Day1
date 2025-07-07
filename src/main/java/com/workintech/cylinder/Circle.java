package com.workintech.cylinder;

public class Circle {

  private double radius;

  public Circle(double radius) {
    if(radius >= 0) {
      setRadius(radius);
    }
    else {
      setRadius(0);
    }
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}

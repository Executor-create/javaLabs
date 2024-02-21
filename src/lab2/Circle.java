package src.lab2;

public class Circle extends Shape {
  private double r;

  public Circle(double r) {
    this.r = r;
  }

  @Override
  public double getArea() {
    return Math.PI * r * r;
  }
}

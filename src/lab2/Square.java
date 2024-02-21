package src.lab2;

public class Square extends Shape {
  private double a;

  public Square(double a) {
    this.a = a;
  }

  @Override
  public double getArea() {
    return Math.pow(a, 2);
  }
}

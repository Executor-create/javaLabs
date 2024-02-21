package src.lab2;

import java.util.Scanner;
import java.util.logging.Logger;
import src.LoggerUtil;

public class Main {
  private static Logger logger = LoggerUtil.getLogger();
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    logger.info("Enter the length of the side of the square: ");
    double sideLength = scanner.nextDouble();
    Square s = new Square(sideLength);
    logger.info("Square area: " + s.getArea());

    logger.info("Enter radius of circle: ");
    double radius = scanner.nextDouble();
    Circle c = new Circle(radius);
    logger.info("Radius of circle: " + c.getArea());

    scanner.close();
  }
}

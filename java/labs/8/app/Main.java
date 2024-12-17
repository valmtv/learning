package app;

import shapes.Polygon;
import algorithms.GeometryAlgorithms;

public class Main {
  public static void main(String[] args) {
    Polygon square = new Polygon(2.0, 2.0, 2.0, 2.0); 
    System.out.println(square.isRegular() + " " + GeometryAlgorithms.calcArea(square));
    Polygon triangle = new Polygon(
      new double[]{0, 0},
      new double[]{1, 0},
      new double[]{0.5, 0.5}
    );
    System.out.println(triangle);
  }
}

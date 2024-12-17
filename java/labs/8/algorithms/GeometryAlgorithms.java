package algorithms;

import shapes.Polygon;
import static java.lang.Math.*;

public class GeometryAlgorithms {
  private GeometryAlgorithms() {}

  public static boolean isRegular(Polygon polygon) {
    double[] edges = polygon.getEdges();
    for (double edge: edges) {
      if (Double.doubleToLongBits(edge) !=  Double.doubleToLongBits(edges[0])) {
        return false;
      }
    }
    return true;
  }
  public static double calcArea(Polygon polygon) {
    if(!polygon.isRegular()) return 0; 
    double[] edges = polygon.getEdges();
    int n = edges.length;
    double a = edges[0];
    return (n * a * a) / (4 * tan(PI / n));
  }
  public static double[] getEdges(double[][] points) {
    int n = points.length;
    double[] edges = new double[n];
    for (int i = 0; i < n; i++) {
      double x1 = points[i][0], y1 = points[i][1];
      double x2 = points[(i + 1) % n][0], y2 = points[(i + 1) % n][1];
      edges[i] = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }
    return edges;
  }
}


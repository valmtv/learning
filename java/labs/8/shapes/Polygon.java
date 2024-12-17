package shapes;

import algorithms.GeometryAlgorithms;
import util.ArrayUtils;

public class Polygon {
  public double[] edges;
  public boolean isRegular = false;
  
  public Polygon(double... edges) {
    assert ArrayUtils.areAllPositive(edges) : "not positive";
    this.edges = edges.clone();
    this.isRegular = GeometryAlgorithms.isRegular(this); 
  }

  public Polygon(double[]... points) {
    assert ArrayUtils.arePoints(points) : "not a 2d array"; 
    this.edges = GeometryAlgorithms.getEdges(points);
    this.isRegular = GeometryAlgorithms.isRegular(this);
  }
  public double[] getEdges() {
    return edges;
  }
  public boolean isRegular() {
    return isRegular;
  }
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Polygon polygon = (Polygon) obj;
    return java.util.Arrays.equals(edges, polygon.edges);
  }  
  public String toString() {
    return "This polygon with edges: " + java.util.Arrays.toString(edges) +
      (isRegular ? " is regular" : " is not regular");
  }

}

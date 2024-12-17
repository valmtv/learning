package util;

public class ArrayUtils {
  private ArrayUtils() {
  }
  public static boolean areAllPositive(double[] array) {
    for (double num: array) {
      if (num < 0) return false;
    }
    return true;
  }
  public static boolean arePoints(double[][] array) {
    for (double[] row: array) {
      if (row.length != 2) return false; 
    }
    return true;
  }
}

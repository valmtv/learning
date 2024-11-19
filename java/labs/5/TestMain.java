import java.io.*;
import java.util.Arrays;

public class TestMain {
  public static void main(String[] args) {
    System.out.println("Number of students: ");
    StringBuilder xmlData = new StringBuilder();

    try (BufferedReader reader = new BufferedReader(new FileReader("./input.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        xmlData.append(line);
      }
    } catch (Throwable e) {
      System.out.println("Error reading file: ");
      return;
    }

    StudentReader studentReader = new StudentReader(xmlData.toString());

    int numberOfStudents = studentReader.countStudents();
    System.out.println("Number of students: " + numberOfStudents);

    Student[] students = studentReader.getStudents();
    System.out.println("Students array: " + Arrays.toString(students));

    String studentNames = studentReader.getStudentsNames();
    System.out.println(studentNames);
  }
}


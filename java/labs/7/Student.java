import java.util.Arrays;


public class Student {
  private String name;
  private double grades[][];
  public Student(String name, double grades[][]) {
    this.name = name;
    this.grades = new double[grades.length][];
    for (int i = 0; i < grades.length; i++) {
      this.grades[i] = grades[i].clone();
    }
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double[][] getGrades() {
    return grades;
  }
  public void addGrade(String subject, double grade) {
    int index = GradeSystem.indexOfSubject(subject);
    if (index == -1) {
      System.out.println("no subject");
      return;
     }
     double[] newRow = Arrays.copyOf(grades[index], grades[index].length + 1);
     newRow[newRow.length - 1] = grade;
     grades[index] = newRow;
  } 
  public void sortGrades() {
    for (double[] row: grades) {
      Arrays.sort(row);
    }
  }
  public String toString() {
    StringBuilder result = new StringBuilder("Student " + name + " has grades:" + System.lineSeparator());
    String[] subjects = GradeSystem.SUBJECTS;
    for (int i = 0; i < grades.length; i++) {
      result.append(subjects[i]).append(": ");
      result.append(Arrays.toString(grades[i]).replaceAll("[\\[\\]]", ""));
      result.append(System.lineSeparator());
    }
    return result.toString(); 
  }
  public double[] getAverageGrades() {
    double[] averages = new double[grades.length];  
    for (int i = 0; i < grades.length; i++) {
      averages[i] = Arrays.stream(grades[i]).average().orElse(0);
    }
    return averages;
  }
  public String bestSubject() {
     double[] avg = getAverageGrades();
     int bestIndex = 0;
     for (int i = 0; i < avg.length; i++) {
       if(avg[i] > avg[bestIndex]) {
         bestIndex = i; 
       }
     }
     return GradeSystem.SUBJECTS[bestIndex];
  }

}

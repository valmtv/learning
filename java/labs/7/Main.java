public class Main {
  public static void main(String[] args) {
    double[][] grades1 = {{3.5, 4.5}, {3.5, 5.0, 4.5}, {4.0}};
    double[][] grades2 = {{4.5, 4.5}, {3.5, 4.0, 4.5}, {3.0, 4.5}};
    Student student1 = new Student("John", grades1);
    Student student2 = new Student("Max", grades2);
    System.out.println(student1);
    System.out.println("sorting");
    student1.sortGrades();
    System.out.println(student1);
    student1.addGrade("Biology", 5.0);
    System.out.println(student1);

    GradeSystem system = new GradeSystem(student1, student2);
    System.out.println("best subject for " + student1.getName() + ": " + student1.bestSubject());
  }
}

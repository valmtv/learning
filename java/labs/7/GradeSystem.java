public class GradeSystem {
  private Student[] students = new Student[10];
  private byte studentNumber = 0;
  public static final String[] SUBJECTS = {"Math", "Biology", "Chemistry", "Physics"};
  public GradeSystem(Student... students) {
    this.studentNumber = (byte) Math.min(students.length, 10);
    for (int i = 0; i < studentNumber; i++) {
      this.students[i] = students[i];
    }
  }    
  public static int indexOfSubject(String subject) {
     for(int i = 0; i < SUBJECTS.length; i++) {
       if (SUBJECTS[i].equals(subject)) {
         return i;
       }
     }
     return -1;
  }
}

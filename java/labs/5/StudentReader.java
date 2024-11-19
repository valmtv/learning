import java.util.ArrayList;
import java.util.Arrays;

class StudentReader {
  public static final String[] LABEL_START = {"<name>", "<gpa>"};
  public static final String[] LABEL_END = {"</name>", "</gpa>"};
  public static final String START_STUDENT = "student ";
  public String input;
  public Student[] list;
  StudentReader(String input) {
    this.input = input;
  }
  public int countStudents() {
    int count = 0;
    int index = 0;
    while (true) {
      index = input.indexOf(START_STUDENT, index);
      if (index == -1) break;
      count++;
      index += START_STUDENT.length();
    }
    return count;
  }
  public Student[] getStudents() {
    int studentCount = countStudents(); 
    var studentsList = new Student[studentCount];
    int leftIndex, rightIndex;
    int currentIndex = 0;
    for (int i = 0; i < studentCount; i++) {
      leftIndex = input.indexOf(START_STUDENT, currentIndex) + START_STUDENT.length() + 4;
      rightIndex = input.indexOf("\"", leftIndex);
      int id = Integer.parseInt(input.substring(leftIndex, rightIndex));

      leftIndex = input.indexOf(LABEL_START[0], currentIndex) + LABEL_START[0].length();
      rightIndex = input.indexOf(LABEL_END[0], leftIndex);
      String name = input.substring(leftIndex, rightIndex);

      leftIndex = input.indexOf(LABEL_START[1], currentIndex) + LABEL_START[1].length();
      rightIndex = input.indexOf(LABEL_END[1], leftIndex);
      double gpa = Double.parseDouble(input.substring(leftIndex, rightIndex));
      list[i] = new Student(id, name, gpa);
      currentIndex = rightIndex;
    }
    return list;
  }
  public String getStudentsNames() {
    StringBuilder studentsNames = new StringBuilder("Students are: ");
    for(Student student: list) {
      studentsNames.append(student.name());
    }
    return studentsNames.toString();
  }

}

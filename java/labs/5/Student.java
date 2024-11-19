public record Student(int id, String name, double gpa) {
  public Student {
    if(name == null || name.isEmpty()) {
      name = "Empty Student";
    }
  }
}


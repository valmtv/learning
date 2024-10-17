import java.time.LocalDate;
import java.time.DayOfWeek;
public class TestMain {
  public static void main(String[] args) {
    Person[] persons = new Person[4];
    persons[0] = new Person(1, "John", "Doe", 1.80, LocalDate.of(1991, 3, 29));
    persons[1] = new Person(2, "Jane", "Doe", 1.70, LocalDate.of(1991, 2, 2));
    persons[2] = new Person(3, "Jack", "Doe", 1.60, LocalDate.of(1992, 3, 3));
    persons[3] = new Person(4, "Jill", "Doe", 1.50, LocalDate.of(1993, 4, 4));

    CheckPerson.printPersonDays(persons, DayOfWeek.FRIDAY);
  }
}

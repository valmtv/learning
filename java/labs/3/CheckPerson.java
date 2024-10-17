import java.time.LocalDate;
import java.time.DayOfWeek;

public class CheckPerson {
  public static final int ADULT_AGE = 18;

  public static int getAge(Person p) {
    LocalDate now = LocalDate.now();
    int age = now.until(p.getBirthday()).getYears();
    return age;
  }


  public static DayOfWeek getBirthdayDay(Person p, int year) {
    LocalDate birthday = p.getBirthday();
    LocalDate birthdayInYear = birthday.plusYears(year - birthday.getYear());
    return birthdayInYear.getDayOfWeek();
  }

  public static void printPersonDays(Person[] persons, DayOfWeek day) {
    boolean found = false;
    for (Person p : persons) {
      if (p.getBirthday().getDayOfWeek() == day) {
        System.out.println(p);
        found = true;
      }
    }
    if (!found) {
      System.out.println("No Person");
    }
  }
}

import java.time.LocalDate;


public class Person {
  private int id;
  private String name;
  private String familyName;
  private double height;
  private final LocalDate birthday;

  public Person(int id, String name, String familyName, double height, LocalDate birthday) {
    this.id = id;
    this.name = name;
    this.familyName = familyName;
    this.height = height;
    this.birthday = birthday;
  }
  public Person() {
    this.id = 0;
    this.name = null;
    this.familyName = null;
    this.height = 0;
    this.birthday = null;
  }

  public void setId(int id) {
    this.id = id;
  } 
  public int getId() {
    return this.id;
  } 
  public void setName(String name) {
    this.name = name;
  } 
  public String getName() {
    return this.name;
  } 
  public void setFamilyName(String fName) {
    this.familyName = fName;
  } 
  public String getFamilyName() {
    return this.familyName;
  } 
  public void setHeight(double height) {
    this.height = height; 
  } 
  public double getHeight() {
    return this.height;
  } 
  public LocalDate getBirthday() {
    return this.birthday;
  } 
  public String toString() {
    return "This person is: name: " + this.name + ", familyname: " + this.familyName + ", height: " + this.height + ", birthday: " + this.birthday;
  }
  public boolean equals(Person p) {
    if (
          this.id == p.getId() &&
          this.name.equals(p.getName()) && 
          this.familyName.equals(p.getFamilyName()) &&
          Double.doubleToLongBits(this.height) == Double.doubleToLongBits(p.getHeight()) && 
          this.birthday.equals(p.getBirthday())
        ) {
          return true;
        }
        return false;
  }
}


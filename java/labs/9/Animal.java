/**
 * This is the abstract class for all animals.
 * It contains the name and speed of the animal.
 */
public abstract class Animal {
  private String name;
  private double speed;
  
  /**
   * Constructor for the Animal class.
   * @param name The name of the animal.
   * @param speed The speed of the animal.
   */
  public Animal(String name, double speed) {
    this.name = name;
    this.speed = speed;
  }
  
  /**
   * getter for the name of the animal.
   * @return The name of the animal.
   */
  public String getName() {
    return this.name;
  }
  /**
   * getter for the speed of the animal.
   * @return The speed of the animal.
   */
  public double getSpeed() {
    return this.speed;
  }
  /**
   * setter for the name of the animal.
   * @param name The name of the animal.
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * setter for the speed of the animal.
   * @param speed The speed of the animal.
   */
  public void setSpeed(double speed) {
    this.speed = speed;
  }

  /**
   * checks if current species is protected
   * @return true if the animal is protected, false otherwise 
   */
  public boolean isProtected() {
    for (String protectedAnimal : AnimalUtil.PROTECTED_ANIMALS) {
      if (name.equalsIgnoreCase(protectedAnimal)) {
        return true;
      }
    }
    return false;
  }
  /**
   * Abstract method that gives the sound of the animal.
   * @return The sound of the animal.
   */
  public abstract String givesSound();
}

/**
 * class representing a cat, subclass of Animal
 */
public class Cat extends Animal {
  private String kind;

  /**
   * constructor for Cat
   * @param name name of the cat
   * @param speed speed of the cat
   * @param kind kind of the cat
   */
  public Cat (String name, double speed, String kind) {
    super(name, speed);
    this.kind = kind;
  }

  /**
   * getter for cat kind
   * @return kind of the cat
   */
  public String getKind() {
    return kind;
  }
  /**
   * setter for cat kind
   * @param kind kind of the cat
   */
  public void setKind(String kind) {
    this.kind = kind;
  }


  @Override
  /**
   * method to get the sound of the cat
   * @return sound of the cat
   */
  public String toString() {
    String protectionStatus = isProtected() ? "protected" : "not protected";
    return "The Cat is an animal: " + getName() + " with speed: " + getSpeed() + 
      ", its kind is " + kind + ", gives sound " + givesSound() + " and " + protectionStatus + ".";
  }

  @Override
  /**
   * method to get the sound of the cat
   * @return sound of the cat
   */
  public boolean equals(Object object) {
    if (object instanceof Cat) {
      Cat other = (Cat) object;
      return getName().equals(other.getName()) &&
        getSpeed() == other.getSpeed() &&
        kind.equals(other.kind);
    }
    return false;
  }


  @Override
  /**
   * method to get the sound of the cat
   * @return sound of the cat
   */
  public String givesSound() {
    return "Meow";
  }
}

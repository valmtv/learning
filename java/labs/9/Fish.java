/**
 * class representing a fish, subclass of Animal
 */
public class Fish extends Animal {
  private String water;
    
  /**
   * constructor for Fish
   * @param name the name of the fish
   * @param speed the speed of the fish
   * @param water the type of water the fish lives in
   */
  public Fish(String name, double speed, String water) {
    super(name, speed);
    this.water = water;
  }

  /**
   * Gets the water type of the fish
   * @return the water type(String) 
   */
  public String getWater() {
    return water;
  }
  /**
   * Sets the water tpye of the fish
   * @param water the type of the water
   */
  public void setWater(String water) {
    this.water = water;
  }

  @Override
  /**
   * method to get the sound of the fish
   * @return sound of the fish
   */
  public String givesSound() {
    return "fish sound";
  }

  @Override
  /**
   * toString method
   * @return the string representation of the fish
   */
  public String toString() {
    String protectionStatus = isProtected() ? "is protected" : "is not protected"; 
    return "The Fish is an animal: " + getName() + " with speed: " + getSpeed() + 
      " that swims in water: " + water + ", gives sound " + givesSound() + " and " + protectionStatus + ".";
  }

  @Override
  /**
   * equals method
   * @param object the object to compare
   * @return true if the object is Fish and has the same variables, false otherwise
   */
  public boolean equals(Object object) {
    if (object instanceof Fish) {
      Fish other = (Fish) object;
      return getName().equals(other.getName()) &&
        getSpeed() == other.getSpeed() &&
        water.equals(other.water);
    }
    return false;
  }
  
}

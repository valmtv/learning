/**
 * Utility class for Animal subclasses
 */ 
public final class AnimalUtil {
  static final String[] PROTECTED_ANIMALS = {"whale", "hedgehog", "wolf"};
  static final String[] CAT_KIND = {"home", "tiger", "lion"};
  static final String[] WATER_KIND = {"river", "sea", "ocean"};


  /**
   * method which to find the cats among given array list of animals
   * @param animals array of type Animal 
   * @return Animal array with only cats there 
   */
  public static Animal[] findCats(Animal[] animals) {
    int catCount = 0;
    Animal[] tempCats = new Animal[animals.length];

    for (Animal animal : animals) {
      if (animal instanceof Cat) {
        tempCats[catCount++] = animal;
      }
    }
    Animal[] cats = new Animal[catCount];
    System.arraycopy(tempCats, 0, cats, 0, catCount);
    return cats;
  }

}

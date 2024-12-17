class Main {
  public static void main(String[] args) {
    Animal[] animals = {
      new Cat("Hedgehog", 34.3, AnimalUtil.CAT_KIND[0]),
      new Fish("Trout", 15, AnimalUtil.WATER_KIND[0]),
      new Cat("Salmon", 21.4, AnimalUtil.CAT_KIND[2])
    };
    for (Animal animal : animals) {
      System.out.println(animal);
    }

    Animal[] cats = AnimalUtil.findCats(animals);
    System.out.println("\nFiltered Cats:");
    for (Animal cat : cats) {
      System.out.println(cat);
    }
  
  }

}

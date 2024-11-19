class MainClass {
  public static void main(String[] args) {
    Sentence sentence = new Sentence(" We watched flowers from the window of the boat. ");
    System.out.println("Word instances of 'the': " + sentence.countWordInstances("the"));
    sentence.countSentence();
    System.out.println("Number of sentences: " + sentence.getNumberOfSentences());
    System.out.println("Sentence without duplicates: " + sentence.removeDuplicates());
  }    
}

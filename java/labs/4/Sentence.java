class Sentence {
  private String sentence;
  private boolean hasSentence = false;
  private int numOfSentences = 0;

  Sentence(String sentence) {
    this.sentence = sentence;  
  }
  public int countWordInstances(String word) {
    if (sentence == null) {
      return 0; 
    }
    int count = 0;
    int index = 0;
    while (index != -1) {
      index = sentence.indexOf(word, index);
      if (index != -1) {
        count++;
        index += word.length();
      // }
    }
    return count;
  }

  public void countSentence() {
    if (sentence == null) {
      return;
    }


    int count = 0;
    for (int i = 0; i < sentence.length(); i++) {
      char ch = sentence.charAt(i);
      if ((ch == '.' || ch == '?' || ch == '!') &&
         (i == sentence.length() - 1 || sentence.charAt(i + 1) == ' ')) {
            count++;
         }
     }

     numOfSentences = count;
     hasSentence = true;
  }

  public String removeDuplicates() {
    if (sentence == null) {
      return null;
    }
    StringBuilder result = new StringBuilder();
    StringBuilder duplicates = new StringBuilder();
    for (int i = 0; i < sentence.length(); i++) {
      char ch = sentence.charAt(i);
      if (duplicates.indexOf(String.valueOf(ch)) == -1) {
        result.append(ch);
        duplicates.append(ch);
      }
    }
    return result.toString();
  }

  public int getNumberOfSentences() {
    if (hasSentence) {
      return numOfSentences;
    } else {
      System.out.println("Number of sentences unknown");
      return 0;
    }
  } 
  public String getSentence() {
    return this.sentence;
  }
}

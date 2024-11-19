/*
 *
 * 2. Class Sentence
1) Create a class called Sentence with three instance variables: String 2) 3) 4) sentence,
boolean countedWords=false, int wordsNumber=0. All instance variables are
private. (5 points)
Create a constructor accepting one String argument. Assign the value of the argument
to sentence. (5 points)
Create a method countWordInstances accepting one String word argument and
returning int number being a number of word instances in the sentence. (20 points)
• You can find every instance of word string in sentence by using the
indexOf method. Especially useful is the method with two arguments: the
searched string and the index of the character the search should start from.
• The method should not be static.
• If the string sentence is null return 0.
Create a method countWords that counts a number of words in the sentence. Use
countWordInstances method called with “ ” argument. The function will count the
number of spaces. The number of words is equal to the number of spaces +1. The
method returns the number of words. (20 points)
• Remember to trim the sentence for the leading and trailing white characters.
Tou can use the method trim.
Remember to remove multiple spaces between words. You can use
replaceAll method called for the regular expression indicating multiple
spaces and for the second argument being one space - “ ”.
• If the string sentence is empty, return 0.
• If the string sentence is null return 0.
• Pass the number of words to countWords variable.
• Set the value of countedWords to true.
5) Create the method countVowels that counts the number of vowels in the sentence.
The method should return an array of int indicating the number of each vowel in a
sentence. The array has a length of 6 being a number of vowels in English alphabet: a,
e, i, o, u, y. The order of vowels in an array is the same as listed. Do not differentiate
between lower and upper case characters. (20 points)
• The returned array for the sentence: “Angel fell from the sky.” Should be “[1,
3, 0, 1, 0, 1]”
• For the sentence being empty or null return an array filled with 0s.
6) Create the getter for countWords. (5 points)
• Return the value only when the variable countedWords is true. In the other
7) case return 0 and print the message “Words not counted!”.
Create the getter for sentence. (5 points)
8) Do not create a setter for the sentence. We want the variable to be immutable
 *
 * */


class Sentence {
    private String sentence;
    private boolean countedWords = false;
    private int wordsNumber = 0;

    Sentence(String sentence) {
        this.sentence = sentence;
    }

    int countWordInstances(String word) {
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
            }
        }
        return count;
    }

    int countWords() {
        if (sentence == null) {
            return 0;
        }
        sentence = sentence.trim();
        sentence = sentence.replaceAll("\\s+", " ");
        wordsNumber = countWordInstances(" ") + 1;
        countedWords = true;
        return wordsNumber;
    }

    int[] countVowels() {
        if (sentence == null) {
            return new int[]{0, 0, 0, 0, 0, 0};
        }
        int[] vowels = new int[6];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'A') {
                vowels[0]++;
            } else if (ch == 'e' || ch == 'E') {
                vowels[1]++;
            } else if (ch == 'i' || ch == 'I') {
                vowels[2]++;
            } else if (ch == 'o' || ch == 'O') {
                vowels[3]++;
            } else if (ch == 'u' || ch == 'U') {
                vowels[4]++;
            } else if (ch == 'y' || ch == 'Y') {
                vowels[5]++;
            }
        }
        return vowels;
    }

    int getCountWords() {
        if (countedWords) {
            return wordsNumber;
        } else {
            System.out.println("Words not counted!");
            return 0;
        }
    }

    String getSentence() {
        return sentence;
    }
  
}


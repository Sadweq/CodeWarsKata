//DESCRIPTION
/*
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

        Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
*/

// My Solution
public class PangramChecker {
    public boolean check(String pangram1) {

        boolean[] letterCheck = new boolean[26]; // create array for 26 spaces ( english alphabet have 26 letters)
        int index=0; // helping var for assigning index of char
        pangram1 = pangram1.toLowerCase(); // editing strong to lower case for shortening of code
        for (int  i=0;i<pangram1.length();i++){
             if ('a'<= pangram1.charAt(i) && pangram1.charAt(i)<='z'){ // check if char at index i is beetween letters a-z
                index=pangram1.charAt(i) - 'a'; // assign ASCII number to index
            }
             else
                 continue; // continue if char is not a letter
            letterCheck[index]=true; // swap to true if there is leeter with this index
        }
        for (int i = 0; i<=25;i++){
            if (letterCheck[i]==false) //check if in array is any false
                return false;
        }

        return true;
    }
}


   /*Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
    If there are two or more words that are the same length, return the first word from the string with that length.
    Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567" */

    public class LongestWord {

        public static String LongestWord(String longest) {
            // code goes here
            String[] SplittedString=longest.split(" ");         //Split implementend strings for separate words
            longest=SplittedString[1];                                //set first word as longest of all at running
            for (int i=0;i<SplittedString.length-1;i++){              //create loop for lenght of whole array with words
                if (longest.length()<SplittedString[i+1].length()){   //check if next word is longer than currently longest
                    longest=SplittedString[i+1];                      //if yes set new longest word
                }
            }
            return longest;
        }

}

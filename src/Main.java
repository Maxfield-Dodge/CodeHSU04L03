public class Main {

    /*
    Use the following methods:
    .length()
    .substring(start, finish) doesn't include finish
    .substring(start) goes to the end
    .indexOf(someString)
    .equals(otherString)
     */
    public static void main(String[] args) {
        System.out.println(VowelCount("This is a string."));
        System.out.println("Correct output: 4");
        System.out.println(VowelCount(""));
        System.out.println("Correct output: 0");
        System.out.println(VowelCount("AEIOU"));
        System.out.println("Correct output: 5");
        System.out.println(VowelCount("AEFI*#)HSH)*$903"));
        System.out.println("Correct output: 3");
        ///////////////////////////////////////////////
        System.out.println(VowelRemover("Remove all of the vowels."));
        System.out.println("Correct output: Rmv ll f th vwls.");
        System.out.println(VowelRemover("AEFI*#)HSH)*$903"));
        System.out.println("Correct output: F*#)HSH)*$903");
        System.out.println(VowelRemover(""));
        System.out.println("Correct output: ");
        ///////////////////////////////////////////////
        System.out.println(ContainsSubstring("Sentence","ten"));
        System.out.println("Correct output: true");
        System.out.println(ContainsSubstring("The quick brown fox jumps over the lazy dog.","own"));
        System.out.println("Correct output: true");
        System.out.println(ContainsSubstring("The quick brown fox jumps over the lazy dog.","hello"));
        System.out.println("Correct output: false");
        ///////////////////////////////////////////////
        System.out.println(ReverseString("ABCDEF"));
        System.out.println("Correct output: FEDCBA");
        ////////////////////////////////////////////////
        System.out.println(PalindromeChecker("level"));
        System.out.println("Correct output: true");
        System.out.println(PalindromeChecker("racecar"));
        System.out.println("Correct output: true");
        System.out.println(PalindromeChecker("smart"));
        System.out.println("Correct output: false");
    }

    /**
     * Count the vowels in the input string regardless of case
     * @param input String
     * @return vowel count int
     */
    public static int VowelCount(String input){
        int length = input.length();
        String lowerCaseInput = input.toLowerCase();
        int count = 0;
        for(int i = 0; i < length; i++){
            String letter = lowerCaseInput.substring(i,i+1);
            if(letter.equals("a")||letter.equals("e")||letter.equals("i")
                    ||letter.equals("o")||letter.equals("u")){
                count++;
            }
        }
        //make input lowercase
        return count;
    }

    /**
     * Returns a string with all vowels removed regardless of case
     * @param input String
     * @return String with no vowels
     */
    public static String VowelRemover(String input){
        String withoutVowels= "";
        for(int i = 0; i < input.length(); i++){
            String letter = input.substring(i,i+1);
            if(!(letter.toLowerCase().equals("a")
                    ||letter.toLowerCase().equals("e")
                    ||letter.toLowerCase().equals("i")
                    ||letter.toLowerCase().equals("o")
                    ||letter.toLowerCase().equals("u"))){
                withoutVowels += letter;
            };
        }
        //make input lowercase
        return withoutVowels;
    }

    /**
     * Determine if a substring target is contained in a given string
     * @param input - Given string
     * @param target - String being looked for
     * @return true if target found, false otherwise
     */
    public static boolean ContainsSubstring(String input, String target){
//        return input.indexOf(target) >= 0;
        for(int i = 0; i <= input.length() - target.length(); i++){
            if(input.substring(i,i+target.length()).equals(target)){
                return true;
            }
        }
        return false;
    }

    /**
     * Reverses a given string
     * @param input String
     * @return reversed input String
     */
    public static String ReverseString(String input){
        String reversed = "";
        int length = input.length();
        for(int i = length; i > 0; i--){
            String letter = input.substring(i-1,i);
            reversed += letter;
        }
        return reversed;
    }

    /**
     * Determines if a given string is palindrome
     * @param input String
     * @return true if given string is a palindrome, false otherwise
     */
    public static boolean PalindromeChecker(String input){
        return ReverseString(input).equals(input);
    }
}

package Java.chapter1.question4;

public class Question {
    public boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    private boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;

        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                } else {
                    foundOdd = true;
                }
            }
        }

        return true; 
    }

    // Function that maps the value of a charcter between a-z -> 0-25. 
    // Non-letter characters will get mapped to -1. 
    private int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }

    private int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[26];

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            int val = getCharNumber(c);
            
            if (val != -1)
                table[val]++;
        }

        return table;
    }

    public boolean isPermutationOfPalimdrome2(String phrase) { 
        int countOdd = 0;
        int[] table = new int[26];

        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }

        return countOdd <= 1;
    }
}

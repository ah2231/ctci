package Java.chapter1.question2;

import java.util.Arrays;

public class Question {
    public static boolean isPermutation(String s1, String s2) {
        char[] c1 = s1.toCharArray(); 
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static boolean isPermutation2(String s1, String s2){
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] letters = new int[128];

        char[] s_array = s1.toCharArray();
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            int c = (int) s2.charAt(i);
            letters[c]--;
            if (letters[c] < 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1 = "olleh";
        String s2 = "hello";

        System.out.println(isPermutation2(s1, s2));
    }
}

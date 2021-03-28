package Java.chapter1.question5;

public class Question {
    public boolean oneEditAway(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        if (s1.length() == s2.length) 
            return oneEditRepalce(s1, s2);

        if (s1.length() - 1 == s2.length())
            return oneEditInsert(s2, s1);

        if (s1.length() + 1 == s2.length())
            return oneEditInsert(s1, s2);

        return false;
    }
}

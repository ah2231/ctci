package Java.chapter1.question1;

public class Tester {
    public static void main(String[] args) {
        String[] uniqueWords = {"this", "is", "a"};
        String[] notUniqueWords = {"hello", "test"};

        for (String word : uniqueWords) {
            boolean isWord = QuestionA.isUniqueChars(word);
            assert isWord == true;            
        }

        for (String word : notUniqueWords) {
            boolean isWord = QuestionA.isUniqueChars(word);
            assert isWord == false;          
        }               
    }    
}

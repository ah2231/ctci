public class Question {
    public String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;

            if (s.charAt(i + 1) != s.charAt(i) || i + 1 >= s.length()) {
                sb.append(s.charAt(i));
                sb.append(count);
                count = 0;
            }
        }

        return sb.toString();
    }
}
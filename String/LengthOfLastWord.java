public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length < 1) {
            return 0;
        }
        String last = words[words.length - 1];
        return last.length();
    }
}

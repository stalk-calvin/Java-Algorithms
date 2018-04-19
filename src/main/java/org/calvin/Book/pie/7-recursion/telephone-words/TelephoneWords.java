public class TelephoneWords {

    private static final char[][] chars = {
        { '0', '0', '0' }, // 0
        { '1', '1', '1' }, // 1
        { 'A', 'B', 'C' }, // 2
        { 'D', 'E', 'F' }, // 3 
        { 'G', 'H', 'I' }, // 4
        { 'J', 'K', 'L' }, // 5
        { 'M', 'N', 'O' }, // 6
        { 'P', 'R', 'S' }, // 7
        { 'T', 'U', 'V' }, // 8
        { 'W', 'X', 'Y' }  // 9
    };

    public void printWords(int[] phoneNum) {
        printWords("", phoneNum);
    }

    private void printWords(String str, int[] phoneNum) {
        int n = str.length();
        if (n == 7) {
            System.out.println(str);
        } else {
            for (int i = 1; i <= 3; i++) {
                char ch = getCharKey(phoneNum[n], i);
                printWords(str + ch, phoneNum);
            }
        }
    }


    private char getCharKey(int telephoneKey, int place) {
        return chars[telephoneKey][place - 1];
    }

    public static void main(String args[]) {
        TelephoneWords sol = new TelephoneWords();
        int[][] phoneNums = {
            {4, 9, 7, 1, 9, 2, 7}
        };
        int count = phoneNums.length;
        for (int i = 0; i < count; i++) {
            sol.printWords(phoneNums[i]);
        }
    } 
}

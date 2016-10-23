public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String result = "";
        while (n > 0) {
            int digit = (n-1)%26;
            char excel = (char) (digit + 65);
            result = excel + result;
            n = (n-1)/26;
        }
        System.out.println(result);
        return result;
    }
}

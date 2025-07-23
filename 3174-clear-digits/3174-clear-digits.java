public class Solution {
    public String clearDigits(String s) {
        char[] arr = new char[s.length()];
        int index = 0; 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                if (index > 0) {
                    index--; 
                }
            } else {
                arr[index] = ch;
                index++;
            }
        }
        return new String(arr, 0, index);
    }
}

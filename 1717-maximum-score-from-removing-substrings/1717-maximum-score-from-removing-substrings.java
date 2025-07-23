public class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x < y) {
            s = new StringBuilder(s).reverse().toString();
            int temp = x;
            x = y;
            y = temp;
        }

        int score = 0; 
        StringBuilder firstPass = new StringBuilder(); 
        for (char c : s.toCharArray()) {
            int len = firstPass.length();
            if (c == 'b' && len > 0 && firstPass.charAt(len - 1) == 'a') {
                firstPass.deleteCharAt(len - 1);
                score += x;
            } else {
                firstPass.append(c); 
            }
        }
        StringBuilder secondPass = new StringBuilder();
        for (int i = 0; i < firstPass.length(); i++) {
            char c = firstPass.charAt(i);
            int len = secondPass.length();
            if (c == 'a' && len > 0 && secondPass.charAt(len - 1) == 'b') {
                secondPass.deleteCharAt(len - 1);
                score += y;
            } else {
                secondPass.append(c); 
            }
        }

        return score; 
    }
}

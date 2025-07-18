class Solution {
    public String finalString(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'i') {
                result.reverse();
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}

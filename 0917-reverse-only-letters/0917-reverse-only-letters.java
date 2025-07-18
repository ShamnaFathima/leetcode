class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!Character.isAlphabetic(arr[left])) {
                left++;
            } 
            else if (!Character.isAlphabetic(arr[right])) {
                right--;
            } 
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        return new String(arr);
    }    
}

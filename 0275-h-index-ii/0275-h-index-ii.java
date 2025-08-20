public class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int papers = n - mid;  // number of papers with >= citations[mid]
            
            if (citations[mid] == papers) {
                return papers;  // exact match
            } else if (citations[mid] < papers) {
                left = mid + 1;  // need more citations
            } else {
                right = mid - 1; // too many citations
            }
        }
        return n - left;
    }
}

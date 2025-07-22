class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); 

            for (int j = 1; j < rowNum; j++) {
                int prevRowLeft = triangle.get(rowNum - 1).get(j - 1);
                int prevRowRight = triangle.get(rowNum - 1).get(j);
                row.add(prevRowLeft + prevRowRight); 
            }

            if (rowNum > 0) {
                row.add(1); 
            }

            triangle.add(row);
        }

        return triangle;
    }
}
 
    
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }
        
        List<List<Integer>> pre = generate(numRows - 1);
        List<Integer> next = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            next.add(1);
        }
        
        for (int i = 1; i < numRows - 1; i++) {
            next.set(i, pre.get(numRows - 2).get(i - 1) + pre.get(numRows - 2).get(i));
        }
        
        pre.add(next);
        return pre;
    }
}
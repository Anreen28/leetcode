class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> results = new ArrayList<>();
    what(candidates, 0, target, new ArrayList<>(), results);
    return results;
  }

  private void what(int[] candidates, int startIndex, int target, List<Integer> temp, List<List<Integer>> results) {
    if (target == 0) {
      results.add(new ArrayList<>(temp)); 
      return;
    }

    for (int i = startIndex; i < candidates.length; i++) {
      if (target - candidates[i] >= 0) {
        temp.add(candidates[i]);
        what(candidates, i, target - candidates[i], temp, results);
        temp.remove(temp.size() - 1); 
      }
    }
  }
}

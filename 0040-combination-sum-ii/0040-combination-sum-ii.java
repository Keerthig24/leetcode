class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
 private void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int remain, int start) {
        if (remain == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            if (nums[i] > remain) break;
            temp.add(nums[i]);
            backtrack(res, temp, nums, remain - nums[i], i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}

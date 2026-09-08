class Solution {

    void AllGetCombin(int[] arr, int idx, int target,
                      List<List<Integer>> ans,
                      List<Integer> combin) {

        // Target achieved
        if (target == 0) {
            ans.add(new ArrayList<>(combin));
            return;
        }

        // Invalid condition
        if (idx == arr.length || target < 0) {
            return;
        }

        // Take current element
        combin.add(arr[idx]);

        AllGetCombin(arr, idx, target - arr[idx], ans, combin);

        // Backtrack
        combin.remove(combin.size() - 1);

        // Skip current element
        AllGetCombin(arr, idx + 1, target, ans, combin);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();

        AllGetCombin(candidates, 0, target, ans, combin);

        return ans;
    }
}
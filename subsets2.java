//Same aapproach as we used in subsets, but we add one condtion i>index and nums[i] == nums[i-1] then continue.

public class Solution {
public List<List<Integer>> subsetsWithDup(int[] nums) {
   List<List<Integer>> result = new ArrayList<List<Integer>>();

    if(nums.length == 0){
        return result;
    }

    Arrays.sort(nums);
    dfs(nums, 0, new ArrayList<Integer>(), result);
    return result; 
}

public void dfs(int[] nums, int index, List<Integer> path, List<List<Integer>> result){
    result.add(new ArrayList<Integer>(path));

    for(int i = index; i < nums.length; i++){
        if(i>index&&nums[i]==nums[i-1]) continue;
        path.add(nums[i]);
        dfs(nums, i+1, path, result);
        path.remove(path.size()-1);
    }
}
}

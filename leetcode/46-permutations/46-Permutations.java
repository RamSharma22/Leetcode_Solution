class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        helper(nums,0,used,new ArrayList<>());
        return res;
    }

    public void helper(int[] nums,int idx,boolean[] used,List<Integer> row){
        if(idx == nums.length){
            res.add(new ArrayList<>(row));
            return;
        }
        
        for(int i = 0;i < nums.length;i++){
            if(used[i])
            continue;

            used[i] = true;
            row.add(nums[i]);
            helper(nums,idx+1,used,row);
            used[i] = false;
            row.remove(row.size()-1);
        }
    }
    
}
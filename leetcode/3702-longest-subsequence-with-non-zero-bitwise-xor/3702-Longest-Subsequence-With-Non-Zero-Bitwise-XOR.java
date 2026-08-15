class Solution {
    public int longestSubsequence(int[] n) {
        int x = 0;
        boolean b = false;
        for(int i : n){
            x ^= i;
            if(i != 0){
                b = true;
            }
        }
        if(x != 0){
            return n.length;
        }
        return b ? n.length - 1 : 0;
    }
}
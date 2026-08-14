class Solution {
    public boolean checkSubarraySum(int[] n, int k) {
        HashMap<Integer,Integer>m = new HashMap<>();
        m.put(0 ,-1);
        int l = n.length;
        int s = 0;
        for(int i = 0;i < l;i++){
            s += n[i];
            int r = s % k;
            if(m.containsKey(r)){
                if(i-m.get(r) >= 2){
                    return true;
                }
            }
            else{
                m.put(r,i);
            }
        }
        return false;
    }
}
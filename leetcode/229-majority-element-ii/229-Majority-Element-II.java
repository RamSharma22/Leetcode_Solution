class Solution {
    public List<Integer> majorityElement(int[] n) {
        int l = n.length;
        List<Integer> a = new ArrayList<>();   
        HashMap<Integer,Integer> m = new HashMap<>();
        int k = l/3;
        for(int i = 0;i < l;i++){
            m.put(n[i],m.getOrDefault(n[i],0)+1);
        }

        for(int x : m.keySet()){
            if(m.get(x) > k){
                a.add(x);
            }
        }
        return a;
    }
}
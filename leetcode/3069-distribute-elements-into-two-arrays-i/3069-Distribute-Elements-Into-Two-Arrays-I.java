class Solution {
    public int[] resultArray(int[] n) {
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        l.add(n[0]);
        r.add(n[1]);
        int m = n.length;
        for(int i = 2;i < m;i++){
            if(l.get(l.size()-1) > r.get(r.size() -1)){
                l.add(n[i]);
            }
            else{
                r.add(n[i]);
            }
        }
        int j = 0;
        for(int i = 0;i < l.size();i++){
            n[j] = l.get(i);
            j++;
        }
        for(int i = 0;i < r.size();i++){
            n[j] = r.get(i);
            j++;
        }
        return n;
    }
}
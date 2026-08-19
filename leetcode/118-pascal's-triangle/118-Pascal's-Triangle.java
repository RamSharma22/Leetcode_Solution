class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> t = new ArrayList<>();
        for(int i = 0;i < n;i++){
            ArrayList<Integer> r1 = new ArrayList<>();
            for(int j = 0;j <= i;j++){
                if(j == 0 || j == i){
                    r1.add(1);
                }
                else{
                    int s = t.get(i-1).get(j-1) + t.get(i-1).get(j);
                    r1.add(s);
                }
            }
            t.add(r1);
        }
        return t;
    }
}
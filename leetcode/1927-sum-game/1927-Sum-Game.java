class Solution {
    public boolean sumGame(String n) {
        int m = n.length();
        int ls = 0, rs = 0;
        int lq = 0, rq = 0;
        
        for(int i  = 0;i < m/2;i++){
            char c = n.charAt(i);
            if(c == '?'){
                lq += 1;
            }
            else{
                ls += c - '0';
            }
        }
        for(int i  = m/2;i < m;i++){
            char c = n.charAt(i);
            if(c == '?'){
                rq += 1;
            }
            else{
                rs += c - '0';
            }
        }
        int d = ls-rs;
        if(lq == rq){
            return d != 0;
        }
        int qd = lq - rq;
        return d*2 + qd*9 != 0;
    }
}
class Solution {
    public int numIslands(char[][] g) {
        int n = g.length;
        int m = g[0].length;
        int sl = 0;
        
        int[][] directions = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(g[i][j] == '1'){
                    sl++;
                    q.offer(new int[]{i,j});
                    g[i][j]  = '0';
                    while(!q.isEmpty()){
                        int[] c = q.poll();
                        for(int[] d : directions){
                            int nr = c[0] + d[0];
                            int nc = c[1] + d[1];
                            if(nr >= 0 && nr < n && nc >= 0 && nc < m && g[nr][nc] == '1'){
                                g[nr][nc] = '0';
                                q.offer(new int[]{nr,nc});
                            }
                        }

                    }
                }
            }
        }
        return sl;
    }
}
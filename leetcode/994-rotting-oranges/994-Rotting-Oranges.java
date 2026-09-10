class Solution {
    public int orangesRotting(int[][] g) {
        int n = g.length;
        int m = g[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int time = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(g[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                else if(g[i][j] == 1){
                    fresh += 1;
                }
            }
        }
        int[][] directions = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };
        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            for(int i = 0;i < size;i++){
                int[] c = q.poll();
                for(int[] d : directions){
                    int nr = c[0] + d[0];
                    int nc = c[1] + d[1];
                    if(nr >= 0 && nr < n && nc >= 0 && nc < m && g[nr][nc] == 1){
                        g[nr][nc] = 2;
                        fresh -= 1;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            time += 1;
        }
        return fresh == 0? time : -1;
    }
}
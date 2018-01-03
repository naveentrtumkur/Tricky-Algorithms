// Count the number os islands, given a char array representing island.

class Solution {
    public int numIslands(char[][] grid) {
        int islandCount =0;
        if(grid.length == 0 || grid == null)
            return 0;
        
        int rc = grid.length;
        int cc = grid[0].length;
        
        // Traverse through the island finding the count of islands.
        for(int r=0 ; r<rc ; r++)
        {
            for(int c= 0; c<cc;c++)
            {
                if(grid[r][c] == '1')
                {
                    islandCount++;
                    dfs(grid,r,c);
            }
        }
        
    }
        return islandCount;
    }
    
    public void dfs(char[][] grid, int r, int c)
    {
        
        int rc = grid.length;
        int cc = grid[0].length;
        
        // Check for base condition and boundary conditions to return the value.
        if( r<0 || c< 0 || r>=rc || c>=cc || grid[r][c] == '0')
            return;
        
        // Set the value of island node as visited. Set the value to zero.
        grid[r][c] = '0';
        
        
        // Recursively check and traverse through all the neighbouring cells.
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    
    }
        
}

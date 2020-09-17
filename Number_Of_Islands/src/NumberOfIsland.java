
public class NumberOfIsland {
	
	public int getNumberOfIslands(char[][] grid)
	{
		int noOfIslands=0;
		boolean flag=false;
		
	
		for(int i=0;i< grid.length;i++)
		{
			for(int j=0;j< grid[i].length;j++)
			{
				if(grid[i][j]=='1')
				{
				
					noOfIslands+=checkForNeighbours(grid,i,j);
					System.out.println(noOfIslands);
					
				}
				
				
			}//2nd for
			
			
		
		}//1st for
		
		return noOfIslands;
		
	}
	
	public int checkForNeighbours(char[][] grid, int i, int j)
	{
		
		if( i < 0 || i >= grid.length || j < 0 ||  j >= grid[i].length ||  
				  grid[i][j] =='0' )
		{
			return 0;
		}
		
		grid[i][j]='0';
		checkForNeighbours(grid,i+1,j);
		checkForNeighbours(grid, i-1,j);
		checkForNeighbours(grid, i,j+1);
		checkForNeighbours(grid, i, j-1);
		return 1;
	}
}



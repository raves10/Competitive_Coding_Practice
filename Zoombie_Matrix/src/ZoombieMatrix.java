
public class ZoombieMatrix {
	
	public int findInfectedHumanDays(int[][] matrix)
	{
		int rows= matrix.length;
		int cols= matrix[0].length;
		int days=0;
		boolean flag=false;
		
		boolean noZoombie = findIfNotZoombie(matrix,rows,cols);
		if(noZoombie)
		{
			return -1;
		}
		else
		{
			while(true)
			{
				for(int i=0;i< rows;i++)
				{
					for(int j=0;j<cols;j++)
					{
						if(matrix[i][j]==1)
						{
							if((j-1) >=0 && (j-1) < cols && matrix[i][j-1]==0 )
							{
								matrix[i][j-1]=1;
								flag=true;
								
							}
							else if((j+1)>=0 && (j+1) < cols && matrix[i][j+1]==0)
							{
								matrix[i][j+1]=1;
								flag=true;
							}
							else if((i+1) >=0 && (i+1) < rows && matrix[i+1][j]==0)
							{
								matrix[i+1][j]=1;
								flag=true;
							}
							else if((i-1) >=0 && (i-1) < rows && matrix[i-1][j]==0)
							{
								matrix[i-1][j]=1;
								flag=true;
							}
						}  //if end
					} //2nd for end
				}  //1st for end
				
				if(!flag)
				{
					break;
				}
				flag=false;
				days+=1;
				
			}
			
			return days;
		}
		
		
		
	}

	public boolean findIfNotZoombie(int[][] matrix, int rows, int cols)
	{
		for(int i=0;i< rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				if(matrix[i][j]==1)
				{
					return false;
				}
			}
		}
		
		return true;
		
	}
}


public class NumberOfIslandApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'0','0','1','0','0'},{'0','0','0','0','0'}};
		/*
		 * char[][] grid =
		 * {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','
		 * 0','1','1'}};
		 */
		NumberOfIsland obj =new NumberOfIsland();
		int output=obj.getNumberOfIslands(grid);
		System.out.println("Number of Islands: "+output);

	}

}

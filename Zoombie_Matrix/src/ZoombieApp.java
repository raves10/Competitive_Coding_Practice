
public class ZoombieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix= {{1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,1,1}};
		/*
		 * int[][] matrix= {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}};
		 */
		/*
		 * int[][] matrix= {{0,1,1,0,1}, {0,1,0,1,0}, {0,0,0,0,1}, {0,1,0,0,0}};
		 */
		int days= new ZoombieMatrix().findInfectedHumanDays(matrix);
		System.out.println("Number of days taken: "+ days);

	}

}

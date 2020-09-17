import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ConnectRopesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> numlist = new ArrayList<Integer>();
		numlist.add(20);
		numlist.add(4);
		numlist.add(8);
		numlist.add(2);
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(numlist);

		int sum=0;
		System.out.println(pq.toString());
		while(pq.size()!=1)
		{
			int temp=pq.poll() + pq.poll();
			sum+=temp;
			pq.add(temp);
			
		}
		System.out.println("The minimum cost of connecting ropes is: "+sum);
	}

}

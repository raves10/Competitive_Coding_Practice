import java.util.ArrayList;
import java.util.List;

public class PartitionLabel {
	public List<Integer> getPartitions(String s)
	{
		List<Integer> lenghtOfPartitions= new ArrayList<Integer>();
		int[] lastIndex = new int[26];    //a-z
		
		for(int i=0;i<s.length();i++)
		{
			lastIndex[s.charAt(i) - 'a'] =i;
		}
		
		int i=0;
		while(i<s.length())
		{
			int end=lastIndex[s.charAt(i) -'a'];
			int j=i;
			
			while(j!=end)
			{
				end = Math.max(end, lastIndex[s.charAt(j++) -'a']);
				
			}
		
			lenghtOfPartitions.add(j-i+1);
			i=j+1;
		}
		
		return lenghtOfPartitions;
	}

}

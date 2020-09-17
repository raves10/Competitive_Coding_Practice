import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FrequentUsedWords {

	public List<String> findFrequentWords(List<String> reviews, int k, List<String> keywords)
	{
		List<String> result= new ArrayList<String>();
		int noOfReviews= reviews.size();
		LinkedHashMap<String, Integer> freq= new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> modifiedfreq=null;
		boolean flag=false;
		
		
		for(int j=0;j<keywords.size();j++)
		{
			int count=0;
			System.out.println("j"+j);
			for(int i=0;i<noOfReviews;i++)
			{
				if(reviews.get(i).toLowerCase().contains(keywords.get(j).toLowerCase()))
				{
					count++;
				}
			}
			System.out.println("keyword:" + keywords.get(j)+ "count: "+count);
			
			
			
			if(freq.size() >=1)
			{
				
				
				System.out.println("modifiedfreq 1 "+ modifiedfreq.toString());
				for(Entry<String, Integer> entry:freq.entrySet())
				
				{
					System.out.println("count "+ count);
					if(entry.getValue()==count)
					{
						flag=true;
						int lexcompare=entry.getKey().compareToIgnoreCase(keywords.get(j));
						System.out.println("lexcompare "+lexcompare);
						if(lexcompare==0)
						{
							
							modifiedfreq.put(keywords.get(j), count);
						}
						else if(lexcompare > 0)
						{
							   
								//freq.replace(entry.getKey(), 0);
								modifiedfreq.remove(entry.getKey());
								modifiedfreq.put(keywords.get(j), count);
							
						}
						/*
						 * else { System.out.println("else"); modifiedfreq.remove(keywords.get(j));
						 * System.out.println("modifiedfreq"+ modifiedfreq.toString()); }
						 */
								
					}
					
								
				}
				freq.put(keywords.get(j), count);
				
				System.out.println("flag: "+flag +"keyowrd:"+ keywords.get(j));
				if(!flag)
				{
					modifiedfreq.put(keywords.get(j), count);
					
				}
				flag=false;
				
			}
			else
			{
				freq.put(keywords.get(j), count);
				modifiedfreq=new LinkedHashMap<String, Integer>(freq);
			}
			
			
		}
		System.out.println(modifiedfreq.toString());
		//int i=0;
		/*
		 * modifiedfreq.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator
		 * .reverseOrder())).forEachOrdered( e -> (i<k) ? result.add(e.getKey()) : i++);
		 */
		
		  System.out.println(modifiedfreq.toString()); 
		  for(int i=0;i<k;i++)
		  {
		    if(modifiedfreq.values().toArray()[i].toString()!= "0")
		    {
		 
		    	result.add(modifiedfreq.keySet().toArray()[i].toString()); 
		    	} 
		    }
		 
		
		
		
		
		
		
		return result;
		
	}
}

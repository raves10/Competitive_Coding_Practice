import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class ReorderLogFilesData {
	
	public String[] reorderLogFiles(String[] logs)
	{
		
		String[] output= {};
		ArrayList<String> letter=new ArrayList<>();
		List<String> digits=new ArrayList<>();
		Pattern p = Pattern.compile("[0-9]+");
		
		for(int i=0;i<logs.length;i++)
		{
			if(p.matcher(logs[i].substring(logs[i].indexOf(" "))).find())
			{
				digits.add(logs[i]);
			}
			else
			{
				letter.add(logs[i]);
			}
		}
	
		for(int i=1;i<letter.size();i++)
		{
			String id=letter.get(i).split(" ")[0];
			String key= letter.get(i).substring(letter.get(i).indexOf(" "));
			int j= i-1;
			while(j>=0)
			{
				if(letter.get(j).substring(letter.get(j).indexOf(" ")).compareTo(key) > 0)
				{
					Collections.swap(letter, j+1, j);
				}
				else if(letter.get(j).substring(letter.get(j).indexOf(" ")).compareTo(key) < 0)
				{
					j-=1;
					continue;
				}
				else
				{
					if(letter.get(j).split(" ")[0].compareTo(id) > 0)
					{
						Collections.swap(letter, j+1, j);
					}
				}
				
				j-=1;
			}
			
		}
		
		letter.addAll(digits);
		output= letter.toArray(output);
		
		
		
		
		return output;
		
		
		
		
	}
	

}

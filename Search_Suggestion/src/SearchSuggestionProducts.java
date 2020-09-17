import java.util.ArrayList;
import java.util.List;

public class SearchSuggestionProducts {
	
	
	public List<List<String>> getSuggestedProducts(String[] products, String searchWord)
	{
		List<String> result = null;
		List<List<String>> output= new ArrayList<List<String>>();
		
		//sort product lexi
		for(int i=1;i< products.length;i++)
		{
			String key =products[i].toLowerCase();
			int j=i-1;
			
			while(j >=0 && products[j].toLowerCase().compareTo(key) > 0)
			{
				products[j+1]=products[j];
				j-=1;
				
			}
			products[j+1]=key;
		}
		
		String search="";
		
		for(int i=0;i<searchWord.length();i++)
		{
			result =  new ArrayList<String>();
			search+=searchWord.charAt(i);
			int k=0;
			for(int j=0;j<products.length;j++)
			{
				if(products[j].contains(search) && k<3)
				{
					result.add(products[j]);
					k++;
				}
			}
			output.add(result);
		}
		
		
		return output;
	}

}

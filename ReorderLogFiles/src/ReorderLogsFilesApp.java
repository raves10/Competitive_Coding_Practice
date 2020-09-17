
public class ReorderLogsFilesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
	
	
		
		ReorderLogFilesData obj = new ReorderLogFilesData();
		String[] output =obj.reorderLogFiles(logs);
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]+"\n");
		}
	}

}

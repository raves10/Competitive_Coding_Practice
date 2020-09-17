import java.util.List;

public class PartitionLabelApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ababcbacadefegdehijhklij";
		PartitionLabel obj=new PartitionLabel();
		List<Integer> output=obj.getPartitions(str);
		System.out.println("Output Partition: "+output.toString());

	}

}

import java.util.*;
public class list2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] stuff = {"babies", "watermelon", "melons", "fudge"};
		LinkedList<String> thelist = new LinkedList<String> (Arrays.asList(stuff));
		
		thelist.add("pumpinkng");
		thelist.addFirst("firstthing");
		
		//convert back to an array
		
		stuff= thelist.toArray(new String[thelist.size()]);
		
		for(String x : stuff){
			System.out.printf("%s ", x);
		}
	}

}

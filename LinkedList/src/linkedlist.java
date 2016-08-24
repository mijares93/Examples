import java.util.*;


public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String [] things = { "apples", "noobs", "pwnge", "bacon", "goATS"};
			List<String> list1 = new LinkedList<String>();
			for(String x:things)
			
				list1.add(x);
				
			
			String[] things2= {"Sausage", "bacon", "goats","harrypotter" };
			List<String> list2 = new LinkedList<String>();	
			for(String y:things2)
				list2.add(y);
			list1.addAll(list2);
			list2 = null;
	}

}

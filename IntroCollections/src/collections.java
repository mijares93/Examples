import java.util.*;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] things ={"eggs", "lasers", "hats", "pie"};
		List <String> list1 = new ArrayList<String>();
		
		//añadir cosas al arreglo
		for(String x : things)
			list1.add(x);
		
		String[] morethings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
		
		
		//añadir cosas al arreglo
				for(String y : morethings)
					list2.add(y);
		
		for(int i=0; i<list2.size();i++){
			System.out.printf("%s ", list2.get(i));
		}
}
}

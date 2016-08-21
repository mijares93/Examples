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
		
		for(int i=0; i<list1.size();i++){
			System.out.printf("%s ", list1.get(i));
		}	
		editlist(list1,list2);
		System.out.println();
		
		for(int i=0; i<list1.size();i++){
			System.out.printf("%s ", list1.get(i));
		}	
    }
	
	public static void editlist(Collection<String> l1, Collection<String> l2){
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){ //Vamos a iterar entre la lista l1 
			if(l2.contains(it.next())) //Comparamos entre la lista l2 y lista l1 
				it.remove();//Si la lista l2 tiene algo de la lista l1, lo removemos.
		}
	}
}



		




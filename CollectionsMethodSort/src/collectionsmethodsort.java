import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionsmethodsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] crap = {"apples", "lemons", "geese", "bacon", "youtube"};
			List<String> l1 = Arrays.asList(crap);
			
			Collections.sort(l1);
			System.out.printf("%s\n", l1 );
			
			Collections.sort(l1, Collections.reverseOrder());
			System.out.printf("%s\n", l1 );
	}

}

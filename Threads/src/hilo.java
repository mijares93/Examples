
public class hilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t1 = new Thread(new threads("one"));
			Thread t2 = new Thread(new threads("two"));
			Thread t3 = new Thread(new threads("three"));
			Thread t4 = new Thread(new threads("four"));
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			
	}

}

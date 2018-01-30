package chap11.sec03_exam05_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i =0 ; i < 50; i++) {
			counter = new Counter(i);
			
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}*/
			counter = null; //°´Ã¼¸¦ ¾²·¹±â·Î ¸¸µë.
			System.gc();	
		}
		
		
		

	}

}

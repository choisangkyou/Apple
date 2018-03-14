package chap12.sec02_exam03_thread_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainTread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름:"+ mainTread.getName());


	
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름:"+threadA.getName());
		threadA.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름:"+threadB.getName());                                                                                       000
		threadB.start();
		

	}

}

package chap12.sec02_exam03_thread_name;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainTread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�:"+ mainTread.getName());


	
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸�:"+threadA.getName());
		threadA.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸�:"+threadB.getName());                                                                                       000
		threadB.start();
		

	}

}

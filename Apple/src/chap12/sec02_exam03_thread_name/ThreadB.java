package chap12.sec02_exam03_thread_name;

public class ThreadB extends Thread {
/*	public ThreadB() {
		setName("ThreadB");
	}
*/

	@Override
	public void run() {
		for(int i =0; i <2 ; i++) {
			System.out.println(getName()+" �� ����� ����");
		}
	}
}

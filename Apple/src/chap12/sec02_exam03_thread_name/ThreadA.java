package chap12.sec02_exam03_thread_name;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}

	@Override
	public void run() {
		for(int i =0; i <2 ; i++) {
			System.out.println(getName()+" �� ����� ����");
		}
	}
}

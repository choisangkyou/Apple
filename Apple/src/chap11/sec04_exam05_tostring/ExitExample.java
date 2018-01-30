package chap11.sec04_exam05_tostring;

public class ExitExample {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				if(status !=5) {
					throw new SecurityException(); //����ó��.
				}
				System.out.println("��������");
			}
			
			
		});
		
		for(int i =0; i < 10 ; i++) {
			System.out.println(i);
			
			try {
			//jvm ���� ��û
			Thread.sleep(500);
			System.exit(i);
			
			}catch (Exception e) {
				System.out.println("Security Exception �߻�");
			}
		}

	}

}

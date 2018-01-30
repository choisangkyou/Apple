package chap11.sec04_exam05_tostring;

public class ExitExample {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				if(status !=5) {
					throw new SecurityException(); //예외처리.
				}
				System.out.println("정상종료");
			}
			
			
		});
		
		for(int i =0; i < 10 ; i++) {
			System.out.println(i);
			
			try {
			//jvm 종료 요청
			Thread.sleep(500);
			System.exit(i);
			
			}catch (Exception e) {
				System.out.println("Security Exception 발생");
			}
		}

	}

}

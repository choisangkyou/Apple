package chap11.sec04_exam05_tostring;

public class ExitExample {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {

			@Override
			public void checkExit(int status) {
				if(status !=5) {
					throw new SecurityException();
				}
			}
			
			
		});
		
		for(int i =0; i < 10 ; i++) {
			System.out.println(i);
			
			try {
			//jvm 종료 요청
			Thread.sleep(500);
			System.exit(i);
			}catch (Exception e) {}
		}

	}

}

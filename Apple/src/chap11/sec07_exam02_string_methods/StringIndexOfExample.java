package chap11.sec07_exam02_string_methods;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");//시작 index의 위치를 리턴.
		System.out.println("문자열의 시작 index=:"+ location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
		

	}

}

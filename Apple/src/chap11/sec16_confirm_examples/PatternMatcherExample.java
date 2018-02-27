package chap11.sec16_confirm_examples;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		//Id 정규식
		String id ="5Angel1004";
		String regExp = "[a-zA-Z]\\w{8,12}";
		//영어로 시작하고 문자(숫자포함) 8~12자리까지만 사용가능
		

		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("아이디로 사용 가능합니다.");
		}else {
			System.out.println("아이디로 사용할 수 없습니다.");
		}
		
		System.out.println();
		//email 정규식.
		String email ="7abc1004@naver.com";
		regExp ="[a-zA-Z]\\w+@[a-zA-Z]\\w+\\.\\w+(\\.\\w+)?";
		// 영어로 시작하는 문자(숫자포함)하나이상@영어로 시작하는 문자하나 이상.(.이나 문자가 올수도 있음) 
		
		isMatch = Pattern.matches(regExp, email);
		if(isMatch) {
			System.out.println("email로 사용 가능합니다.");
		}else {
			System.out.println("email로 사용할 수 없습니다.");
		}
		

		//전화번호 정규식.
		String phone ="010-123-1234";
		regExp ="[0]\\d{1,2}-\\d{3,4}-\\d{4}";
		//  
		
		isMatch = Pattern.matches(regExp, phone);
		if(isMatch) {
			System.out.println("전화 번호로 사용 가능합니다.");
		}else {
			System.out.println("전화 번호로 사용할 수 없습니다.");
		}
				

	}

}

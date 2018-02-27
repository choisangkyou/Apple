package chap11.sec16_confirm_examples;

import java.util.regex.Pattern;

public class PatternMatcherExample {

	public static void main(String[] args) {
		//Id ���Խ�
		String id ="5Angel1004";
		String regExp = "[a-zA-Z]\\w{8,12}";
		//����� �����ϰ� ����(��������) 8~12�ڸ������� ��밡��
		

		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("���̵�� ��� �����մϴ�.");
		}else {
			System.out.println("���̵�� ����� �� �����ϴ�.");
		}
		
		System.out.println();
		//email ���Խ�.
		String email ="7abc1004@naver.com";
		regExp ="[a-zA-Z]\\w+@[a-zA-Z]\\w+\\.\\w+(\\.\\w+)?";
		// ����� �����ϴ� ����(��������)�ϳ��̻�@����� �����ϴ� �����ϳ� �̻�.(.�̳� ���ڰ� �ü��� ����) 
		
		isMatch = Pattern.matches(regExp, email);
		if(isMatch) {
			System.out.println("email�� ��� �����մϴ�.");
		}else {
			System.out.println("email�� ����� �� �����ϴ�.");
		}
		

		//��ȭ��ȣ ���Խ�.
		String phone ="010-123-1234";
		regExp ="[0]\\d{1,2}-\\d{3,4}-\\d{4}";
		//  
		
		isMatch = Pattern.matches(regExp, phone);
		if(isMatch) {
			System.out.println("��ȭ ��ȣ�� ��� �����մϴ�.");
		}else {
			System.out.println("��ȭ ��ȣ�� ����� �� �����ϴ�.");
		}
				

	}

}

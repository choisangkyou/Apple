package chap11.sec07_exam02_string_methods;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);

		/*
		 * String ��ü�� ���ڿ��� ������ �Ұ��ϴ�, ������ replace()�޼ҵ尡 �����ϴ� ���ڿ���
		 * ���� ���ڿ��� �������� �ƴ϶� ������ ���ο� ���ڿ� �̴�.
		 * */
	}

}

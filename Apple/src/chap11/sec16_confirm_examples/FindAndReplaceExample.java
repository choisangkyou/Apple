package chap11.sec16_confirm_examples;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ���ߵ� �� �ִ�.";
		int index = str.indexOf("�ڹ�");
		
		if(index != -1) {
			System.out.println("�ڹ� ���ڿ��� ���Ե�.");
		}else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� ����.");
		}
			
		str = str.replace("�ڹ�", "java");
		System.out.println("--->"+str);

	}

}

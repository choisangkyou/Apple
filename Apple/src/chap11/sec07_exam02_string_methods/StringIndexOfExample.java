package chap11.sec07_exam02_string_methods;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");//���� index�� ��ġ�� ����.
		System.out.println("���ڿ��� ���� index=:"+ location);
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
		

	}

}

package chap11.sec07_exam02_string_methods;

public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		
		System.out.println(strVar1.hashCode());
		System.out.println(strVar2.hashCode());
		
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("���� String ��ü�� ����");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
	}

}

package chap11.sec16_confirm_examples;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str="";
		for(int i =1; i <=100; i++) {
			str +=i;
			//System.out.println(str.hashCode()); //��ü�� ���� ������.
		}
		System.out.println("���:"+ str);
		
		System.out.println("������ �ڵ�");
		StringBuilder str2 = new StringBuilder();
		for(int i =1; i<= 100; i++) {
			str2.append(i);
			//System.out.println(str2.hashCode());//���� ��ü�� Ȱ����.
		}
		System.out.println("���:"+ str2);
		
	}

}

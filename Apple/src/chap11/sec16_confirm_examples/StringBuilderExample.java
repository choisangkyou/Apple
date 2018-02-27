package chap11.sec16_confirm_examples;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str="";
		for(int i =1; i <=100; i++) {
			str +=i;
			//System.out.println(str.hashCode()); //객체를 새로 생성함.
		}
		System.out.println("결과:"+ str);
		
		System.out.println("개선된 코드");
		StringBuilder str2 = new StringBuilder();
		for(int i =1; i<= 100; i++) {
			str2.append(i);
			//System.out.println(str2.hashCode());//동일 객체를 활용함.
		}
		System.out.println("결과:"+ str2);
		
	}

}

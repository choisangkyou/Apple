package chap11.sec03_exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("google","android");
		
		String strObj = smartPhone.toString();
		System.out.println(strObj);
		System.out.println(smartPhone);

	}

}

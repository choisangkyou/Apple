package chap11.sec16_confirm_examples;

public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {23,44,45,4,35,5,34,34,43,3};
		String str = new String(bytes);
		System.out.println(str);

	}

}

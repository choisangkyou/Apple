package chap11.sec07_exam02_string_methods;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("byte1.length:"+ bytes1.length);
		String str1= new String(bytes1);
		System.out.println("byte1->str1:"+ str1);
		System.out.println();

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length:"+ bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes2->String:"+ str2);
			System.out.println();
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length:"+ bytes3.length);
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("bytes3->String:"+ str3);
			System.out.println();
			
			
		} catch (UnsupportedEncodingException e) {}
		
	}

}

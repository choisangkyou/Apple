package chap11.sec16_confirm_examples;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		System.out.println();
		//split()메소드 사용
		String[] split = str.split(",");
		for(String str2: split)
			System.out.println(str2);

		System.out.println("==============");
		//StringTokenizer() 사용
		StringTokenizer token = new StringTokenizer(str,",");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}

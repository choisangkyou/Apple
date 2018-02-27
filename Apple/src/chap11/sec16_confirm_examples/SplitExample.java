package chap11.sec16_confirm_examples;

import java.util.StringTokenizer;

public class SplitExample {

	public static void main(String[] args) {
		String str = "���̵�,�̸�,�н�����";
		System.out.println();
		//split()�޼ҵ� ���
		String[] split = str.split(",");
		for(String str2: split)
			System.out.println(str2);

		System.out.println("==============");
		//StringTokenizer() ���
		StringTokenizer token = new StringTokenizer(str,",");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}

}

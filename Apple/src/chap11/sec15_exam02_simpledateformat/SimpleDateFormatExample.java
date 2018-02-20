package chap11.sec15_exam02_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyy.MM.dd(E����) a HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("������ D���� ��");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("�̴��� d���� ��");
		System.out.println(sdf.format(date));

	}

}

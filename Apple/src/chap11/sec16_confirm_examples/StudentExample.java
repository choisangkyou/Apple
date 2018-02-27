package chap11.sec16_confirm_examples;

import java.util.HashMap;
import java.util.Set;

public class StudentExample {

	public static void main(String[] args) {
		HashMap<Student,String> hashMap = new HashMap<Student,String>();
		hashMap.put(new Student("1"), "95");
		hashMap.put(new Student("2"), "88");
		hashMap.put(new Student("3"), "78");
		
/*		Set set = hashMap.keySet();
		set.stream()
		.forEach(s-> System.out.println("["+s+"]:"+ hashMap.get(s)));
		*/
		System.out.println();
		//new Student("1")로 점수를 읽어옴
		String score = hashMap.get(new Student("3"));
		System.out.println(score);
		

	}

}

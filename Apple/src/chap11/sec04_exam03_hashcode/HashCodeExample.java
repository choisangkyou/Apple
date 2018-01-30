package chap11.sec04_exam03_hashcode;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		
			Student student1 = new Student("홍길동",30);
			Student student2 = new Student("홍길동",30);
			
			
			System.out.println(student1.hashCode());
			System.out.println(Objects.hashCode(student2));
			
			if(Objects.hash(student1)==Objects.hash(student2)) {
				System.out.println("같다");
			}else {
				System.out.println("다르다");
			}
			
	}

	
	
}

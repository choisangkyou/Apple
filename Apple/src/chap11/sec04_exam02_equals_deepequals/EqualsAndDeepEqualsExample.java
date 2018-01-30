package chap11.sec04_exam02_equals_deepequals;

import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.deepEquals(o1, o2));
		System.out.println(Integer.compare(o1, o2));
		System.out.println(Objects.equals(null,null));
		System.out.println();
		Integer[] arr1 = {10,20};
		Integer[] arr2 = {10,20};
		System.out.println(Objects.equals(arr1,arr2));
		System.out.println(Objects.deepEquals(arr1,arr2));
		System.out.println(Integer.compare(arr1[0], arr2[0]));
		System.out.println(Objects.equals(null,null));
		
		
	}

}

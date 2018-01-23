package chap11.sec03_exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		Member[] objs = {new Member("blue"),new Member("blue"), new Member("red")};
			
		if(objs[0].equals(objs[1])) {
			System.out.println("obj1 -obj2는 동등 합니다.");
		}else {
			System.out.println("obj1 -obj2 는 동등하지 않습니다.");
		}
			
		
		if(objs[1].equals(objs[2])) {
			System.out.println("obj2 -obj3는 동등 합니다.");
		}else {
			System.out.println("obj2 -obj3 는 동등하지 않습니다.");
		}
		
	}	
}

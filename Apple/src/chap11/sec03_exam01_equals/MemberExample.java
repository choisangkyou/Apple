package chap11.sec03_exam01_equals;

public class MemberExample {

	public static void main(String[] args) {
		Member[] objs = {new Member("blue"),new Member("blue"), new Member("red")};
			
		if(objs[0].equals(objs[1])) {
			System.out.println("obj1 -obj2�� ���� �մϴ�.");
		}else {
			System.out.println("obj1 -obj2 �� �������� �ʽ��ϴ�.");
		}
			
		
		if(objs[1].equals(objs[2])) {
			System.out.println("obj2 -obj3�� ���� �մϴ�.");
		}else {
			System.out.println("obj2 -obj3 �� �������� �ʽ��ϴ�.");
		}
		
	}	
}

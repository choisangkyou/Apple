package chap11.sec03_exam04_deepclone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("ȫ�浿",25,new int[] {90,90},new Car("�ҳ�Ÿ"));
		
		//���� ��ü�� ���� �Ŀ� ���� ��ü�� ���� ����
		Member cloned = original.getMember();
		cloned.scores[0] = 100; // ������ ���� ��ü ������ ����
		cloned.car.model ="�׷���";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name:"+cloned.name);
		System.out.println("age:"+ cloned.age);
		
		for(int i = 0; i < cloned.scores.length; i++) {
			System.out.println("scores["+i+"]:"+ cloned.scores[i]);
		}
		
		System.out.println("Car.model:"+ cloned.car.model);
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name:"+original.name);
		System.out.println("age:"+ original.age);
		
		for(int i = 0; i < original.scores.length; i++) {
			System.out.println("scores["+i+"]:"+ original.scores[i]);
		}
		
		System.out.println("Car.model:"+ original.car.model);
	}

}

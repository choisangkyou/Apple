package chap11.sec03_exam04_thinclone;

public class MemberExample {

	public static void main(String[] args) {
		//���� ��ü ����
		Member original = new Member("blue","ȫ�浿","12345",25,true);
		
		//���� ��ü�� ���� �Ŀ� �н����� ����
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[���� ��ü�� �ʵ尪");
		System.out.println("id:"+ cloned.id);
		System.out.println("cloned-password:"+cloned.password);
		System.out.println("original-password:"+ original.password);
	}

}

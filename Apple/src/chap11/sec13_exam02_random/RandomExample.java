package chap11.sec13_exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//���� ��ȣ
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("���ù�ȣ:");
		
		for(int i =0 ; i < 6; i++) {
			selectNumber[i] = random.nextInt(45)+1; //���� ��ȣ ����.
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();

		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(8);
		//System.out.println("Seed:"+random.nextInt());//���ڰ�
		System.out.print("��÷ ��ȣ:");
		for(int i=0; i <6 ; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		//��÷����
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("��÷����:"+ (result==true? "1�� ��÷":"��÷���� �ʾҽ��ϴ�"));
		
	}

}

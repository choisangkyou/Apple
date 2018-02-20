package chap11.sec13_exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//선택 번호
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("선택번호:");
		
		for(int i =0 ; i < 6; i++) {
			selectNumber[i] = random.nextInt(45)+1; //선택 번호 얻어옴.
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();

		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(8);
		//System.out.println("Seed:"+random.nextInt());//종자값
		System.out.print("당첨 번호:");
		for(int i=0; i <6 ; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("당첨여부:"+ (result==true? "1등 당첨":"당첨되지 않았습니다"));
		
	}

}

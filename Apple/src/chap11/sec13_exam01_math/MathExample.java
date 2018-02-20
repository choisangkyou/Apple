package chap11.sec13_exam01_math;

public class MathExample {

	public static void main(String[] args) {
		int v1 = Math.abs(-5); //절대값.
		double v2= Math.abs(-3.14);
		System.out.println("v1:"+ v1 +",v2:"+v2);
		
		double v3 = Math.ceil(5.3);//실수 올림.
		double v4 = Math.ceil(-5.3);
		System.out.println("v3:"+ v3 +",v4:"+v4);
		
		double v5 = Math.floor(5.3);//실수 내림.
		double v6 = Math.floor(-5.3);
		System.out.println("v5:"+ v5 +",v6:"+v6);
				
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7:"+ v7 +",v8:"+v8);
		
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9:"+ v9 +",v10:"+v10);
		
		double v11 = Math.random(); //0>= value <1
		System.out.println("v11:"+ v11);
		//주사위
		int v12 = (int)(Math.random()*6)+1;
		System.out.println("v12:"+ v12);
		
		double v13 = Math.rint(5.3); //가까운 실수로 반올림.
		double v14 = Math.rint(-5.7);
		System.out.println("v13:"+ v13 +",v14:"+v14);
		
		double v15 = Math.pow(10.0, 3.0);
		System.out.println("v15:"+ v15);
		
		long v16 = Math.round(5.3);
		long v17 = Math.round(-5.6);
		System.out.println("v16:"+ v16 +",v17:"+ v17);
		

	}

}

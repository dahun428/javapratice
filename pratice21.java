package cloudstudying;

import java.util.Scanner;

public class pratice21 {

	static int grade;
	private static int g;
	
	public static void grade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է����ּ���");
		g = sc.nextInt(); 
		sc.close();
	}
	
	public static void main(String[] args) {
	 
		pratice21.grade();
		
		if ( g >= 95 ) {
			System.out.println("������ A+ �Դϴ�.");
	
		}else if(g >= 90) {
			System.out.println("������ A0 �Դϴ�.");
			
		}else if (g >= 80) {
			System.out.println("������ B+ �Դϴ�.");
			
		}else if (g >= 70) {
			System.out.println("������ B0 �Դϴ�.");
			
		}else {
			System.out.println("������ C+ �Դϴ�.");
			
		}
		
		
		
		
		
	}

}
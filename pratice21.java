package cloudstudying;

import java.util.Scanner;

public class pratice21 {

	static int grade;
	private static int g;
	
	public static void grade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시험 성적을 입력해주세요");
		g = sc.nextInt(); 
		sc.close();
	}
	
	public static void main(String[] args) {
	 
		pratice21.grade();
		
		if ( g >= 95 ) {
			System.out.println("성적은 A+ 입니다.");
	
		}else if(g >= 90) {
			System.out.println("성적은 A0 입니다.");
			
		}else if (g >= 80) {
			System.out.println("성적은 B+ 입니다.");
			
		}else if (g >= 70) {
			System.out.println("성적은 B0 입니다.");
			
		}else {
			System.out.println("성적은 C+ 입니다.");
			
		}
		
		
		
		
		
	}

}

package cloudstudying;

public class pratice26 {

	double T ;//키
	double W ;//체중
	static double BMI;//비만도 지수
	
	public void BMI(double W, double T) {
		this.T = T;
		this.W = W;
		BMI = W / (T * T);
		
	} 
	public void result() {

		
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", BMI, W , T);
		
		/*
		 * System.out.printf( "BMI : %2.f", BMI );
		 */if(BMI > 30) {
			System.out.println("결과 : 비만입니다.");
		}
		else if(BMI >= 25) {
			System.out.println("결과 : 과체중입니다.");
		}
		else if(BMI >= 18.5) {
			System.out.println("결과 : 정상입니다.");
		}
		else {
			System.out.println("결과 : 저체중입니다.");
		}

	}
	public static void main(String[] args) {
 
		pratice26 p26 = new pratice26();
		p26.BMI(81.6, 1.76);
		p26.result();

		 
	}

}

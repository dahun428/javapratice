package cloudstudying;


public class pratice16 {

	double karoly = 0.02;
	int step = 5000;
	double usekaroly;

	public void usekaroly() {
		usekaroly = step * karoly;
		System.out.printf("�Ҹ�� Į�θ� :  %.2f  kcal " , usekaroly);
	}
	public void run() { 
		usekaroly();
		
	}
 	
	public static void main(String[] args) {
		
		pratice16 p16 = new pratice16();
		p16.run();
	}

}

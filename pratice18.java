package cloudstudying;

public class pratice18 {

	
	 public static int dice() {
		 
		 int a = (int) (6 * Math.random());
		 double dollar = a + 1;
		 
		return (int) dollar ;
		 
	 }
	 public static double exchange(double dollar) {
	
		 return dollar * 1082.25108;
		 
	 }
 
	
	public static void main(String[] args) {
		
	 double dollar = dice() + dice()+dice();
	 double won = exchange(dollar);
	 System.out.printf("ȹ��ݾ� : $%.2f(%.0f��)" , dollar, won);
		
	 
	}

}

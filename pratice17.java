package cloudstudying;

public class pratice17 {

	double gasolin = 8.68;
	double CarA;
	double Km = 182.736;
	double fuelE;
	
	public void fuelE() {
		fuelE = Km / gasolin;
	
	}
	public void CarA() {
		System.out.printf("���� : %.2f km/L " , fuelE);
	}
	
	public static void main(String[] args) {
	 
		pratice17 p17 = new pratice17();
		p17.fuelE();
		p17.CarA();
	}

}

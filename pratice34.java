package cloudstudying;

public class pratice34 {

	public static void main(String[] args) {
 
		int sum = 0;
		for(int i = 0 ; i <=10 ; i++) {
			if( i % 3 == 0) {
				continue;
			}
			System.out.printf("%d", i);
			if( i == 10) {
				break;
			}
			System.out.printf(" + ");
			sum += i;
		}
		System.out.printf("\n => %d\n", sum);
		
		for(int i = 0; i < 4; i++) {
		
			System.out.println(" * ");
			for(int j = 0; j < 4; j++) {
				System.out.printf(" * ");
			}
		}
	}

}

package cloudstudying;

public class pratice41 {

	public static void main(String[] args) {
 
		int [] evens = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
		int [] primes = {2, 3, 5, 7, 11, 13, 17, 19};
		
		int evensum = sum(evens);
		int primesum = sum(primes);
		System.out.println("0 �̻� 20�̸��� ¦���� �Ҽ��� .. ");
		System.out.printf("¦���� �� : %d\n" , evensum);
		System.out.printf("Ȧ���� �� : %d" , primesum);
	
	
	}

	private static int sum(int[] array) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}

}

package cloudstudying;

public class pratice38 {

	public static void main(String[] args) {
 
		String [] W = {"월", "화", "수", "목", "금"};
		int [] minutes = {42,66,57,54,88};
		int sum = 0;
		int avg;
		int hours;
		int n = 5;
		int min;
		
		for(int i = 0; i <n; i++) {
			System.out.printf("%s : %d 분\n", W[i], minutes[i]);
		sum += minutes[i];
		}
		hours = sum / 60;
		min = sum % 60;
		avg = sum / n;
		
		
		System.out.printf("달리기 시간 총합 : %d 시간 %d 분\n", hours , min);
		System.out.printf("달리기 시간 평균 : %d 분", avg);

	}

}

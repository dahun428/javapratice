package cloudstudying;

public class pratice38 {

	public static void main(String[] args) {
 
		String [] W = {"��", "ȭ", "��", "��", "��"};
		int [] minutes = {42,66,57,54,88};
		int sum = 0;
		int avg;
		int hours;
		int n = 5;
		int min;
		
		for(int i = 0; i <n; i++) {
			System.out.printf("%s : %d ��\n", W[i], minutes[i]);
		sum += minutes[i];
		}
		hours = sum / 60;
		min = sum % 60;
		avg = sum / n;
		
		
		System.out.printf("�޸��� �ð� ���� : %d �ð� %d ��\n", hours , min);
		System.out.printf("�޸��� �ð� ��� : %d ��", avg);

	}

}

public class Lec3Ex3 {
	public static void main(String[] args) {

		System.out.println("�Ҽ� ���");
		
		for(int i = 2; i <= 1000; i++) {
			int count = 0;
			for(int j = 2;j <= i; j++) {
				if(i % j == 0)
					count++;
			}
			if(count == 1)
				System.out.print(i + " ");
		}
		
	}
}

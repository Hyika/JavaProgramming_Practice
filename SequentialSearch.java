import java.util.Scanner;
public class SequentialSearch {

	public static void main(String[] args) {
		int s[] = {0, 11, 18, 29, 35, 49, 62, 68, 73, 88, 100};
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = input.nextInt();
		
		for(int i = 0; i < s.length; i++) {
			if(num > s[i] && i == s.length - 1) {
				 // 가장 큰 수 보다 num값이 클 때
				System.out.println(num + "은(는)" + s[s.length - 1] + "보다 큽니다.");
			}
			else if(num < s[0] && i == s.length - 1) {
				// 가장 작은 수 보다 num값이 작을 때
				System.out.println(num + "은(는)" + s[0] + "보다 작습니다.");
			}
			else if(num > s[i] && num < s[i+1]) {
				// 값이 범위 내에 존재하지만 같진 않을 때
				System.out.println(num + "은(는)" + s[i] + "보다 크고 "+ s[i + 1] + "보다 작습니다.");
			}
			else if(num == s[i]) {
				// 값이 범위 내에 존재하면서 같을 때
				System.out.println(num + "은(는) 범위 내에 있고," + (i+1) + "번째에 있습니다!");
			}
		}
		
		
	}

}

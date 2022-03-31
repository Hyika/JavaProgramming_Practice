import java.util.Scanner;

public class StartWWW {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("문자열을 입력하세요(종료는 quit): ");
			String str  = input.next();
			if(str.equals("quit") == true) {
				System.out.println("종료합니다.");
				break;
			}
			if(str.matches("^www\\.(.+)") == true) {
				System.out.println(str + " 은 'www.'로 시작합니다.");
			}
			else {
				System.out.println(str + " 은 'www.'로 시작하지 않습니다.");
			}
		}
	}
}

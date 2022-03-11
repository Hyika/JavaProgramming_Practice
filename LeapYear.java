import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("윤년 확인...년도 입력: ");
		int year = input.nextInt();
		boolean res = (year % 4 == 0);
		System.out.println(res);
	}

}

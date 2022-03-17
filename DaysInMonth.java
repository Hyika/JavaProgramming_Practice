import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("老 荐甫 免仿窍绊 酵篮 岿 蔼 涝仿: ");
		int month = input.nextInt();
		
		switch(month) {
		case 1:{
			System.out.println("31老");
			break;
		}
		case 2:{
			System.out.println("28老 or (辣斥)29老");
			break;
		}
		case 3:{
			System.out.println("31老");
			break;
		}
		case 4:{
			System.out.println("30老");
			break;
		}
		case 5:{
			System.out.println("31老");
			break;
		}
		case 6:{
			System.out.println("30老");
			break;
		}
		case 7:{
			System.out.println("31老");
			break;
		}
		case 8:{
			System.out.println("31老");
			break;
		}
		case 9:{
			System.out.println("30老");
			break;
		}
		case 10:{
			System.out.println("31老");
			break;
		}
		case 11:{
			System.out.println("30老");
			break;
		}
		case 12:{
			System.out.println("31老");
			break;
		}
		}
	}
}

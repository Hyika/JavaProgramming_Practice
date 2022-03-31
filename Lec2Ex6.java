
public class Lec2Ex6 {

	public static void main(String[] args) {
		int[] s = {12, 3, 19, 6, 18, 8, 12, 4, 1, 19};
		int min = s[0];
		for(int i = 0;i<s.length; i++) {
			System.out.print(s[i] + " ");
			if(min > s[i])
				min = s[i];
		}
		System.out.println("\nMIN Value is : " + min);
	}
}

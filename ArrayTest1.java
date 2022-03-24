
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] a = new int[10];
		
		for(int i = 0;i<a.length; i++) {
			a[i] = i;
		}
		
		for(int j = a.length - 1; j >= 0; j--) {
			System.out.print(a[j] + " ");
		}
		
	}
}

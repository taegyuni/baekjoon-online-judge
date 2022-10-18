import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		int n = input.nextInt();
		int count = 1;
		int area = 1;
		while (area < n) {
			area += 6 * count;
			count ++;
		}
		System.out.println(count);
	}
}

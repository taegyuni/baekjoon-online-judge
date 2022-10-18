import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = 1; //좌
		int b = 1; //우
		int n = input.nextInt(); //n번째
		boolean c = false;		
		while (n > 1) {
			if (c) {
				if (b != 1) {
					b--;
					a++;
				}else {
					a++;
					c = false;
				}
			}
			else {
				if (a != 1) {
					a--;
					b++;
				}else {
					b++;
					c = true;
				}
			}
			n--;
		}
		System.out.println(a + "/" + b);
	}
}

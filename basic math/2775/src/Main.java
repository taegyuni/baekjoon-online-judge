import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(input.readLine());
		int count = 0;	
		while(count < t) {		
			int k = Integer.parseInt(input.readLine());
			int n = Integer.parseInt(input.readLine());			
			System.out.println(recursive(k, n));
			count++;
		}
	}
	public static int recursive(int k, int n) {
		if (n == 1) {
			return 1;
		}
		if (k == 0) {
			return n;
		}
		return recursive(k, n-1) + recursive(k-1, n);
	}
}

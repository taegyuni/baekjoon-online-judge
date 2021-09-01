import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String s = input.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		
		int d = ((z-x) != (x-y)) ? (int)Math.ceil((z - x) / (double)(x -y)) : 0;
		
		System.out.println(d+1);
	}
}

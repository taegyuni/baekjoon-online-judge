import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(input.readLine());
		String str;
		int h, w, n;
		int result;
		for (int i = 0; i < t; i++) {
			str = input.readLine();
			StringTokenizer st = new StringTokenizer(str);
			h = Integer.parseInt(st.nextToken());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			if((n % h) == 0) {
				result = h * 100;
			}else {
				result = n % h * 100;
			}
			result += (int)Math.ceil(n / (double)h);
			out.write(String.valueOf(result + "\n"));
			out.flush();
		}
		out.close();
	}
}

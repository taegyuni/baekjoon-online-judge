import java.util.Scanner;
public class CroatianAlphabet_2941 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String a;
		int count = 0; 
		a = input.next();
		while (a.length() > 0) {
			if(a.contains("c=")) {
				a = a.replaceFirst("c=", "_");
				count++;
			}else if (a.contains("c-")) {
				a = a.replaceFirst("c-", "_");
				count++;
			}else if (a.contains("dz=")) {
				a = a.replaceFirst("dz=", "_");
				count++;
			}else if (a.contains("d-")) {
				a = a.replaceFirst("d-", "_");
				count++;
			}else if (a.contains("lj")) {
				a = a.replaceFirst("lj", "_");
				count++;
			}else if (a.contains("nj")) {
				a = a.replaceFirst("nj", "_");
				count++;
			}else if (a.contains("s=")) {
				a = a.replaceFirst("s=", "_");
				count++;
			}else if (a.contains("z=")) {
				a = a.replaceFirst("z=", "_");
				count++;
			}else {
				if (a.charAt(0) != '_') {
					count++;
				}
				a = a.substring(1, a.length());
			}
		}
		System.out.println(count);
	}
}

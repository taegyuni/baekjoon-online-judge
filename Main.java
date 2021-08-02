import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		int count = 0;
		num = input.nextInt();
		
		for(int i = 0; i < num; i++) {
			boolean group_check = true;
			String temp = input.next();
			
			if (temp.length() == 1) {
				count++;
				continue;
			}			
			String[] array;
			array = temp.split("");

			for (int j = 0; j < array.length -1 ;j++) {
				if (array[j].equals(array[j+1])) {
					array[j] = "";

				}
				for (int k = j; k >= 0 ; k--) {
					if (array[k].equals(array[j+1])) {
						group_check = false;
						break;
					}
				}
			}
			if (group_check) {
				count++;
			}
		}
		System.out.println(count);
	}
}

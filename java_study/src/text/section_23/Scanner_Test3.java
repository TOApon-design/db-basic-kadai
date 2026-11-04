package text.section_23;

import java.util.Scanner;

public class Scanner_Test3 {

	public static void main(String[] args) {
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		System.out.println("入力した整数は" + input);
		
		scanner.close();

	}

}

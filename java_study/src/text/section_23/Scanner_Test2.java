package text.section_23;

import java.util.Scanner;

public class Scanner_Test2 {

	public static void main(String[] args) {
		System.out.println("入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		System.out.println(input);
		
		scanner.close();

	}

}

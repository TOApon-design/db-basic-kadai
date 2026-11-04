package text.section_23;

import java.util.Scanner;

public class Scanner_Test5 {

	public static void main(String[] args) {
		System.out.println("真偽値を入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean input = scanner.nextBoolean();
		
		System.out.println("入力した真偽値は" + input);
		
		scanner.close();

	}

}

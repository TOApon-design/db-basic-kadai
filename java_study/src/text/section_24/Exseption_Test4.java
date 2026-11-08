package text.section_24;

import java.util.Scanner;

public class Exseption_Test4 {

	public static void main(String[] args) {
		System.out.println("入力しましょう");

		String input = null;
		
		try (Scanner scanner = new Scanner(System.in)){
			input = scanner.next();
		}
		System.out.println("入力した内容は" + input);

	}

}

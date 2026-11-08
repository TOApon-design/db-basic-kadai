package text.section_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_Test7 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("src/text/section_23/file.txt"));
		
		while(scanner.hasNext()) {
			String input = scanner.nextLine();
			System.out.println(input);
		}
		

	}

}

package text.section_23;

import java.io.File;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Scanner_Test7 {

	public static void main(String[] args) throws FileSystemNotFoundException {
		Scanner scanner = new Scanner(new File("file.txt"));
		
		while(scanner.hasNext()) {
			String input = scanner.nextLine();
			System.out.println(input);
		}
		

	}

}

package text.section_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime2_Test5 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(1999, 1, 2, 5, 10, 20);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		String afterFormat = dateTime.format(formatter);
		
		System.out.println(afterFormat);
		

	}

}

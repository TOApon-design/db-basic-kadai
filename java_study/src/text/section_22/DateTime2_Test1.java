package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test1 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(1999, 1, 2);
		
		System.out.println(date2);

	}

}

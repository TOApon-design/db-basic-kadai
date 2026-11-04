package text.section_22;

import java.time.LocalDateTime;

public class DateTime2_Test6 {

	public static void main(String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);
		LocalDateTime dateTime2 = LocalDateTime.of(2000, 02, 20, 03, 40, 50);
		LocalDateTime dateTime3 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);
		
		if(dateTime1.isAfter(dateTime2)) {
			System.out.println("日付が比較対象の日付より後の日付です");
		}
		if (dateTime1.isBefore(dateTime2)) {
			System.out.println("日付が比較対象の日付より前の日付です");
		}
			
		      //日付が比較対象の日付と等しい日付か判定する 
		if (dateTime1.isEqual(dateTime3)) {
			System.out.println("日付が比較対象の日付と同じ日付です");
		}

	}

}

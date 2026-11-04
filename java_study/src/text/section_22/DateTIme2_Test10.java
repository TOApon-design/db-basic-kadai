package text.section_22;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateTIme2_Test10 {

	public static void main(String[] args) {
		LocalDateTime dateTime3 = LocalDateTime.of(1999, 01, 10, 01, 10, 10);
		LocalDateTime dateTime4 = LocalDateTime.of(1999, 01, 10, 02, 20, 10);
		
		Duration duration = Duration.between(dateTime3, dateTime4);
		System.out.println( "時間の差分は：" + duration.toHours() + "時間");
		System.out.println( "分の差分は：" + duration.toMinutes() + "分");
		System.out.println( "秒の差分は：" + duration.toSeconds() + "秒");
	}

}

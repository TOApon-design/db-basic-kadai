package text.section_22;

import java.time.LocalDateTime;
import java.time.Period;

public class DateTime2_Test9 {

	public static void main(String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.of(1999, 01, 10, 02, 30, 40);
		LocalDateTime dateTime2 = LocalDateTime.of(2000, 03, 20, 03, 40, 50);
		
		Period period = Period.between(dateTime1.toLocalDate(), dateTime2.toLocalDate());
		System.out.println( "年の差分は" + period.getYears() + "年");
	    System.out.println( "月の差分は" + period.getMonths() + "月");
	    System.out.println( "日の差分は" + period.getDays() + "日");
	}

}

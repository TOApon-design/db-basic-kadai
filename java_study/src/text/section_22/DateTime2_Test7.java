package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test7 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(1999, 1, 2);
		
		System.out.println(date1);
		//指定する日付に1年加算して出力する
		System.out.println("1年後は" + date1.plusYears(1));
		//指定する日付に1月加算して出力する
		System.out.println("1月後は" + date1.plusMonths(1));
		//指定する日付に5日加算して出力する
		System.out.println("5日後は" + date1.plusDays(5));

	}

}

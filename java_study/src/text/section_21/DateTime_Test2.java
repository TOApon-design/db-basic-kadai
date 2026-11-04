package text.section_21;

import java.util.Calendar;
import java.util.Date;

public class DateTime_Test2 {

	public static void main(String[] args) {
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(date);
		
		System.out.println("年は" + calendar.get(Calendar.YEAR));
		System.out.println("月は"+calendar.get(Calendar.MONTH));
		System.out.println("日は"+calendar.get(Calendar.DATE));
		
		//任意の時分秒を取得して、出力する
		System.out.println("時間は"+calendar.get(Calendar.HOUR));
		System.out.println("分は"+calendar.get(Calendar.MINUTE));
		System.out.println("秒は"+calendar.get(Calendar.SECOND));

	}

}

package text.section_21;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime_Test4 {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		
		System.out.println(format.format(date));

	}

}

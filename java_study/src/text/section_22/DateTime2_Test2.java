package text.section_22;

import java.time.LocalTime;

public class DateTime2_Test2 {

	public static void main(String[] args) {
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.of(5, 10, 20);
		
		System.out.println(time2);

	}

}

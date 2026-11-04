package text.section_19;

public class String_Test6 {

	public static void main(String[] args) {
	      String moji1 = "あいう,かきく,さしす,たちつ";
			
	      //分割する文字列のみ指定する
	      String[] array1 = moji1.split(",");
	      
	      for(int i = 0; i < array1.length; i++) {
	    	  System.out.println(array1[i]);
	      }

	}

}

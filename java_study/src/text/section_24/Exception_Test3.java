package text.section_24;

public class Exception_Test3 {

	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 0;
		
		try {
			System.out.println(number1 / number2);
		} catch (IllegalStateException e) {
			System.out.println("メソッドの呼び出しが不適切です");		
		} catch (NullPointerException e) {
			System.out.println("オブジェクトがnullです");
		} catch (ArithmeticException e) {
			System.out.println("不適切な計算が行われました");
		}
		System.out.println("処理終了です");
	}

}

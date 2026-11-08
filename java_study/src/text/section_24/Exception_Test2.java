package text.section_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Test2 {

	public static void main(String[] args) {
		System.out.println("整数を入力しましょう");

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		
		try {
			//入力した内容を取得する
			int input = scanner.nextInt();
			System.out.println(input);
		} catch (InputMismatchException e) {
			System.out.println("整数の入力ではありません");
		} finally {
			System.out.println("Scannerクラスのオブジェクトをクローズします");
			scanner.close();
		}
		System.out.println("処理終了です");
	}

}

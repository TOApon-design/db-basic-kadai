package text.section_25;

import java.util.Scanner;

public class SentenceCapitalizer {

	public static void main(String[] args) {
		System.out.println("英文を入力してください。各単語の先頭を大文字に変換します。");

        // ユーザーからの入力を受け取る
        Scanner scanner = new Scanner(System.in);

        // 英文を取得
        String sentence = scanner.nextLine();
        scanner.close();
        
        if (sentence.trim().isEmpty()) {
        	System.out.println("英文が入力されていません。");
            return;
        }
        String[] words = sentence.split("\\s+");
        
        for(String word : words) {
        	System.out.println("[" + word+ "]");
        }
        
        for (int i = 0; i < words.length; i++) {
            // 単語の先頭だけを大文字にする
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        String result = String.join(" ", words);
        System.out.println("変換後：" + result);
	}

}

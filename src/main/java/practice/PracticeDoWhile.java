package practice;

public class PracticeDoWhile {

	public static void practicedoWhile() {
		int num = 100; // 初期値設定 numの初期値は100

		do {
			System.out.println(num--); // 変数numをコンソールに表示(後置デクリメント)

		} while (num >= 0); // numが0以上の場合、ブロック内の処理が繰り返される

	}

}
package practice;

public class PracticeFor {

	public static void practiceFor() {
		int sum = 0; // 初期値設定 sumの初期値は0

		for (int i = 1; i <= 100; i++) { // iの初期値は1で、1ずつ加算される
			sum += i; // sum + i の結果をsumに代入する
		} // iが100以下の場合、ブロック内の処理が繰り返される

		System.out.println(sum); //変数sumをコンソールに表示

	}
}
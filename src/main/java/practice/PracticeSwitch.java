package practice;

public class PracticeSwitch {

	public static void practiceSwitch() {

		int[] numArray = { 1, 2, 3, 4, 5, 2, 3, 5, 1, 4 }; //配列を作成

		for (int i = 0; i < 10; i++) { // iの初期値は0で、1ずつ加算される

			int num = numArray[i]; // 変数numに配列numArray[i]のデータを代入

			switch (num) {  // 変数numを呼び出す
			case 1: // データの値が1だった場合
				System.out.println("勇者"); // 勇者をコンソールに表示
				break; // 処理から抜ける

			case 2: // データの値が2だった場合
				System.out.println("バトルマスター"); // バトルマスターをコンソールに表示
				break; // 処理から抜ける

			case 3: // データの値が3だった場合
				System.out.println("パラディン"); // パラディンをコンソールに表示
				break; // 処理から抜ける

			case 4: // データの値が4だった場合
				System.out.println("海賊"); // 海賊をコンソールに表示
				break; // 処理から抜ける

			case 5: // データの値が5だった場合
				System.out.println("魔法剣士"); // 魔法剣士をコンソールに表示
				break; // 処理から抜ける

			} // iが10より小さい場合、ブロック内の処理が繰り返される
		}

	}

}
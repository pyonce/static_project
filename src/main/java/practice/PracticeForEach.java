package practice;

public class PracticeForEach {

	public static void practiceForEach() {
		String nameList[] = { "田中", "佐藤", "近藤", "村上", "吉田", "山田", "酒井", "中村",
				"高杉", "加藤" }; //配列を作成

		for (String name : nameList) { //配列のデータを順番に取り出して処理する(拡張for文)
			System.out.println(name); //変数nameをコンソールに表示
		}

	}

}
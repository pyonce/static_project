package practice;

public class PracticeIf {

	public static void practiceIf() {

		for (int i = 1; i <= 100; i++) { // iの初期値は1で、1ずつ加算される

			if (i % 3 == 0 && i % 5 == 0) { // iが3と5で割り切れる場合
				System.out.println("FizzBuzz"); // FizzBuzzをコンソールに表示

			} else if (i % 3 == 0) { // iが3で割り切れる場合
				System.out.println("Fizz"); // Fizzをコンソールに表示

			} else if (i % 5 == 0) { // iが5で割り切れる場合
				System.out.println("Buzz"); // Buzzをコンソールに表示

			} else //その他の場合
				System.out.println(i); // iの値をコンソールに表示			
		} // iが100以下の場合、ブロック内の処理が繰り返される
	}
}
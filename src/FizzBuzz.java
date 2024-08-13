
public class FizzBuzz {

	public static void main(String[] args) {
		// 1から100までのループ
		for (int i = 1; i <= 100; i++) {
			// 3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");

			// 3で割り切れる数値の場合、「Fizz」と表示する
			else if (i % 3 == 0)
				System.out.println("Fizz");

			// 5で割り切れる数値の場合、「Buzz」と表示する
			else if (i % 5 == 0)
				System.out.println("Buzz");

			// それ以外の数値は、その数値をそのまま表示
			System.out.println(i);
		}
	}
}

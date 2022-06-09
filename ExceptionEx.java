import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter fst number for division");
		int fnum = scan.nextInt();
		System.out.println("Enter second number for division");
		int snum = scan.nextInt();
		try {
			int result = fnum / snum;

			System.out.println(result);// 1)system defined error messages 2)abnormal termination
		} // 1)friendly error messages 2)normal termination
		catch (ArithmeticException e) {
			System.out.println("dont enter zero as denominator");
		}
		System.out.println("remaining 1000 lines of code ");
	}
}
//
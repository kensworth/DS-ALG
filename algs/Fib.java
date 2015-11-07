import java.util.Scanner;
public class Fib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(fibonacci(number));
	}
	public static long fibonacci(int number) {
		if(number == 0) {
			return 0;
		}
		else if(number == 1) {
			return 1;
		}
		else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}
}
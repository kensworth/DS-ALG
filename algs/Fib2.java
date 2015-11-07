import java.util.Scanner;
public class Fib2 {
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
			int temp1 = 0;
			int temp2 = 1;
			int result = 0;
			int counter = 2;
			while(counter <= number) {
				result = temp1 + temp2;
				temp1 = temp2;
				temp2 = result;
				counter++;
			}
			return result;
		}
	}
}
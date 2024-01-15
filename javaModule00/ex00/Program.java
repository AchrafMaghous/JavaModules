public class Program {
	public static void main(String[] args) {
		int	number = 479598;
		int output = 0;
		while(number != 0) {
			output += number % 10;
			number /= 10;
		}
		System.out.println(output);
	}
}

import java.io.*;

class SumTwoNumbers {
	public static void main(String[] args) {
		if (args.length > 0) {
			SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			sumTwoNumbers.sum(num1, num2);
		} else {
			System.out.println("error: need to give two values to compute");
		}
	}

	public void sum(int num1, int num2) {
		int answer = num1 + num2;
		System.out.println("The answer is "+ answer);
	}
}

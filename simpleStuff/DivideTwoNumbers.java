import java.io.*;

class DivideTwoNumbers {
	public static void main(String[] args) {
		if (args.length > 0) {
			DivideTwoNumbers divideTwoNumbers = new DivideTwoNumbers();

			divideTwoNumbers.firstArgumentBySecondArgument(args);
			
		} else {
			System.out.println("Error... two numbers needed as arguments");
			System.exit(1);
		}
	}

	private void firstArgumentBySecondArgument(String[] args) {
		if (new String(args[1]).equals("0")) {
			System.out.println("Error: this divisor is illegal value");
			System.exit(0);
		}
		float valueOne = Float.parseFloat(args[0]);
		float valueTwo = Float.parseFloat(args[1]);
		float result = valueOne / valueTwo;

		System.out.println(args[0]+" divided by "+args[1]+" equals "+result);
	}

}

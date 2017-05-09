import java.io.*;

/**
 * my own simple java class to start
 * (C) 2016 Matthew Schmidt
 */
class Input {
	public static void main(String[] args) {
		if (args.length > 0) {
			Input myInput = new Input();
			String myValue = args[0];
			myInput.showName(myValue);
		} else {
			System.out.println("error: need to give a value");
		}
	}

	public Input() {
		System.out.println("Executing Input class in Java...");
	}

	public void showName(String name) {
		String nameCaps = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		System.out.println("Your name is "+nameCaps+".");
	}
}

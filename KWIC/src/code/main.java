package code;

import java.util.ArrayList;

/* main - Contains the main method that starts the program and asks the user for configurations. 
The corresponding strategies are then used to output each permutation of each sentence in alphabetical order.
*/

public class main {
	//Prepare strategies
	private static InputContext inputContext = new InputContext();
	private static OutputContext outputContext = new OutputContext();
	private static InputHelper inputHelper = new InputHelper();
	private static CircularShift circularShift = new CircularShift();
	private static Alphabetizer alphabetizer = new Alphabetizer();

	public static void main(String[] args) {
		
		//Ask user to configure input and output types
		System.out.println("Do you want to enter sentences through console or text?\n1) console input\n2)text file input\n3) quit script");
		String inputType = inputHelper.getType();
		System.out.println("Do you want to output results through console or text?\n1) console output\n2)text file output\n3) quit script");
		String outputType = inputHelper.getType();
		
		System.out.println("You will enter sentences via "+inputType+" and it will output via "+outputType+".\n");
		
		//Get input from the requested input type
		if (inputType.equalsIgnoreCase("console")) {
			inputContext.setInput(new ConsoleInput());
			
		}
		else if (inputType.equalsIgnoreCase("text file")) {
			inputContext.setInput(new FileInput());
		}
		
		ArrayList<String> list = inputContext.getInput();
		
		//Circular shift and alphabetize the input
		ArrayList<String> shift = circularShift.circularShift(list);
		ArrayList<String> result = alphabetizer.alphabetize(shift);
		
		//Output the results to the requested output type
		if (outputType.equalsIgnoreCase("console")) {
			outputContext.setOutput(new ConsoleOutput());
			outputContext.getOutput(result);
		}
		else if (outputType.equalsIgnoreCase("text file")) {
			System.out.println("\nEnter the text file name (without .txt extension) you want to write the results to.");
			String outputName = inputHelper.getInput();
			outputContext.setOutput(new FileOutput(outputName));
			outputContext.getOutput(result);

		}
		
		
	}


}

package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputHelper {
	protected final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public String getInput() {
		String userInput = "";
		while (true) {
			try{
				userInput = input.readLine();
				}
			catch (IOException e) {
				System.out.println("Cannot read input.");
				}
			if (userInput.isEmpty()) {
				System.out.println("Cannot accept empty input. Try again.");
				} 
			else {break;}
			}
		return userInput;
		}
	
	//Ask user how they will like their input and output to be done through console or text respectively
	public String getType () {
		String userInput = "";
		String inputType = "";
		while (true) {
			try{
				userInput = input.readLine();
			}
			catch (IOException e) {
				System.out.println("Cannot read input.");
			}
			if (userInput.isEmpty()) {
				System.out.println("Cannot accept empty input. Try again.");
			} 
			else if (!isInt(userInput)) {
				System.out.println("Not a valid option.");
			}
			
			else {
				int choice = Integer.parseInt(userInput);
				if (choice == 1) {
					inputType = "console";
					break;
				}
				else if (choice == 2) {
					inputType = "text file";
					break;
				}
				else if (choice == 3) {
					System.out.println("Exiting script.");
					System.exit(0);
				}
				else {System.out.println("Not a valid option.");}	
			}
		}
		
		return inputType;
	}
	
	//Check if user input is a number for menu navigation
    public boolean isInt(String num) {
        try {
            Integer.parseInt(num);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}

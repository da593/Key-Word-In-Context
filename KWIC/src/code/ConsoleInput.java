package code;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 * ConsoleInput - A class that represents input entered via console. Hitting enter will enter a new line of input.
 */

public class ConsoleInput extends Input {
	
	//Ask user to input sentences via console
	public ArrayList<String> getInputMedium() {
		System.out.println("Enter the sentences. Type STOP (case insensitive) to stop inputting.");
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
			else if (userInput.equalsIgnoreCase("stop") ) {
				break;
			}
			else {
				String sentence = super.removePunctuations(userInput);
				lineStorage.addLine(sentence);
			}
			
		}
		return lineStorage.getSentences();
	}
	

    

   
   }
   
	


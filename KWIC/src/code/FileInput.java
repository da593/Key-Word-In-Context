package code;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
/*
 * FileInput - A class that represents input from a file, particularly a text file. It searches the project folder for files (KWIC/*.txt).
 */

public class FileInput extends Input {
	private String fileName = "";
	private String directory = System.getProperty("user.dir");
	private String sep = File.separator;
	private final String EXTENSION = ".txt";


	public void FileInput(String fileName) {
		this.fileName = fileName;
	}
	
	//Gets input from the text file if the text file is found in the project directory (KWIC/*.txt)
	public ArrayList<String> getInputMedium() {
	
		System.out.println("\nEnter the text file name (without .txt extension) you want to input into the script. Enter QUIT to exit script");
		while (true) {
			InputHelper iHelper = new InputHelper();
			String input = iHelper.getInput(); 
			if (input.equalsIgnoreCase("quit")) {
				break;
			}
			else {
				this.setFileName(input);
			}
			try {
				File file = new File(this.directory+this.sep+this.fileName+this.EXTENSION);
				Scanner myReader = new Scanner(file);
				while (myReader.hasNextLine()) {
					String sentence = myReader.nextLine();
					sentence = super.removePunctuations(sentence);
					lineStorage.addLine(sentence);
				}
				break;
			} 
			catch (FileNotFoundException e) {
			System.out.println("File not found");
			
			}
		}
		return lineStorage.getSentences();
	}
		
	

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return this.fileName;
	}

}

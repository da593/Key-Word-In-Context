package code;
import java.io.File;

/*
 * FileOutput - A class that outputs the KWIC results to a text file. The text file is created and stored in the project folder (KWIC/*.txt).
 */

import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;
public class FileOutput extends Output {
	private final String EXTENSION = ".txt";
	private String fileName = "";
	private String newLine = System.getProperty("line.separator");
	
	public FileOutput(String fileName) {
		this.fileName = fileName;
	}
	
	//Writes to the given text file as long as there is permission (have not tested when permission is not enabled).
	public void outputResults (ArrayList<String> results ) {
		try {
			FileWriter fw = new FileWriter(this.fileName+this.EXTENSION);
			
			for (String sentence: results) {
				fw.write(sentence+newLine);
			}
			System.out.println("\nThe results have been written to "+this.fileName+this.EXTENSION);
			fw.close();
		}
		catch (IOException e) {
			System.out.println("An error occurred.");
		}
	}
	
	//Creates file as long as there is permission (have not tested when permission is not enabled).
	public void createFile(String fileName) {
		File file = new File(fileName+this.EXTENSION);
		
		
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return this.fileName;
	}

}

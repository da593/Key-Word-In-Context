package code;
import java.util.ArrayList;
public class InputContext {
	private Input input;
	
	public void setInput(Input input) {
		this.input = input;
	}
	
	public Input getInputType() {
		return this.input;
	}
	
	public ArrayList<String> getInput() {
		return this.input.getInputMedium();
	}
}

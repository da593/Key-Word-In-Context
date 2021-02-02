package code;
import java.util.ArrayList;

public class OutputContext {
	private Output output;
	
	public void setOutput(Output output) {
		this.output = output;
	}
	
	public Output getOutputType() {
		return this.output;
	}
	
	public void getOutput(ArrayList<String> results) {
		this.output.outputResults(results);
	}
}

package calculateWordAmount;

import java.nio.file.Path;

public class ArgumentInputOutputHolder {
	private String inputPath;
	private String outputPath;
	
	String getInputPath() {
		return inputPath;
	}
	void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}
	public String getOutputPath() {
		return outputPath;
	}
	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}
}

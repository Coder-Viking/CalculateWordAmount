package calculateWordAmount;

public class ArgumentInputOutputHolder {
	private String inputPath;
	private String outputPath;
	private boolean debugSession;
	
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

	public void setDebugSession(String debugSession) {
		if (debugSession != null) {

			this.debugSession = debugSession.contentEquals("-debug") ? true : false;
		}
	}

	public boolean getIsDebugSession() {
		return debugSession;
	}
}

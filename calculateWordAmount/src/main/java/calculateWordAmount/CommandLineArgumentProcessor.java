package calculateWordAmount;

public class CommandLineArgumentProcessor {

	public ArgumentInputOutputHolder checkAndprocessGivenArguments(String[] args) {
		// TODO Split the Arguments, Check if Valid and return a new Holder object, to contain input and output. This one will be just a Placeholder
		ArgumentInputOutputHolder argumentInputOutputHolder = new ArgumentInputOutputHolder();
		argumentInputOutputHolder.setInputPath("testInput.txt");
		argumentInputOutputHolder.setOutputPath("testOutput.xml");
		return argumentInputOutputHolder;
	}
}

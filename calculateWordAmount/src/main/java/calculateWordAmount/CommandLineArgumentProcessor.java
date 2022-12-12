package calculateWordAmount;

import java.util.logging.Logger;

public class CommandLineArgumentProcessor {
	Logger logger = Logger.getLogger(getClass().getName());

	public ArgumentInputOutputHolder checkAndprocessGivenArguments(String[] args) {
		// TODO Split the Arguments, Check if Valid and return a new Holder object, to contain input and output. This one will be just a Placeholder
		ArgumentInputOutputHolder argumentInputOutputHolder = new ArgumentInputOutputHolder();
		if(!args[0].contains(".txt")) {
			throw new RuntimeException(String
					.format("The first Argument has to be a Plain-Text file, ending with '.txt' - given: %s", args[0]));
		}
		argumentInputOutputHolder.setInputPath(args[0]);
		if(!args[1].contains(".xml")) {
			throw new RuntimeException(String
					.format("The second Argument has to be a xml-file, ending with '.xml' - given: %s", args[1]));
		}
		argumentInputOutputHolder.setOutputPath(args[1]);

		return argumentInputOutputHolder;
	}

}

package calculateWordAmount;

import java.util.logging.Logger;

public class CommandLineArgumentProcessor {
	Logger logger = Logger.getLogger(getClass().getName());

	public ArgumentInputOutputHolder checkAndprocessGivenArguments(String[] args) {
		if (args.length < 2) {
			return returnNullWhenInvalidInput();
		}
		ArgumentInputOutputHolder argumentInputOutputHolder = new ArgumentInputOutputHolder();
		if (!args[0].endsWith(".txt")) {
			System.out.println(String
					.format("The first Argument has to be a Plain-Text file, ending with '.txt' - given: %s",
							args[0]));
			return returnNullWhenInvalidInput();
		}
		argumentInputOutputHolder.setInputPath(args[0]);
		if (!args[1].endsWith(".xml")) {
			System.out.println(
					String.format("The second Argument has to be a xml-file, ending with '.xml' - given: %s", args[1]));
			return returnNullWhenInvalidInput();
		}
		argumentInputOutputHolder.setOutputPath(args[1]);

		return argumentInputOutputHolder;
	}

	private ArgumentInputOutputHolder returnNullWhenInvalidInput() {
		return null;
	}


}

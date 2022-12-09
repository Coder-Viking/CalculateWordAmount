package calculateWordAmount;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		ArgumentInputOutputHolder argumentInputOutputHolder = new CommandLineArgumentProcessor().checkAndprocessGivenArguments(args);
		File loadedTextFile = new TextFileLoader().loadFile(argumentInputOutputHolder.getInputPath());
		/* StringBuilder stringBuilder = */
		/*WordStatisticsCalculator wordStatisticsCalculator = new WordStatisticsCalculator();
		HashMap hashmap = wordStatisticsCalculator.countWordsAndReturnHashmap()
		StatisticsResultHolder statisticsResultHolder = new StatisticsResultHolder()*/
	}

}

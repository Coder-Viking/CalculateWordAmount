package calculateWordAmount;

public class Main {

	public static void main(String[] args) {

		ArgumentInputOutputHolder argumentInputOutputHolder = new CommandLineArgumentProcessor().checkAndprocessGivenArguments(args);
		StringBuilder stringBuilder = new LoadTextFromFile().loadTextFromFile(argumentInputOutputHolder.getInputPath());
		/* StringBuilder stringBuilder = */
		/*WordStatisticsCalculator wordStatisticsCalculator = new WordStatisticsCalculator();
		HashMap hashmap = wordStatisticsCalculator.countWordsAndReturnHashmap()
		StatisticsResultHolder statisticsResultHolder = new StatisticsResultHolder()*/
	}

}

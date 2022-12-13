package calculateWordAmount;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		ArgumentInputOutputHolder argumentInputOutputHolder = new CommandLineArgumentProcessor().checkAndprocessGivenArguments(args);
		if (argumentInputOutputHolder == null) {
			System.out.println(
					"You have to supply at least 2 Arguments:\nUsage:\n     statisticsCalculator 'c:/path/to/input.txt' 'c:/path/to/output.xml'");
			return;
		}
		StringBuilder stringBuilder = new LoadTextFromFile().loadTextFromFile(argumentInputOutputHolder.getInputPath());
		if (stringBuilder == null) {
			return;
		}
		HashMap<String, Integer> hashmap = new WordStatisticsCalculator()
				.countWordsAndReturnHashmap(stringBuilder.toString());
		String resultingXmlString = new XmlFromHashmapGenerator().generateXmlFromHashmap(hashmap);
		if (resultingXmlString == null) {
			return;
		}
		boolean writeSuccess = new WriteXmlToFile().writeXmlStringToFile(resultingXmlString,
				argumentInputOutputHolder.getOutputPath());
		if (!writeSuccess) {
			return;
		}
		System.out.println("File Successfully written to: " + argumentInputOutputHolder.getOutputPath());
	}

}

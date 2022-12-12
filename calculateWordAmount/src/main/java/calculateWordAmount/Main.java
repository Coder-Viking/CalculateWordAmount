package calculateWordAmount;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		ArgumentInputOutputHolder argumentInputOutputHolder = new CommandLineArgumentProcessor().checkAndprocessGivenArguments(args);
		StringBuilder stringBuilder = new LoadTextFromFile().loadTextFromFile(argumentInputOutputHolder.getInputPath());
		System.out.println("File read from: " + argumentInputOutputHolder.getInputPath());
		HashMap<String, Integer> hashmap = new WordStatisticsCalculator()
				.countWordsAndReturnHashmap(stringBuilder.toString());
		String resultingXmlString = new XmlFromHashmapGenerator().generateXmlFromHashmap(hashmap);
		System.out.println(
				"Calculation of Words successful... writing XmlFile to: " + argumentInputOutputHolder.getOutputPath());
		boolean writeSuccess = new WriteXmlToFile().writeXmlStringToFile(resultingXmlString,
				argumentInputOutputHolder.getOutputPath());
		if (writeSuccess) {
			System.out.println("File Successfully written to: " + argumentInputOutputHolder.getOutputPath());
		}
	}

}

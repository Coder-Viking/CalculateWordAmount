package calculateWordAmount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadTextFromFile {

	public StringBuilder loadTextFromFile(String inputPath) {
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath))) {
			String currentLineFromBuffer;
			while ((currentLineFromBuffer = bufferedReader.readLine()) != null) {
				stringBuilder.append(currentLineFromBuffer);
			}
		} catch (IOException e) {
			System.out.println(String.format("Text from file %s could not be loaded, %s", inputPath, e.getMessage()));
			return null;
		}
		return stringBuilder;
	}
}

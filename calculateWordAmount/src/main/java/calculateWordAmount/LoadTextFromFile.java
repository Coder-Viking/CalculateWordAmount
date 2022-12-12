package calculateWordAmount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoadTextFromFile {
	Logger logger = Logger.getLogger(this.getClass().getName());

	public StringBuilder loadTextFromFile(String inputPath) {
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath))) {
			String currentLineFromBuffer;
			while ((currentLineFromBuffer = bufferedReader.readLine()) != null) {
				stringBuilder.append(currentLineFromBuffer);
			}
		} catch (IOException e) {
			logger.log(Level.SEVERE,
					String.format("Text from file %s could not be loaded, %s", inputPath, e.getMessage()));
		}
		return stringBuilder;
	}
}

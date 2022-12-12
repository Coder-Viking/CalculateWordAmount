package calculateWordAmount;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteXmlToFile {
	Logger logger = Logger.getLogger(getClass().getName());

	public boolean writeXmlStringToFile(String stringContainingXml, String pathToWriteTo) {
		boolean writingSuccesful = true;
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(pathToWriteTo);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(stringContainingXml);
		} catch (IOException e) {
			logger.log(Level.SEVERE,
					String.format("XML-File could not be created in: %s - message: %s", pathToWriteTo, e.getMessage()));
			writingSuccesful = false;
		} finally {
			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				throw new RuntimeException(
						String.format("Memory Leak, FileWriters could not be closed - Message: %s", e.getMessage()));
			}
		}
		return writingSuccesful;
	}

}

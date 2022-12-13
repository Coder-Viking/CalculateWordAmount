package calculateWordAmount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class WriteXmlToFileTest {
	Logger logger = Logger.getLogger(getClass().getName());

	@Test
	public void writeXmlStringToFileTest() {
		String pathToTestFile = "testFile.xml";
		String testXmlForFile = "<iAmXml><soNice></soNice></iAmXml>";
		new WriteXmlToFile().writeXmlStringToFile(testXmlForFile, pathToTestFile);
		assert Files.exists(Paths.get(pathToTestFile));
			try {
				Files.delete(Paths.get(pathToTestFile));
			} catch (IOException e) {
				logger.log(Level.SEVERE,
						"Files from Test could not be deleted, delete Manually from: " + pathToTestFile,
						e.getMessage());
			}

	}
}

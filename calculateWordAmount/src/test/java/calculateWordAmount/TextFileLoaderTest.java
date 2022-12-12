package calculateWordAmount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class TextFileLoaderTest {

	Logger logger = Logger.getLogger(getClass().getName());
	@Test
	public void loadTextFromFileTest() {
		String pathToTestFile = "src/test/resources/test.txt";
		String expectedContentsOfFile = "this is a test";
		StringBuilder stringBuilder = new LoadTextFromFile().loadTextFromFile(pathToTestFile);
		logger.log(Level.INFO, stringBuilder.toString());
		assertEquals(expectedContentsOfFile, stringBuilder.toString());
	}
}

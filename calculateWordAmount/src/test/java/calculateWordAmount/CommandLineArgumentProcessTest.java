package calculateWordAmount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CommandLineArgumentProcessTest {

	@Test
	public void checkAndprocessGivenArgumentsTest() {
		String inputArgument= "test.txt";
		String outputArgument = "test.xml";
		String expectedInputArgument = "test.txt";
		String expectedOutputArgument = "test.xml";
		String[] argumentsArray = new String[] {inputArgument,outputArgument};
		ArgumentInputOutputHolder argumentInputOutputHolder = new CommandLineArgumentProcessor()
				.checkAndprocessGivenArguments(argumentsArray);
		assertEquals(expectedInputArgument, argumentInputOutputHolder.getInputPath());
		assertEquals(expectedOutputArgument, argumentInputOutputHolder.getOutputPath());
	}
}


package calculateWordAmount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class XmlFromHashmapGeneratorTest {

	@Test
	public void generateXmlFromHashmap() {
		HashMap<String, Integer> mapThatContainsWordsAndCount = new HashMap<>();
		mapThatContainsWordsAndCount.put("Java", 3);
		String expectedXmlString = "<?xmlversion=\"1.0\"encoding=\"UTF-8\"standalone=\"yes\"?><statistics><word><value>Java</value><count>3</count></word></statistics>";
		String resultingXmlString = "";
		resultingXmlString = new XmlFromHashmapGenerator().generateXmlFromHashmap(mapThatContainsWordsAndCount);
		resultingXmlString = resultingXmlString.replace("\r", ""); // To be comparable, remove all lineBreaks and
																	// Newlines and Spaces
		resultingXmlString = resultingXmlString.replace("\n", "");
		resultingXmlString = resultingXmlString.replace(" ", "");
		assertEquals(expectedXmlString, resultingXmlString);
	}
}

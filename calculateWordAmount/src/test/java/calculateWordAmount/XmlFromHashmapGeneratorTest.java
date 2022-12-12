package calculateWordAmount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class XmlFromHashmapGeneratorTest {

	@Test
	public void generateXmlFromHashmap() {
		HashMap<String, Integer> mapThatContainsWordsAndCount = new HashMap<>();
		mapThatContainsWordsAndCount.put("Java", 3);
		mapThatContainsWordsAndCount.put("Code", 2);
		mapThatContainsWordsAndCount.put("HelloImHere", 1);
		String expectedXmlString = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><statistics><word><value>Java</value><count>3</count></word><word><value>HelloImHere</value><count>1</count></word><word><value>Code</value><count>2</count></word></statistics>";
		String resultingXmlString = "";
		resultingXmlString = new XmlFromHashmapGenerator().generateXmlFromHashmap(mapThatContainsWordsAndCount);
		assertEquals(expectedXmlString, resultingXmlString);
	}
}

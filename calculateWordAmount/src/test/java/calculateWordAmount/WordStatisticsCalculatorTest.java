package calculateWordAmount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class WordStatisticsCalculatorTest {

	@Test
	public void countWordsAndReturnHashmapTest() {
		String sentenceToSplitAndCount = "This code is something special, code should be code";
		HashMap<String,Integer> expectedHashMap = new HashMap<>();
		expectedHashMap.put("code", 3);
		expectedHashMap.put("be", 1);
		expectedHashMap.put("should", 1);
		expectedHashMap.put("This", 1);
		expectedHashMap.put("is", 1);
		expectedHashMap.put("special", 1);
		expectedHashMap.put("something", 1);

		HashMap<String, Integer> hashMap = new WordStatisticsCalculator()
				.countWordsAndReturnHashmap(sentenceToSplitAndCount);
		assertEquals(expectedHashMap.get("code"), hashMap.get("code"));
		assertEquals(expectedHashMap.get("be"), hashMap.get("be"));
		assertEquals(expectedHashMap.get("should"), hashMap.get("should"));
		assertEquals(expectedHashMap.get("This"), hashMap.get("This"));
		assertEquals(expectedHashMap.get("is"), hashMap.get("is"));
		assertEquals(expectedHashMap.get("special"), hashMap.get("special"));
		assertEquals(expectedHashMap.get("something"), hashMap.get("something"));

	}
}

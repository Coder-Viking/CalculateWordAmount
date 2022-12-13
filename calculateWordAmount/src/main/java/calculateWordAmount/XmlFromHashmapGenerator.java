package calculateWordAmount;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import generatedFromXsdSchema.Statistics;
import generatedFromXsdSchema.Statistics.Word;

public class XmlFromHashmapGenerator {
	Logger logger = Logger.getLogger(getClass().getName());

	public String generateXmlFromHashmap(HashMap<String, Integer> hashmap) {
		Statistics statistics = new Statistics();
		StringWriter stringHolderToReturn = new StringWriter();

		hashmap.forEach((currentWord, wordCount) -> {
			Word word = new Word();
			word.setValue(currentWord);
			word.setCount(wordCount);
			statistics.getWord().add(word);
		});
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("generatedFromXsdSchema");
			Marshaller xmlMarshaller = jaxbContext.createMarshaller();
			xmlMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			xmlMarshaller.marshal(statistics, stringHolderToReturn);
		} catch (JAXBException e) {
			logger.log(Level.SEVERE,
					String.format("Xml could not be generated from Statistics Object. Message: %s", e.getMessage()));
			return null;

		}
		return stringHolderToReturn.toString();
	}

}

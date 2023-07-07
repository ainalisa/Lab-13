package tcpTextProcessingServer;
import java.util.Date;

/**
 * This class generates word count in a text
 * 
 * @author Aina Khaliesa binti Moslee
 *
 */
public class WordCountGenerator {
	
	/*
	 * default constructor
	 */
	public WordCountGenerator()
	{
		
	}
	/**
	 * This method generates word count
	 * 
	 * @return word count in numeric
	 */
	public int getWordCount() {
		
		String input = "Hai Everyone! My name is Aina Khaliesa from 3 BITS S2G1."; // The Input Words   
		
		 if (input == null || input.isEmpty()) {
		      return 0;
		    }

		 String[] words = input.split("\\s+");
		 return words.length;
		
	}
	
}
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.mockito.Mockito;

public class FindWordsTest {

	Dictionary dictionary = new Dictionary();
	
	@Test 
	public void findWordsTest()
	{
		Set<String> dictionary = new HashSet();
		dictionary.add("WORK");
		dictionary.add("KING");
		dictionary.add("ROW");
		dictionary.add("RING");
		dictionary.add("KNOW");
		dictionary.add("DUP");
		
		this.dictionary.setDictionary(dictionary);
		//this.dictionary.sample("WORKING");
		//Mockito.doReturn(dictionary).when(dictionary1).setDictionary(dictionary);
		this.dictionary.sample("WORKING");
		//System.out.println(results);
//		for(String result : results)
//		{
			//System.out.println("Final Result : " + results);
//		}
		
	}

}


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.FileNotFoundException;

public class TestLargeWord {
   FindBigWord findword = new FindBigWord();
	
   //positive test - assert largest word returned with hardcoded expected value
   @Test
   public void testFindBigWord() {
	   String expectedOutput = "abcde";
	   String actualOutput = findword.doFindBigWord("inputFile.txt");
	   assertEquals(expectedOutput, actualOutput);
   }
   
   //positive test - assert transposed largest word returned with hardcoded expected value
   @Test
   public void testReverseBigWord() {
	   String expectedOutput = "edcba";
	   String actualBigWord = findword.doFindBigWord("inputFile.txt");
	   String actualOutput = findword.doCustomRev(actualBigWord);
	   assertEquals(expectedOutput, actualOutput);
   }
   
   //positive test - assert transposed largest word for a manually entered string
   @Test
   public void testStringRev() {
	   String bigWord = "helloworld";
	   String expected = "dlrowolleh";
	   assertEquals(expected, findword.doCustomRev(bigWord));
   }
   
   //negative test - assert empty input file and compare with empty expected value
   @Test
   public void testEmptyInputFile() {
	   String expectedOutput = "";
	   String actualOutput = findword.doFindBigWord("emptyInputFile.txt");
	   assertEquals(expectedOutput, actualOutput);
   }
   
   //negative test - assert empty value when input file is not present
   @Test
   public void testNoInputFile() {
	   String expectedOutput = "";
	   String actualOutput = findword.doFindBigWord("noInputFile.txt");
	   assertEquals(expectedOutput, actualOutput);
   }
   
   //negative test - assert transposed largest word returned with actual largest value and verify both are not same
   @Test
   public void testNotReverseBigWord() {
	   String expectedOutput = findword.doFindBigWord("inputFile.txt");
	   String actualBigWord = findword.doFindBigWord("inputFile.txt");
	   String actualOutput = findword.doCustomRev(actualBigWord);
	   assertNotEquals(expectedOutput, actualOutput);
   }

}
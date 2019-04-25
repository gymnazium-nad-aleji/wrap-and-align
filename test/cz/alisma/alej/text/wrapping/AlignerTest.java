
package cz.alisma.alej.text.wrapping;

import org.junit.Test;
import static org.junit.Assert.*;

public class AlignerTest {
	
	@Test
	public void LeftAlignerTest() {
		Aligner aligner = new LeftAligner();
		String testString = "This should be left-aligned.";
		String goodString = "This should be left-aligned.            ";
		
		assertEquals(aligner.format(testString.split(" "), 40), goodString);
	}
	
	@Test
	public void RightAlignerTest() {
		Aligner aligner = new RightAligner();
		String testString = "This should be right-aligned.";
		String goodString = "           This should be right-aligned.";
		
		assertEquals(aligner.format(testString.split(" "), 40), goodString);
	}
	
	@Test
	public void CentreAlignedTest() {
		Aligner aligner = CentreAligner();
		String testString = "This should be in centre.";
		String goodString = "        This should be in centre.       ";
		
		assertEquals(aligner.format(testString.split(" "), 40), goodString);
		
	}
	
	@Test
	public void JustifyAlignedTest() {
		Aligner aligner = JustifyAligner();
		String testString = "This should be justified.";
		String goodString = "This      should      be      justified.";
		
		assertEquals(aligner.format(testString.split(" "), 40), goodString);
	}
	
}
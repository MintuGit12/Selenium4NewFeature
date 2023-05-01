package junit.practice.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTest {
	@Test
	public void testJunit()
	{
		String s="Hi junit";
		Assertions.assertEquals("hi j", s);
	}

}

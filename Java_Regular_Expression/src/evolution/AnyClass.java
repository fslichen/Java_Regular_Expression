package evolution;

import java.util.regex.Pattern;

import org.junit.Test;

public class AnyClass {
	@Test
	public void test() {
	      String line = "Hello World";
	      // Hello followed by a single white space and then followed by World.
	      assert Pattern.compile("Hello\\sWorld").matcher(line).matches() == true;
	      // Hello followed by several white spaces and then followed by World.
	      line = "Hello    World";
	      assert Pattern.compile("Hello\\s+World").matcher(line).matches() == true;
	      // Determine whether "Hello World" is exactly the same as "Hello World".
	      line = "Hello World";
	      assert Pattern.compile("Hello World").matcher(line).matches() == true;
	      // Determine whether the line consists of word characters only. w+ means word character(s)
	      line = "HelloWorld";
	      assert Pattern.compile("\\w+").matcher(line).matches() == true;
	      // Determine whether the line consists of digits only.
	      line = "123";
	      assert Pattern.compile("\\d+").matcher(line).matches() == true;
	      // Determine whether the line consists of a to c only.
	      line = "abc";
	      assert Pattern.compile("[a-c]+").matcher(line).matches() == true;
	      // Determine whether the line's first character is a and the following characters consists of b to c only. 
	      line = "abc";
	      assert Pattern.compile("^[a][b-c]+").matcher(line).matches() == true;
	      // Determine whether the line's first character is a and the following characters consists of b to c only. 
	      line = "abc";
	      assert Pattern.compile("^[a][b-c]+").matcher(line).matches() == true;
	      // Assert that the first char is a, second char is b, and third char is c.
	      line = "abc";
	      assert Pattern.compile("[a][b][c]").matcher(line).matches() == true;
	      // Assert that the first char is 1, followed by several written letters, and the last char is 2.
	      line = "1apple2";
	      assert Pattern.compile("[1]\\w+[2]").matcher(line).matches() == true;
	}
}

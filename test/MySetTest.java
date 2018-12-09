import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MySetTest {
	MySet mySet = new MySet();
	
	@Before
	public void runBefore(){

	}

	@Test
	public void isEmpty() {
		assertTrue(mySet.isEmpty());
	}

	@Test
	public void add() {
		mySet.add("a");
		mySet.add("b");
		assertFalse(mySet.isEmpty());
	}
	
	@Test
	public void contains()
	{
		mySet.add("a");
		mySet.add("b");
		assertTrue(mySet.contains("b"));
	}
	
	@Test
	public void remove()
	{
		mySet.add("a");
		mySet.add("b");
		mySet.remove("a");
		assertEquals(1, mySet.length());
	}
}

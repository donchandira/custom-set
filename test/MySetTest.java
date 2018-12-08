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
		assertFalse(mySet.isEmpty());
	}
}

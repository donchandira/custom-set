
public class MySet {
	Object[] objArray = new Object[10];
	int count = 0;
	
	public boolean isEmpty() {
		return count == 0;
	}

	public void add(Object obj) {
		objArray[count] = obj;
		count ++;
	}

}


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
	
	public int length()
	{
		return count;
	}

	public boolean contains(Object obj) {
		
		for(int i = 0; i < count; i++)
		{
			if(objArray[i].equals(obj))
				return true;		
		}
		return false;
	}

	public void remove(Object obj) {
		for(int i = 0; i < count; i++)
		{
			if(objArray[i].equals(obj))
			{
				objArray[i] = objArray[count - 1];	
				objArray[count - 1] = "";
				count--;
				return;
			}
		}
	}
	
	

}

public class Prioritizer1<T> implements Prioritizer<T>{
	public int top = 0, count = 0;
	public int phase = 0;
	public int index = 0, flag = 0;
	public T[] item;
	public T buff;
	
			
	@SuppressWarnings("unchecked")
	public Prioritizer1() {
		item = (T[]) new Object[10];
	}

	public void insert(T x) {
		System.out.println(top);
			item[top++] = x;
		count = count +1;
		for(int i = 0; i<=top; i++)
			System.out.println(item[i]);
	}
	public void changePhase() {
		if(phase == 0)
			phase = 1;
		else
			phase = 0;
	}
	
	public void removeAny(T x) {
		System.out.println("Inside this1");
		buff = item[0];
		
		if(item != null)
		{
			for(int i = 0; i <= top; i++)
			{	
				if((T)item[i] == x)
				{
					index = i;
					System.out.println("Index:" +i);
					break;
				}
				else
					continue;
			}
			
			if(index == 0)
				System.out.println("Selected item not in the list");
			else
			{
				System.out.println("Got here!!");
			
				for(int j = index; j < top; j++) {
					item[j] = item[j+1];
				}
				top = top -1;
			}
			
			for(int i = 0; i <= top; i++)
			{
				buff = item[i];
				for(int j = i+1; j < top; j++)
				{
					if((Integer)item[i] > (Integer)item[j])
					{
						item[i] = item[j];
						item[j] = buff;
						buff = item[i];
					}
					else
					{
						continue;
					}
						
				}
			}
			for(int i = 0; i<top; i++)
				System.out.println(item[i]);
				
		}
		
		else
			System.out.println("Item is a null");
	}
	public void removeNextInOrder() {
		buff = item[0];
		top--;
		for(int i =0; i<=top; i++)
		{
			buff = item[i];
			for(int j =i+1; j<top; j++)
			{
				if((Integer)buff>(Integer)item[j])
				{
					item[i] = item[j];
					item[j] = buff;
					buff = item[i];
				}
				else
					continue;
			}
		}
	}
	
	public boolean isInInsertionPhase() {
		if(phase == 0)
			return true;
		else
			return false;
	}
	
	public int getSize() {
		return count;
	}
}



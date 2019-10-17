import java.util.Arrays;

public class Prioritizer2<T> implements Prioritizer<T>{
	public int top = 0, count = 0;
	public int phase = 0;
	public int index = 0, flag = 0;
	public T[] item;
	CompareObject<T> itemComparator = new CompareObject<T>();
			
	@SuppressWarnings("unchecked")
	public Prioritizer2() {
		item = (T[]) new Object[10];
	}

	public void insert(T x) {
		item[top++] = x;
		count = count +1;
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[count];
		
		for(int j = 0; j < count; j++) {
			newArray[j] = item[j];
			System.out.println("Values: "+newArray[j]);
		}
		Arrays.sort(newArray, itemComparator);
		
		for(int i = 0; i< count; i++)
			System.out.println(newArray[i]);
	}
	public void changePhase() {
		if(phase == 0)
			phase = 1;
		else
			phase = 0;
	}
	
	public void removeAny(T x) {
		System.out.println("Inside this1");
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[count - 1];
		
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
			
				for(int j = index; j <top; j++) {
					item[j] = item[j+1];
				}
				top = top -1;
				count--;
			}
			for(int j = 0; j < count; j++) {
				newArray[j] = item[j];
				System.out.println("Values: "+newArray[j]);
			}
			
			Arrays.sort(newArray, itemComparator);
			
			for(int i = 0; i<count; i++)
				System.out.println(newArray[i]);
		}
		
		else
			System.out.println("Item is a null");
	}
	public void removeNextInOrder() {
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[count - 1];
		top--;
		count--;
		for(int j = 0; j < count; j++) {
			newArray[j] = item[j];
			System.out.println("Values: "+newArray[j]);
		}
		
		Arrays.sort(newArray, itemComparator);
		
		for(int i = 0; i<count; i++)
			System.out.println(newArray[i]);
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

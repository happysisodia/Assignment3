/*
 Completed by Nach//Last Updated on 10/17/2019 9:40pm 
 This class utilizes the prioritizer interface to 
 add remove elements.
 This also along with removing sort the array there
 using a comparator class CompareObject 
 */

import java.util.Arrays;

public class Prioritizer1<T> implements Prioritizer<T>{
	private int top = 0, count = 0;
	private int phase = 0;
	private int index = 0;
	private T[] item;
	CompareObject<T> itemComparator = new CompareObject<T>();
			
	@SuppressWarnings("unchecked")
	public Prioritizer1() {
		item = (T[]) new Object[10];
	}
	//adding the given element x in the array
	public void insert(T x) {
		System.out.println(top);
			item[top++] = x;
		count = count +1;
		for(int i = 0; i<top; i++)
			System.out.println(item[i]);
	}
	//changing the phase from insert to removal and vice a versa
	public void changePhase() {
		if(phase == 0)
			phase = 1;
		else
			phase = 0;
	}
	//remove any element provided by the user and depending on its existence
	//in the array
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
			
				for(int j = index; j < top; j++) {
					item[j] = item[j+1];
				}
				top = top -1;
				count = count -1;
			}
			
			for(int j = 0; j < count; j++) {
				newArray[j] = item[j];
				System.out.println("Values: "+newArray[j]);
			}
			
			Arrays.sort(newArray, itemComparator);//sorting the array
			
			for(int i = 0; i<count; i++)
				System.out.println(newArray[i]);
				
		}
		
		else
			System.out.println("Item is a null");
	}
	//removes the item at the top from the array and sort it
	public void removeNextInOrder() {
		top--;
		System.out.println("Count: "+count);
		@SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[count - 1];
		count--;
		for(int j = 0; j < count; j++) {
			newArray[j] = item[j];
			System.out.println("Values: "+newArray[j]);
		}
		
		Arrays.sort(newArray, itemComparator);//sort the array
		
		for(int i = 0; i<count; i++)
			System.out.println(newArray[i]);
		
		System.out.println("Waazzzupp!!");
	}
	//check the phase whether it is in insertion or not
	public boolean isInInsertionPhase() {
		if(phase == 0)
			return true;
		else
			return false;
	}
	//get the size of the array
	public int getSize() {
		return count;
	}
}



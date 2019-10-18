/*
 *Completed by: Abhinav
 *CompareObject Class: This implements the Comparator interface 
 *which is used by the prioritizers to sort the element in the
 *array
*/

import java.util.Comparator;

public class CompareObject<T> implements Comparator<T>{
	@Override
	public int compare(T item1, T item2) {
		// TODO Auto-generated method stub
		return ((Integer)item1 - (Integer)item2);
	}
}

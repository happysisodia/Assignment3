

public interface Prioritizer<T>{
	public void insert(T x);
	public void changePhase();
	public void removeNextInOrder();
	public void removeAny(T x);
	public int getSize();
	public boolean isInInsertionPhase();
}


public class SuperStack<T> 
{
	private T[] items;
	private int top;
	
	
	public SuperStack (int size)
	{
		items = (T[]) new Object();
	}
	
	public boolean isEmpty()
	{
		return top == 0;
	}
	
	public boolean isFull()
	{
		return top == items.length;
	}
	
	public String toString()
	{
		return null;
	}
	
	public boolean push(T item)
	{
		if (isFull())
		{
			return false;
		}
		
		items[top++] = item;
		
		return true;
	}
	
	public T pop()
	{
		if (isEmpty())
		{
			return null;
		} else
		{
			return items[top];
		}
	}
}

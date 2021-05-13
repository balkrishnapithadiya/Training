

public class storeAndFetch<T> {
	
	T obj;
	storeAndFetch(T obj)
	{
		this.obj=obj;
	}
	public T getObj()
	{
		return this.obj;
	}

	public static void main(String[] args) {
		storeAndFetch <String> obj1 = new storeAndFetch <String> ("Hello");
		storeAndFetch <String> obj2 = new storeAndFetch <String> ("My Name is Raj And");
		storeAndFetch <String> obj3 = new storeAndFetch <String> ("My Age is");
		storeAndFetch <Integer> obj4 = new storeAndFetch <Integer> (22);
		System.out.print(obj1.getObj()+" "+obj2.getObj()+" "+obj3.getObj()+" "+obj4.getObj());
	}

}

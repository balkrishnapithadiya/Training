import java.util.*;
public class differentArrays<T> {
	
	T obj;
	differentArrays(T obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) {
		differentArrays <String> obj = new differentArrays <String> ("Hello");
		differentArrays <Integer> obj1 = new differentArrays <Integer> (1);
		differentArrays <Double> obj2 = new differentArrays <Double> (2.0);
		differentArrays <Boolean> obj3 = new differentArrays <Boolean> (true);
	}

}

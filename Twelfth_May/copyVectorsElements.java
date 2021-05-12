import java.util.*;
public class copyVectorsElements {

	public static void main(String[] args) {
		Vector <String> main = new Vector <String> ();
		main.add("Hello");
		main.add("Hi");
		main.add("How Are You");
		main.add("Bye");
		Object copied = main.clone();
		System.out.print("Main Vector: "+main);
		System.out.print("\nCopied Vector: "+copied);
	}

}

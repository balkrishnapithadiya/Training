
public class copy_elements_of_array {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		int b[] = new int[a.length];
		System.out.println("Source Array: ");
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println(" ");
		System.out.println("Copied Array: ");
		for(int k=0;k<b.length;k++)
		{
			System.out.print(b[k]+" ");
		}
		
	}

}

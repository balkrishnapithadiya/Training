
public class third_largest_in_array {

	public static void main(String[] args) {
		int a[] = {2,4,5,63,56};
		int temp = 0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("3rd Largest Element Of the Array is :"+a[2]);
	}

}

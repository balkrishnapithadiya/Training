
public class right_rotate_array {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		for(int i=0; i<1; i++)
		{
			int last_ele = a[a.length-1];
			for(int j=a.length-1; j>0; j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last_ele;
		}
		System.out.println("Array after right rotation: ");    
        for(int i = 0; i< a.length; i++){    
            System.out.print(a[i] + " ");
        }
	}

}

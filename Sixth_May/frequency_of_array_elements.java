
public class frequency_of_array_elements {

	public static void main(String[] args) {
		int a[] = {1,2,3,1,2,3,1,2,3,3,2,1};
		int b[] = new int[a.length];
		int count=0, visited = -1;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j]) {
					count++;
					b[j]=visited;
				}
			}
			 if(b[i] != visited) {  
	                b[i] = count; 
			 }
		}
		System.out.println(" Element | Frequency");  
		for(int i = 0; i < b.length; i++){  
            if(b[i] != visited) {  
                System.out.println("    " + a[i] + "    |    " + b[i]);
            }
        } 
	}

}

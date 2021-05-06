import java.util.*;
public class ascending_decending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Size Of Array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Please Enter Array Elements: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("Entered Array is: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Press-1 To Sort Array in Ascending Order");
		System.out.println("Press-2 To Sort Array in Decending Order");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			ascending(arr);
			break;
		case 2:
			decending(arr);
			break;
			default:
				System.out.println("Please Enter Valid Choice");
				break;
		}
		sc.close();
	}
	
	public static void ascending(int [] arr)
	{
		 int temp = 0;   
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{     
	               if(arr[i] > arr[j]) 
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;
	               }
			}
		}
		System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        } 
	}
	public static void decending(int [] arr)
	{
		int temp = 0;   
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{     
	               if(arr[i] < arr[j]) 
	               {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;
	               }
			}
		}
		System.out.println("Elements of array sorted in decending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        } 
	}

}

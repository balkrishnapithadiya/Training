import java.util.Scanner;

public class largestAndSmallestWord {
	public static void main(String[] args) {
		System.out.print("Please Enter The String: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		sc.close();
		String str= st+"";
        char ch= ' ';
        int length=str.length();
        int count=0;int minimum=length,maximum=0;
        String smallest="", largest="",word="";
        for(int i=0;i<length;i++){
            ch=str.charAt(i);
            if(ch!=' '){
                word+=ch;
            }
            else{
                count=word.length();
                if(count< minimum)
               {
                    minimum=count;
                    smallest=word;
                }
                if(count> maximum){
                    maximum=count;
                   largest=word;
                }
                word="";
            }
        }
        System.out.println("Smallest Word=" + smallest + " length=" + minimum);
        System.out.println("Largest Word=" + largest + " length=" + maximum);
	}
}

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.util.Scanner;




class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input*/
int l,r,k,i,count=0;
	 Scanner sc=new Scanner(System.in);
     	l=sc.nextInt();
         r=sc.nextInt();
     	 k=sc.nextInt();
               for(i=l;i<=r;i++){
                  if(i%k==0)
	count++;
               }
            System.out.print(count);

      
        // Write your code here

    }
}

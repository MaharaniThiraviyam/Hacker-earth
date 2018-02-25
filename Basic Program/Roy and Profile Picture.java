/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.util.Scanner;


class TestClass {
    public static void main(String args[] ) throws Exception {
      int l,n,w,h,i;
      Scanner sc=new Scanner(System.in);
     l=sc.nextInt(); 
     n=sc.nextInt();   
    
     
       for(i=0;i<n;i++){
         w=sc.nextInt(); 
         h=sc.nextInt();   
         if(w==h)
          System.out.println("ACCEPTED");
         else if(w<l || h<l)
           System.out.println("UPLOAD ANOTHER");
          else if(w>l && h>l)
            System.out.println("CROP IT");
       }
    }
}

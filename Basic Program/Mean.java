import java.util.Scanner;
import java.io.*;
 class mean{
   public static void main(String args[])throws Exception{
       int n,q,l,r,i,j,sum,a[]=new int[1000000],count;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       q=sc.nextInt();
       for(i=1;i<=n;i++)
        a[i]=sc.nextInt();
       for(i=0;i<q;i++){
        l=sc.nextInt();
        r=sc.nextInt();
         for(j=l,sum=0,count=0;j<=r;j++,count++)
            sum+=a[j];
           System.out.println((int)(Math.floor(sum/count)));
       }
     }
  }

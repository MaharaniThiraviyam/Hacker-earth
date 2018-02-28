
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
         int num,i,flag,d;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     num=Integer.parseInt(br.readLine());
     for(i=2;i<=num;i++){
        if(i<4)
         System.out.print(i+" ");
        else{
         for(d=2,flag=0;d<=num/2;d++){
           if(i%d==0)
             flag=1;
            }
             if(flag==0)
              System.out.print(i+" ");
          }
       }
    }
}

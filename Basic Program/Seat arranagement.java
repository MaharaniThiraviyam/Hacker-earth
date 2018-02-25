
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
       int t,i,seatnum,check;
     Scanner sc=new Scanner(System.in);
     t=sc.nextInt();
      for(i=0;i<t;i++){
         seatnum=sc.nextInt();
         check=seatnum%12;
         if((seatnum%3)==2){
            if(check==8)
     	 System.out.println((seatnum-3)+" MS");
            else if(check==11)
	System.out.println((seatnum-9)+" MS");
            else if(check==2)
     	 System.out.println((seatnum+9)+" MS");
            else if(check==5)
	System.out.println((seatnum+3)+" MS");
       }
         else if((seatnum%6)==0 || (seatnum%6)==1){
           if(check==7)
            System.out.println((seatnum-1)+" WS");
          else if(check==0)
            System.out.println((seatnum-11)+" WS");
          else if(check==1)
            System.out.println((seatnum+11)+" WS");
          else if(check==6)
            System.out.println((seatnum+1)+" WS");

         }
         else{
           if(check==10)
	 System.out.println((seatnum-7)+" AS");
           else if(check==9)
	 System.out.println((seatnum-5)+" AS");
          else if(check==3)
                   System.out.println((seatnum+7)+" AS");
          else 
                  System.out.println((seatnum+5)+" AS");
          
            }
          } 

    }
}

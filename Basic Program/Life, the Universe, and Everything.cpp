#include <iostream>

using namespace std;

int main() {
   int num=0,flag=0;
     while(flag!=1){
      cin>>num;
      if(num==42)
       flag=1;
      else
       cout<<num<<"\n";
       
   }
   return 0;
}


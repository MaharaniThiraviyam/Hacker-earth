#include<iostream>
using namespace std;
int main(){
 int n,i,k,t,j,num;
 cin>>t; //get number of test cases

 for(j=0;j<t;j++){
   cin>>n>>k;
    int a[n];
    
   for(i=0;i<n;i++){
     
     cin>>num;
     a[(i+k)%n]=num;
    }
   for(i=0;i<n;i++)
     cout<<a[i]<<" ";
     cout<<"\n";
  }
   
   return 0;
}

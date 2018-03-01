#include<iostream>
using namespace std;
int main(){
 long int a[100000],i,n,k,min,t,z;
 cin>>t; //get no.of.testcases
 for(z=0;z<t;z++){
  cin>>n>>k;
  
  //get input array
   for(i=0;i<n;i++)
    cin>>a[i];
    min=a[0];
   for(i=1;i<n;i++){
   if(a[i]<min)
    min=a[i];
   }
   if(min>=k)
   cout<<"0 \n";
   else
   cout<<k-min<<"\n";
 }
 return 0;
}

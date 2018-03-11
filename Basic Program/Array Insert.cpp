#include<iostream>
using namespace std;
int main(){
int a[100],t,n,z,i,choice,x,y,q,sum;
  cin>>n>>q;
  //get the input array
  for(i=0;i<n;i++)
    cin>>a[i];

    //get the query
  for(z=0;z<q;z++){
    cin>>choice>>x>>y;

    //do the process
    if(choice==1)
        a[x]=y;
    else if(choice==2){
        for(i=x,sum=0;i<=y;i++)
            sum+=a[i];
        cout<<sum<<"\n";
     }
   }

  return 0;
}

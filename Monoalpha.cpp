#include<bits/stdc++.h>
using namespace std;

int main(){
     
    
   map<char,char> mp;
   
   int j=26;
   
   
    for(int i=0;i<26;i++){
          char c='a'+i;
           char cc='a'+j;
           j--;
         mp[c]=cc;
    }
    
    cout<<"Enter plain text :";
    
    string p;
    cin>>p;
    
    string ans;
    
    for(int i=0;i<p.length();i++){
        char temp=p[i];
        ans+=mp[temp];
        
    }
    
    cout<<"Encrypted :"<<ans;
    
    string ans2;
    
    for(int i=0;i<ans.length();i++){
         
         char temp=ans[i];
         
         for(auto it : mp){
              if(it.second == temp){
                   ans2+=it.first;
                   break;
              }
         }
         
    }
    cout<<endl;
    cout<<"Decrypted :"<<ans2;
     
     
}
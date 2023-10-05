#include <iostream>
using namespace std ;
int main() {
    int n ; 
    cin>>n ;
    long long arr[n] ;
    cin>>arr[0] ;
    long long min = arr[0] , max = arr[0] ;
    for(int i = 1 ; i < n ; i++){
        cin>>arr[i] ;
        if(arr[i] > max ){
            max = arr[i] ;
        }
        if( arr[i] < min ){
            min = arr[i] ;
        }
    }
    
    int count = 0 ;
    for(int i = 0 ; i < n ; i++){
        for(int j = i + 1 ; j < n ; j++){
            if(arr[i] + arr[j] == max + min ){
                count++ ;
            }
        }
    }
    cout<< count ;
    return 0;
}
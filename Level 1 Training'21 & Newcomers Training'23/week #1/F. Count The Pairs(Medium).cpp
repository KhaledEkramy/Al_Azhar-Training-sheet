#include <iostream>
#include <algorithm>
using namespace std ;
int main() {
    int n ; 
    cin>>n ;
    long long arr[n] ;

    for(int i = 0 ; i < n ; i++){
        cin>>arr[i] ;
    }
    sort(arr, arr + n);

    long long target_sum = arr[0] + arr[n-1] ;
    
    int count = 0 ;
    int right = 0 , left = n - 1 ;
    while(right < left){
        long long sum = arr[right] + arr[left] ;
        if( sum == target_sum){
            count++ ;
            right++ ;
            left-- ;
        }else if(sum < target_sum ){
            right++ ;
        }else{
            left-- ;
        }
    }
    cout<< count ;
    return 0;
}
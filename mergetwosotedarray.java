import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
      

    int i = 0;
    int j = 0;

    while(i < m && j < n){

if(arr1[i] <= arr2[j]){
    i++;
}else{
int temp = arr1[i];
arr1[i] = arr2[j];
arr2[j] = temp;

int k = j;
while(k < n-1){
if(arr2[k] > arr2[k+1]){
    int temp1 = arr2[k];
    arr2[k] = arr2[k+1];
    arr2[k+1] = temp1;
    k++;
}else{
    break;
}

}


}




    }

for(int p = 0; p<  n; p++){

arr1[m+p] = arr2[p];
}


return arr1;

    }
}

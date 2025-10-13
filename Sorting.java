1)Selection sort 
package Sorting;

import java.util.Arrays;

public class SelctionSort { grow
  
public static void main(String[]args){
   
  int [] arr = {13,46,24,52,20,9};
  int[] sortedArr = Selection(arr);
System.out.println(Arrays.toString(sortedArr));
}
                                                       // time complexity - o(n^2) and time 0(n)
  static int []Selection(int[]arr){

   int n = arr.length;

   // for section sort we need to check the minimum value and swap it 
   // before that lets imagine i is the initial min value and compare with j i.e arr[j]<arr[min]then  min=j;
   for(int i=0;i<n;i++){
    int min = i; // for that i can select so its goes like -13

    for(int j=i+1;j<n;j++){
      if(arr[j]<arr[min]){ // 46<13 -- no because its not minimum next it goes and 9<13 yes so swamp it .
        min = j;
      }
    }
    // swamp function ;
    int temp =arr[i];
    arr[i] = arr[min];
    arr[min]= temp;

   }
  return arr;

  }
}


2)Bubblesort 
  package Sorting;

import java.util.Arrays;

public class Bubblesort {

    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };
        int[] result = Bubble(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] Bubble(int[] arr) {
        // in bubble sort we compare side index values the we swamp
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // n-1 = because we need to perform only length - 1 operations to sort
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                // j<n-i-1 because 5-0-1 =4, 5-1-1 = 3 , every time we make pass the last
                // elements already sorted we don't need to compare again
                // thats why we use this
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break; // if swap == false its already sorted stop it
        }
        return arr;
    }

}


//merge sort -->divide and couqor ->O(nlogn)
//merge sort --> divide and ocnque we need to divide the array into single elemnt then ceate temp array nd mergethem in srting order 


  import java.util.*;
  public class Main{
      public static void main(String[]args){
          int[]arr = {4,3,2,5,6,7,1};
           mergeSort(arr,0,arr.length-1);
           System.out.println("Sorted Array : "+Arrays.toString(arr));
          
      }
      
       public static void mergeSort(int[]arr,int left,int right){
           //base : divide until single lemnets 
              if(left<right){
              //divde the left half and righthagf findout mid 
              int mid = (left+right)/2;
              
              //divide lefthalf 
              mergeSort(arr,left,mid);
              mergeSort(arr,mid+1,right);
              
              //sort the two halfsun arrays 
              merge(arr,left,mid,right);
              }
       }
       //mergeing two sortedhalf arrays 
       public static void merge(int[]arr,int left,int mid,int right){
             //create two temparray 
             int n1 = mid - left +1;
             int n2 = right - mid;
             
             int[]L = new int[n1];
             int[]R = new int[n2];
             
             //copy the data 
               for(int i=0;i<n1;i++)L[i]=arr[left+i];
               for(int j=0;j<n2;j++)R[j]=arr[mid+1+j];
               
               //sort the two half into one half 
               int i=0;int j =0; int k = left;
               while(i<n1&&j<n2){
                   if(L[i]<=R[j]){
                       arr[k++]=L[i++];
                   }else{
                       arr[k++]=R[j++];
                   }
               }
             
             
             //coopy remaing elemnts 
             while(i<n1)arr[k++]=L[i++];
             while(j<n2)arr[k++]=R[j++];
       }
  }

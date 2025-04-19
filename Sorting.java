1)Selection sort 
package Sorting;

import java.util.Arrays;

public class SelctionSort {
  
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

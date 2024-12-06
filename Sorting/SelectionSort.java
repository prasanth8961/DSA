import java.io.*;
import java.util.*;

class SelectionSort {

private static void selectionSort(int[]  nums, int len){
  int min_idx = -1;
  for(int i = 0; i < len - 1; i++){
    min_idx = i;
    for(int j = i+1; j < len; j++){
      if(nums[j] < nums[min_idx]){
        min_idx = j;
      } 
   }
   if(min_idx != i){
      swap(nums , i , min_idx);
    }
  }
}

private static void swap(int[] nums , int begin , int end){
  int temp = nums[begin];
  nums[begin] = nums[end];
  nums[end] = temp;
}
private static void dumpElementsIntoArray(int[] nums, int len){
  for(int i = 0; i < len; i++){
    nums[i] = (int) (Math.random() * 100);
  }
}
private static void displayMessage(String message){
 System.out.println(message);
 System.out.println("=================");
}
private static void printArray(int[] nums){
 for(int num : nums){
    System.out.print(num + " ");
 }
 System.out.println();
}
public static void main(String args[]){
  int[] nums = new int[20];
  int len = nums.length;
  dumpElementsIntoArray(nums , len);
  displayMessage("Before sorting.");
  printArray(nums);
 
  selectionSort(nums , len);

  displayMessage("After sorting.");
  printArray(nums);
 }
}

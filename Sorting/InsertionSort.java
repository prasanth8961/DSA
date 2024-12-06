import java.io.*;
import java.util.*;

class InsertionSort{
 private static void dumpElementsIntoArray(int[] nums , int len){
 for(int i = 0; i < len ; i++){
  nums[i] =  (int) (Math.random() * 100);
 }
}
private static void displayMessage(String message){
 System.out.println(message);
 System.out.println("==================");
}
private static void printArray(int[] nums){
 for(int num : nums){
   System.out.print(num + " ");
 }System.out.println();
}
private static void insertionSort(int[] nums , int len){
 for(int i = 1; i < len ; i++){
   int j = i -  1;
   int key = nums[i];
     while(j >= 0 && nums[j] > key){
        nums[j+1] = nums[j];
        j--;
     }nums[j+1] = key;
 }
}
 public static void main(String args[]){
  int[] nums = new int[20];
  int len = nums.length;
  dumpElementsIntoArray(nums, len);
  displayMessage("Before sorting.");
  printArray(nums);

  insertionSort(nums, len);

  displayMessage("After sorting.");
  printArray(nums);
 }
}

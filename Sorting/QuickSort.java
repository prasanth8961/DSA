import java.io.*;
import java.util.*;

class QuickSort{
private static void  dumpElementsIntoArray(int[] array , int len){
  for(int i = 0; i < len; i++){
   array[i] = (int) (Math.random() * 100);
 }
}
private static void displayMessage(String message){
   System.out.println(message);
   System.out.println("====================");
}
private static void printArray(int[] nums){
 for(int num : nums){
  System.out.print(num + " ");
 }
System.out.println();
}
private static int partition(int[] nums , int low , int high){
  int pivot = nums[high];
  int i = low - 1;
  for(int j = low; j <= high - 1; j++){
   if(nums[j] < pivot){
    i++;
    swap(nums, i , j);
   }
  }swap(nums , i+1 , high);
  return i+1;
}
private static void swap(int[] array , int start , int end){
  int temp = array[start];
  array[start] = array[end];
  array[end] = temp;
}
private static void quickSort(int[] nums , int start , int end){
 if(start < end){
  int pivot = partition(nums , start , end);
  quickSort(nums , start , pivot - 1);
  quickSort(nums , pivot + 1 , end); 
 }
}
public static void main(String args[]){
  int[] array = new int[20];
  int len = array.length;
  dumpElementsIntoArray(array , len);
  
  displayMessage("Before sorting.");
  printArray(array);

  quickSort(array , 0 , len - 1);

  displayMessage("After sorting.");
  printArray(array);
 }
}

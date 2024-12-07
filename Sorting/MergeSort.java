import java.io.*;
import java.util.*;


class MergeSort{
private  static void dumpElementsIntoArray(int[] array , int size){
  for(int i = 0; i < size; i++){
  array[i] =  (int) (Math.random() * 100);
 }
}
private static void displayMessage(String message){
 System.out.println(message);
 System.out.println("===================");
}
private static void printArray(int[] nums){
 for(int num : nums){
  System.out.print(num + " ");
 }
System.out.println();
}
private static void mergeSort(int[] array , int start , int end){
 if(start < end){
 	int mid = start + (end - start) / 2;
 	mergeSort(array , start , mid);
 	mergeSort(array , mid+1 , end);
	merge(array , start , mid , end);
 }
}
private static void merge(int[] array , int start , int mid, int end){
  int[] temp = new int[end - start + 1];
  int i = start, j = mid + 1, k = 0;
  while(i <= mid && j <= end){
     if(array[i] < array[j]){
       temp[k++] = array[i++];
     }else{
       temp[k++] = array[j++];
   }
 }
 while(i <= mid){
  temp[k++] = array[i++];
 }
 while(j <= end){
  temp[k++] = array[j++];
 }
 for(i = start; i <= end; i++){
   array[i] = temp[i - start];
 }
}
public static void main(String ...args){
  int[] array = new int[20];
  int size = array.length;
  dumpElementsIntoArray(array , size);
  displayMessage("Before sorting.");
  printArray(array);

  mergeSort(array , 0 , size - 1);

 displayMessage("After sorting.");
 printArray(array);
 }
}

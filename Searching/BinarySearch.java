import java.io.*;
import java.util.*;
 

class BinarySearch{
private static void dumpElementsIntoArray(int[] array){
 int size = array.length;
 for(int i = 0; i < size; i++){
  array[i] = (int) (Math.random() * 100);
 }
}
private static void displayMessage(String message){
 System.out.println(message);
 System.out.println("===================");
}
private static void printArray(int[] nums){
 for(int num : nums){
  System.out.print(num + " ");
 }System.out.println();
}
private static int binarySearch(int[] array , int key){
 int start = 0;
 int end = array.length - 1;
 while(start <= end){
   int mid = (start + (end - start)/2);
   if(array[mid] == key) return mid;
   if(array[mid] < key) {
     start = mid + 1;
   }else{
     end = mid - 1;
  }
 }return -1;
}
public static void main(String args[]){
  int[] array = new int[20];
  int key = (int) (Math.random() * 100);
  dumpElementsIntoArray(array);
  displayMessage("Binary search.");
  printArray(array);
  displayMessage("Search element is : " + key);

  int idx = binarySearch(array , key);

  System.out.println((idx != -1)? key +" is found at index " + idx : key + " is not found." );
 }
}

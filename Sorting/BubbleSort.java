import java.io.*;
import java.util.*;

class BubbleSort{

private static void dumpElementsIntoArray(int[] array , int len){
 for(int i = 0; i < len; i++){
  array[i] = (int)  (Math.random() * 100) + 1;
 }
}
private static void printArray(int[] array){
 for(int arr : array){
   System.out.print(arr + " ");
 }
System.out.println();
}
private static void swap(int[] array , int start , int end){
  int temp = array[start];
  array[start] = array[end];
  array[end] = temp;
}
private static void bubbleSort(int[] array , int len){
 boolean swapped;
 for(int i = 0; i < len - 1; i++){
 swapped = false;
 for(int j = 0 ; j < len - i - 1; j++){
   if(array[j] > array[j+1]){
	 swap(array , j , j+1);
         swapped = true;
      }
    }
 if(!swapped) {
    break;
  }
 }
}

private static void displayMessage(String message){
   System.out.println(message);
   System.out.println("=================");
}

public static void main(String args[]){
  int[] array = new int[20];
  int len = array.length;
  dumpElementsIntoArray(array , len);
  displayMessage("Before sorting.");
  printArray(array);
  bubbleSort(array , len);
  displayMessage("After sorting.");
  printArray(array);
 }
}

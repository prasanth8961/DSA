import java.io.*;
import java.util.*;

class LinearSearch{
private static void dumpElementsIntoArray(int[] array , int len){
  for(int i = 0; i < len; i++){
   array[i] = (int) (Math.random() * 100);
 }
}
private static void displayMessage(String message){
 System.out.println(message);
 System.out.println("=================");
}
private static void  printArray(int[] nums){
 for(int num : nums){
  System.out.print(num + " ");
 }System.out.println();
}
private static int linearSearch(int[] array , int key){
 int size = array.length;
 for(int i = 0; i < size; i++){
   if(array[i] == key) return i;
 }return -1;
}
public static void main(String args[]){
  int[] array = new int[20];
  int key = (int) (Math.random() * 100);
  dumpElementsIntoArray(array , array.length);
  displayMessage("LINEAR SEARCH.");
  printArray(array);
  displayMessage("Search element is :" + key + " ");

  int idx = linearSearch(array , key);

  System.out.println((idx != -1)? key+ " is found at index " + idx : "element is not found!");
 }
}

import java.io.*;
import java.util.*;

class Node{
  int data;
  Node next;
   Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class LinkedList{
  private Node head;

  LinkedList(){
   head = null;
 }
public void add(int data){
  Node newNode = new Node(data);
  if(head == null){
   head = newNode; 
  }else{
    Node tempNode = head;
     while(tempNode.next != null){
      tempNode = tempNode.next;
   }
   tempNode.next = newNode;
  }
 }
public void insertAtFirst(int data){
 Node newNode = new Node(data);
 if(head == null){
  head = newNode;
 }else{
  newNode.next = head;
  head = newNode;
 }
}
public void insertAtPosition(int pos , int data){
 if(pos < 1){
  return;
 }
 Node newNode = new Node(data);
 if(pos == 1){
  newNode.next = head;
 }
 int idx = 1;
 Node prevNode = head;
 while(idx < pos - 1 && prevNode != null){
   prevNode = prevNode.next;
   idx++;
 }
 if(prevNode == null){
   return;
 }
newNode.next = prevNode.next;
prevNode.next = newNode;
}
public void printValues(){
  Node currentNode = head;
  while(currentNode != null){
   System.out.print(currentNode.data + " ");
   currentNode = currentNode.next;
  }
 }
public static void main(String[] args){
  LinkedList linkedList = new LinkedList();
  linkedList.add(10);
  linkedList.add(21);
  linkedList.add(14);
  linkedList.add(43);
  linkedList.add(28);
  linkedList.add(18);
  linkedList.insertAtPosition(1,1);
  linkedList.insertAtPosition(2,2);
  linkedList.insertAtPosition(3,3);
  linkedList.printValues();
 }
}

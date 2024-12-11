import java.io.*;
import java.util.*;

class Node{
  int data;
  Node left,right;
  Node(int data){
    this.data = data;
  }
}

public class BinarySearchTree{
  
 private static Node root;
 BinarySearchTree(){
  root = null;
 }
 
 public static void createTree(){
   int size = (int) (Math.random() * 25) + 5;
   for(int i = 0; i < size; i++){
     int data = (int) (Math.random() * 100 ) + 1;
     root = insertRec(root , data);
   }
 }
 private static Node insertRec(Node root , int data){
  if(root == null) return new Node(data);
  if(root.data == data) return root;
  if(data < root.data){
   root.left = insertRec( root.left , data);
  }else{
   root.right = insertRec( root.right , data);
  }
  return root;
 }
 public static void preOrderTraverse(){
  preOrder(root);
 }
 private static void preOrder(Node root){
   if(root == null) return;
   System.out.print(root.data + " ");
   preOrder(root.left);
   preOrder(root.right);
 }
 public static void inOrderTraverse(){
  inOrder(root);
 }
 private static void inOrder(Node root){
  if(root ==  null) return;
  inOrder(root.left);
  System.out.print(root.data + " " );
  inOrder(root.right);
 }
 public static void postOrderTraverse(){
  postOrder(root);
 }
 private static void postOrder(Node root){
  if(root == null) return;
  postOrder(root.left);
  postOrder(root.right);
  System.out.print(root.data + " ");
 }
 public static void main(String args[]){
  createTree();
  System.out.println("PreOrder traverse");
  preOrderTraverse();
  System.out.println();
  System.out.println("InOrder traverse");
  inOrderTraverse();
  System.out.println();
  System.out.println("PostOrder traverse");
  postOrderTraverse();
 }
}

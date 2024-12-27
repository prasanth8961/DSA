import java.io.*;
import java.util.*;

//<------- NODE CLASS ----------->
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
 
//<-------------- CREATING TREE WITH RANDOM DATA -------------->
 public static void createTree(){
   int size = (int) (Math.random() * 25) + 5;
   for(int i = 0; i < size; i++){
     int data = (int) (Math.random() * 100 ) + 1;
     root = insertRec(root , data);
   }
 }
//<--------- INSERTING DATA ---------------------->
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
//<--------- TREE TRAVERSEL [PRE-ORDER] -------------->
 public static void preOrderTraverse(){
  preOrder(root);
 }
 private static void preOrder(Node root){
   if(root == null) return;
   System.out.print(root.data + " ");
   preOrder(root.left);
   preOrder(root.right);
 }
//<--------- TREE TRAVERSEL [IN-ORDER] ----------------->
 public static void inOrderTraverse(){
  inOrder(root);
 }
 private static void inOrder(Node root){
  if(root ==  null) return;
  inOrder(root.left);
  System.out.print(root.data + " " );
  inOrder(root.right);
 }
//<----------- TREE TRAVERSEL [POST-ORDER] -------------->
 public static void postOrderTraverse(){
  postOrder(root);
 }
 private static void postOrder(Node root){
  if(root == null) return;
  postOrder(root.left);
  postOrder(root.right);
  System.out.print(root.data + " ");
 }
//<--------TREE TRAVERSEL [LEVEL ORDER]------------->

public static void  levelOrder() {
      levelOrderTraverse(root);
 }

 private static void levelOrderTraverse(Node node) {
        if(node == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
                Node crNode = queue.poll();
                System.out.print(crNode.data + " ");
                if (crNode.left != null) {
                    queue.offer(crNode.left);
                }
                if (crNode.right != null) {
                    queue.offer(crNode.right);
                }
        }
}

//<------------ SEARCH ELEMENT ------------->
public static  boolean search(int key){
        return searchValue(root , key);
 }

private boolean searchValue(Node root , int  key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(key < root.data){
           return  searchValue(root.left, key);
        }else {
           return searchValue(root.right, key);
        }
 }

//<------- MAIN --------->
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
  System.out.println("LevelOrder traverse");
  levelOrder();
  System.out.println("Search");
  int data = (int) (Math.random() * 100) + 1; 
  if(search(data)){
  System.out.println(data + " is found");  
}else{
 System.out.println(data +" is not found");
  }
 }
}


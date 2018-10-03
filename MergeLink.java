 import java.util.*;

class Node {
  int data;
  Node next;
  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}
//Creating a linkedlist.
class Linkedlist {
  Node head;
  public  Linkedlist() {
    this.head = null;
  }
//adding a node.
  public void addNode(int data) {
    Node temp;
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
    }
    else {
      for(temp = head ;temp.next != null;temp = temp.next);
      temp.next =  newNode;
    }
  }
//Keeping a count.
  public void Count() {
    Node temp;
    int count = 0;
    for(temp = head; temp != null; temp = temp.next){
      if(temp.data % 2 == 0){
        count++;
      }
    }
    System.out.println(count);
  }
//Printing the count.
  public void print() {
    Node temp;
    for(temp = head; temp != null; temp = temp.next) {
      System.out.println(temp.data);
    }
  }
}
//Make a Merge.
public class MergeLink {
  public void merge(Linkedlist L, Linkedlist M) {
    Node temp;
    for(temp = L.head; temp.next != null; temp = temp.next);
    temp.next = M.head;
  }

  public static void main(String[] args) {
    Linkedlist L = new Linkedlist();
    Linkedlist M = new Linkedlist();
    MergeLink N = new MergeLink();
    L.addNode(1);
    L.addNode(4);
    L.addNode(5);
    L.addNode(6);
    M.addNode(5);
    M.addNode(8);
    M.addNode(9);
    L.print();
    System.out.println("\n");
    N.merge(L,M);
    L.print();
  }
}

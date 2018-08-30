import java.util.*;

class Node {
    int data;
    Node next;
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
}

class Linkedlist {
  Node head;
  public Linkedlist() {
    this.head = null;
  }

  public void addNode(int data) {
    Node temp;
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      newNode.next = head;
      return;
    }
    else {
      for(temp = head; temp.next != head; temp = temp.next);
      temp.next = newNode;
      newNode.next = head;
    }
  }

  public void addNodeBeg(int data) {
    Node temp;
    Node newNode = new Node(data);
    if(head == null) {
      System.out.println("List is empty");
    }
    else {
      for(temp = head;temp.next != head; temp = temp.next);
        newNode.next = head;
        head = newNode;
        temp.next = newNode;
      }
  }

  public void addNodePos(int data,int pos) {
    Node temp = head;
    Node newNode = new Node(data);
    if(head == null && pos == 1) {
      newNode.next = head;
      head = newNode;
      return;
      }
    else{
    int i=1;
    while(i<pos-1) {
      temp = temp.next;
      i++;
     }
    newNode.next = temp.next;
    temp.next = newNode;
   }
 }
public void addNodeLast(int data) {
  Node temp;
  Node newNode = new Node(data);
  if(head == null) {
    newNode.next = head;
    head = newNode;
  }
  for(temp = head;temp.next!= head;temp = temp.next);
  temp.next = newNode;
  newNode.next = head;
}

public void DeleteFront() {
  Node temp;
  if(head == null) {
    System.out.println("List is empty");
   } else {
    for(temp = head; temp.next != head ; temp = temp.next);
    temp.next = head.next;
    head = head.next;
  }
}

public void DeleteLast() {
  Node temp;
  if(head == null) {
    System.out.println("List is empty");
   } else {
  for(temp = head ; temp.next.next != head; temp = temp.next);
  temp.next = head;
 }
}

public  void DeletePos(int pos) {
  Node temp = head;
  if(head == null) {
    System.out.println("List is empty");
    } else {
  int i = 1;
  while(i < pos-1) {
    temp = temp.next;
    i++;
   }
  temp.next = temp.next.next;
  }
}
  public void print() {
    Node temp;
    if(head == null) {
      System.out.println("List is empty");
      return;
       } else {
    for(temp = head; temp.next!= head; temp = temp.next) {
      System.out.println(temp.data);
     }
    System.out.println(temp.data);
   }
  }
}
public class Circularlink  {
  public static void main(String[] args) {
    Linkedlist L = new Linkedlist();
    L.addNode(1);
    L.addNode(2);
    L.addNode(3);
    L.addNode(4);
    L.addNodeBeg(5);
    L.addNodePos(6,4);
    L.addNodeLast(9);
    L.DeleteFront();
    L.DeleteLast();
    L.DeletePos(3);
    L.print();
  }
}

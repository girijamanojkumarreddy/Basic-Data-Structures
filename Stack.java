import java.util.*;

class Node {
  int data;
  Node next;
  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  Node top;
  public LinkedList() {
    this.top = null;
  }

public void push(int data) {
  Node temp;
  Node newNode = new Node(data);
  if(top == null) {
    top = newNode;
  } else {
      newNode.next = top;
      top = newNode;
  }
}

public void pop() {
  Node temp;
  if(top == null) {
    System.out.println("Invalid");
  }
  else {
    for(temp = top;temp.next != null;temp = temp.next);
    top = top.next;
    temp.next = null;
  }
}

  public void print() {
    Node temp;
    if(top == null) {
      System.out.println("Stack Underflow");
    }
    else {
      for(temp = top; temp!=null;temp = temp.next) {
        System.out.println(temp.data);
      }
    }
  }
}


public class Stack {
  public static void main(String[] args) {
    LinkedList L = new LinkedList();
    L.push(5);
    L.push(7);
    L.push(8);
    L.pop();
    L.print();
  }
}

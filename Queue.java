import java.util.*;

class Node {
  int data;
  Node next;
  Node prev;
  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Linkedlist {
    Node front;
    Node rear;
  public Linkedlist() {
    this.front = null;
    this.rear = null;
  }
  public void enQueue(int data) {
    Node temp ;
    Node newNode = new Node (data);
      if(front == null && rear == null) {
        front = rear = newNode;
        return;
      } else {
        rear.next = newNode;
        rear = newNode;
      }
    }
  public void dequeue () {
    Node temp;
    if(front == null && rear == null) {
      System.out.println("list is empty");
    }
    else {
      for(temp = front;temp.next != null;temp = temp.next) {
        temp.next = null;
        temp = front;
      }
    }
  }

  public void print() {
    Node temp = front;
    while(temp!= null) {
      temp = temp.next;
    }
    System.out.println(temp.data);
  }

}

  class Queue {
   public static void main(String[] args) {
    Linkedlist L = new Linkedlist();
    L.enQueue(2);
    L.enQueue(3);
    L.enQueue(4);
    L.enQueue(5);
    L.enQueue(6);
    L.enQueue(7);
    L.dequeue();
    L.dequeue();
    L.print();
  }
}

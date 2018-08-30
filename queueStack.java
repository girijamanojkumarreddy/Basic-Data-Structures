import java.util.*;
class Node {
  int data;
  Node next;
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

class Queue {
  Stack S1 = new Stack;
  Stack S2 = new Stack;
  Node head;
  Queue() {
  this.head = null;
  }
  public void pop (int data) {
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

  public void Isempty() {
  	if(head == null)
   {
   	System.out.println("List is empty");
    }
  }
  public enQueue (int data){
    S1.push(data);
  }
}

public int deQueue() {
  if(S2 .Isempty()) {
    while(!S1.Isempty()) {
      S2.push(S1.pop);
      return S1.pop;
    }
  }
  public void print() {

}

public class queueStack {
public static void main(String[] args) {
  Queue Q = new Queue();
  Q.enQueue(1);
  Q.enQueue(2);
  Q.enQueue(3);
  Q.deQueue();
  Q.deQueue();
  Q.print()

}
}

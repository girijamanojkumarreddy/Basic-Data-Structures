class Node {
    int data;
    Node next;
    Node prev;
     Node (int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
}

class Linkedlist {
  Node head, tail;
  public Linkedlist() {
     this.head = null;
     this.tail = null;
  }

  public  void addDouble(int data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      tail = newNode;
    } else {
      Node temp;
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }
  }

  public void print() {
    Node temp;
    for(temp = head; temp != null; temp = temp.next) {
        System.out.println(temp.data);
    }
  }

  public void printRev() {
    Node temp;
    for(temp = tail; temp != null; temp = temp.prev) {
      System.out.println(temp.data);
    }
  }
}

public class DoublyList {
  public static void main(String[] args) {
      Linkedlist l = new Linkedlist();
      l.addDouble(2);
      l.addDouble(3);
      l.addDouble(4);
      l.addDouble(5);
      l.print();
      l.printRev();
  }
}

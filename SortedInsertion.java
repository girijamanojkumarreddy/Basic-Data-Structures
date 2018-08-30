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

public void InsertLast(int data) {
	Node temp = head;
	int i;
	Node newNode = new Node(data);
  if(head == null)
   {
	 head = newNode;
	}
	else {
	for(temp = head;temp.next!=null;temp = temp.next);
	temp.next = newNode;
}
}
public void SortIns(int data) {
	Node temp = head;
  Node newNode = new Node(data);
  if(head == null) {
    newNode.next = head;
    head = newNode;
  }  else {
  while(temp.next.data < newNode.data) {
    temp  = temp.next;
  }
  newNode.next =  temp.next;
  temp.next = newNode;
 }
}

public void print() {
  Node temp;
  for(temp = head; temp!=null ;temp = temp.next){
        System.out.println(temp.data);
      }
  }

public class SortedInsertion {
  public static void main(String[] args) {
    Linkedlist L = new Linkedlist();
    L.InsertLast(2);
    L.InsertLast(3);
    L.InsertLast(4);
    L.InsertLast(6);
    L.SortIns(5);
    L.SortIns(1);
    L.print();
  }
}

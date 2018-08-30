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

public void InsertBeg(int data) {
	Node temp;
	Node newNode = new Node(data);
	if(head == null) {
	head = newNode;
	}
  else {
	for(temp = head; temp.next != null;temp = temp.next);
	newNode.next = head;
  head = newNode;
      }
}

public void Insertpos(int data,int pos) {
	Node temp = head;
	int i;
	Node newNode = new Node(data);
  if(head == null)
  {
	 head = newNode;
	}
	else {
	for(i=1;i<pos-1;i++) {
  temp = temp.next;
	}
	newNode.next = temp.next;
  temp.next = newNode;
       }
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
  if(head == null || head.data >= newNode.data) {
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
public void isLastelement(int data){
	if(head ==  null) {
		System.out.println("The list is empty ");
	}

	else {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
			if(temp.next ==  null) {
				System.out.println( +temp.data+"is the last element");
			}
		}
	}
}
public void Isempty() {
	if(head == null)
 {
 	System.out.println("List is empty");
  }
}

public void DeleteBeg() {
	Node temp = head ;
	if(head == null) {
		System.out.println("List is empty");
	} else {
	head = head.next;
	temp.next = null;
 }
}


public void DeleteLast() {
	Node temp ;
	if(head == null) {
		System.out.println("List is empty");
	}
	for(temp = head;temp.next.next!=null;temp = temp.next);
	temp.next = null;
}
public void DeletePos(int pos) {
	Node temp = head;
	int i = 1;
	if(head == null) {
		System.out.println("List is empty");
	} else {
	while(i<pos-1) {
		temp = temp.next;
		i++;
	 }
	if(pos-1 == i){
	temp.next = temp.next.next;
  }
 }
}

public void evenPositioned() {
	int pos = 1;
	Node temp = head;
	while(temp.next != null) {
		temp = temp.next;
		pos++;
	}
	temp = head;
	while(temp.next != null){
			if(pos % 2 == 0) {
			System.out.println(temp.data);
		}
		pos++;
		temp = temp.next;
		}
	}

	boolean isPalindrome() {
	    int i = 0;
	    int j;
	    Node first;
	    Node last;
	    int c = 1;
	    Node temp = head;
	    while(temp.next != null) {
	      c ++;
	      temp = temp.next;
	    }

	    while(i != c/2) {
	      first = last = this.head;
	      for(j = 0; j < i; j++ ) {
	        first = first.next;
	      }
	      for(j = 0; j < c - i - 1; j++) {
	        last = last.next;
	      }
	      if(first.data != last.data) {
	        return false;
	      } else {
	        i++;
	      }
	    }
	    return true;
	    }

public void print() {
 	Node temp;
	for(temp = head; temp!=null ;temp = temp.next){
        System.out.println(temp.data);
			}
	  }
  }


class SingelyLinkedlist {
	public static void main(String[] args) {
  Linkedlist L = new Linkedlist();
	L.InsertBeg(10);
	L.InsertLast(20);
	L.InsertLast(30);
	L.InsertLast(40);
	L.InsertLast(60);
	L.DeleteBeg();
	L.print();
	L.DeletePos(3);
	L.DeletePos(2);
	L.print();
	L.SortIns(25);
	L.SortIns(5);
	L.isLastelement(70);
	System.out.println(L.isPalindrome());
	System.out.println("the even positioned elements are");
	L.evenPositioned();
	System.out.println("The element in the list are");
	L.print();
 }
}

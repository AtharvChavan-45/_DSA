import java.util.Scanner;

public static class SingleLL { 
     
     //Node class
     public static class Node {
        int data;
        Node next;

        // constructor
        Node(int data){
            this.data = data;
            this.next = null;
        }
     }

     //linked list class
     public static class linkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        // insert at end
        void InsertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp
            }
            size++;
        }
       

     //insert at head
     void InsertAtHead(int data){
        Node temp = new Node(data);

        if(head == null){
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
     }

     // insert at index
    void insertAt(int idx, int data) {
        if (idx < 0 || idx > size){
            System.out.println("Invalid index");
        }
        if(idx == 0){
            InsertAtHead(data);
        }
        if(idx ==size){
            InsertAtEnd(data);
        }

        Node temp = head;
        for(int i = 1; i <= idx - 1;i++){
            temp = temp.next;
        }
        Node t = new Node(data);
        t.next = temp.next;
        temp.next = t;
        size++;
    }

    // get value at index
    int getAt(int idx) {
        if(idx < 0 || idx >= size) {
            System.out.println("Invalied Index");
            return -1;
        }
        Node temp = head;
        for(int i = 1;i<idx;i++) {
            temp = temp.next;
        }
        return temp.data;
    }
     
}
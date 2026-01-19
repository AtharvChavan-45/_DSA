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
     public static class LinkedList {
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

    // Display list 
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // delete at index
    void delete(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid index");
            return;
        }
        if (idx == 0) {
            head = head.next;
            size--;
            if (size == 0) tail = null;
            return;
        }
       
        Node temp = head;
        for (int i = 1;i <= idx - 1;i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        if(idx == size - 1) {
            tail = temp;

        }
        size--;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int choice;

        do {
            System.out.println("\n ==== Linked List Menu ====");
            System.out.println("1. Insert at End");
            System.out.printLn("2. Insert at Head");
            System.out.println("3. Insert at Index");
            System.out.println("4. Delete at Index");
            System.out.println("5. Get value at Index");
            System.out.println("6. Display List");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    ll.InsertAtEnd(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    ll.insertAtHead(sc.nextInt());
                    break;
                
                case 3:
                    System.out.print("Enter index : ");
                    int idx = sc.nextInt();
                    System.out.print("Enter data : ");
                    int data = sc.nextInt();
                    ll.insertAt(idx,data);
                    break;
                
                case 4:
                    System.out.print("Enter index to delete: ");
                    ll.delete(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    int val = ll.getAt(index);
                    if (val != -1)
                        System.out.println("Value: " + val);
                    break;

                case 6:
                    ll.display();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }
        } while (choice != 7);

        sc.close();
    }
     
}
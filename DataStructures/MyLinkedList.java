package DataStructures;

public class MyLinkedList {

    Node head;
    int size = 0;

    public static class Node{

        int data;
        Node next;

        public Node(int val){
            this.data = val;
        }
    }

    private void insert(int pos, int val){

        Node newNode = new Node(val);

        if(head == null){

            head = newNode;
            size++;

        }else{

            Node temp = head;

            int m = 0;

            while(m < pos-1 && temp != null){
                temp = temp.next;
                m++;
            }

            temp.next = newNode;
            size++;

        }
    }

    private void delete(int pos){

        if(head != null){
           
            Node temp = head;

            int m = 0;

            while(m < pos-1 && temp != null){
                temp = temp.next;
                m++;
            }

            temp.next = temp.next.next;
            size--;

        }
    }

    private void print(){

        Node temp = head;

        while(temp != null){
            System.out.println(temp.data + " ");
        }
    }

    public static void main(String[] args) {
        
    }
    
}

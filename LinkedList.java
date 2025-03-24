class LinkedList{
    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node haed;

    //insert node at beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //insert node at end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //delete node from beginning
    public void deleteFromBeginning(){
        if (head == null){
            System.out.println("Empty list.Nothing to delete.");
            return;
        }
        head = head.next;
    }

    //display linked list
    public void display(){
        if(head == null){
            System.out.println("Empty list.");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[]args){
        LinkedList list = new LinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(15);
        list.insertAtEnd(25);
        list.display();

        list.deleteFromBeginning();
        list.display();
    }
    
}
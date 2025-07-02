

class Main {
    Node head;
   class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data=data;
            this.next = null;
            
            
        }
   }
   
   public  void addFirst(String data){
       Node newNode = new Node(data);
       if(head==null){
           head=newNode;
           return;
       }
       newNode.next = head;
       head=newNode;
       
   }
   
   public void addLast(String data){
      Node newNode = new Node(data);
       if(head==null){
           head=newNode;
           return;
       }
        Node currNode = head;
        while(currNode.next!=null){
            currNode= currNode.next;
        }
        currNode.next = newNode;
   }
   
   public void deleteFirst(){
       head = head.next;
   }
   
   public void deleteLast(){
        if (head == null) {
        System.out.println("List is empty");
        return;
    }

    if (head.next == null) {
        
        head = null;
        return;
    }
       Node secondLast= head;
       while (secondLast.next.next != null){
           secondLast = secondLast.next;
       }
       secondLast.next = null;
   }
   
   public void printList(){
       Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode= currNode.next;
            
        }
        System.out.println("null");
   }
   
    public static void main(String[] args) {
        Main list = new Main();
        list.addFirst("Hii");
        list.addFirst("Borther");
        list.printList();
        list.addLast("Ashish");
        list.addLast("Yadav");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}









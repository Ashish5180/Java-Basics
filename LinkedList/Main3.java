class Main3 {
    
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // Remove Nth node from end
    public void removeNth(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        if (n == size) {
            head = head.next;
            return;
        }

        int indexToReach = size - n;
        Node prev = head;
        for (int i = 1; i < indexToReach; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
    }

    public boolean palindromeCheck() {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow);
        Node copySecondHalf = secondHalf; // to restore later if needed

        // Step 3: Compare first and second half
        Node first = head;
        while (secondHalf != null) {
            if (!first.data.equals(secondHalf.data)) {
                return false;
            }
            first = first.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private Node reverse(Node headNode) {
        Node prev = null;
        Node current = headNode;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }




    // cycle check
    public boolean findCycle(){
        Node slow = head;
        Node fast = head;
        
        while(fast!= null && fast.next!=null){
            slow = slow.next;
        fast = fast.next.next;
        
        if(slow==fast){
            return true;
        }
        }
        return false;
        
    }

    public static void main(String[] args) {
        Main3 list = new Main3();
        list.addLast("R");
        list.addLast("A");
        list.addLast("D");
        list.addLast("A");
        list.addLast("R");

        list.printList();               // R -> A -> D -> A -> R
        list.removeNth(2);             // removes 2nd node from end
        list.printList();               // R -> A -> D -> R
        System.out.println("Is Palindrome: " + list.palindromeCheck());
        System.out.println("Is Cyclic: " + list.findCycle());
    }
}

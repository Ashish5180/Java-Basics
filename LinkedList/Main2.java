
    class Main2 {

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

    public void search(String key) {
        Node currNode = head;
        int index = 0;
        boolean found = false;

        while (currNode != null) {
            if (currNode.data.equals(key)) {
                System.out.println("Found '" + key + "' at index " + index);
                found = true;
                break;
            }
            currNode = currNode.next;
            index++;
        }

        if (!found) {
            System.out.println("Element '" + key + "' not found in the list.");
        }
    }

    public static void main(String[] args) {
        Main2 list = new Main2();
       String[] arr = {"A" , "B" ,"C" ,"D"};
       for(int i =0;i<arr.length;i++){
           list.addLast(arr[i]);
       }

        list.search("C"); // Should print: Found 'C' at index 2
        list.search("X"); // Should print: Element 'X' not found in the list.
    }
}



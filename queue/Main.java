class Main {

    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            arr[++rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Removed: " + q.remove()); // 1
        System.out.println("Peek: " + q.peek());      // 2
    }
}

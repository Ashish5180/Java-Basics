class Main2 {

    static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear+1)%size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            if(front == -1){
                front =0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int res = arr[front];
            if(front==rear){
                front = rear = -1;
            }else{
                front = (front+1)%size;
            }
            return res;
        }
    

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       System.out.println(q.remove());
       q.add(6);
       System.out.println(q.remove());
       q.add(7);


       while(!q.isEmpty()) {
           System.out.println(q.remove());
       }

    }
}


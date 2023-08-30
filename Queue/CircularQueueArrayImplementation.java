package Queue;

public class CircularQueueArrayImplementation {
    public static class CQueue{
        int front=-1;
        int rear=-1;
        int size=0;
        int[] arr=new int[100];

        public void add(int val) throws Exception{
            if(size==arr.length-1){
                throw new Exception("Queue Is Empty");
            }
            else if(size==0){
                front=rear=0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){
                arr[++rear]=val;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }

        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue Is Empty");
            }
            else{
                int val=arr[front];
                if(front==arr.length-1){
                    front=0;
                }
                else{
                    front++;
                }
                size--;
                return val;
            }
        }

        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue Is Empty");
            }
            return arr[front];
        }

        public boolean isEmpty(){
            if(size==0)return true;
            return  false;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue Is Empty");
                return;
            }
            else if(front<=rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{
                for(int i=front;i< arr.length;i++){ //front to end
                    System.out.print(arr[i] + " ");
                }
                for(int i=0;i<=rear;i++){ //start to rear
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception {
        CQueue q=new CQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
    }
}

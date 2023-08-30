package Queue;

public class ArrayImplementation {
    public static class QueueA{
        int arr[]=new int[100];
        int f=-1;
        int r=-1;
        int size=0;

        public void add(int val){
            if(r==arr.length-1){
                System.out.print("Queue Is Full");
                return;
            }
            if(f==-1){
                arr[++r]=val;
                f++;
            }
            else{
                r++;
                arr[r]=val;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue Is Empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue Is Empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            if(size==0)return true;
            return false;
        }

        public void display(){
            if(size==0){
                System.out.println("Queue Is Empty");
                return;
            }
            for(int i=f;i<=r;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        QueueA q=new QueueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
    }
}

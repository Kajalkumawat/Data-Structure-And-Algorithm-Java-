import java.util.Queue;

public class QueuePeek {
    public static class Queue{
        int f=-1;
        int r=-1;
        int size=0;
        int a[]=new int[5];
        public void add(int val){
            if(r==a.length-1){
                System.out.println("full");
                return;
            }
            if(f==-1){
               f=r=0;
               a[r]=val;
            }
            else{
                a[++r]=val;
            }
            size++;
        }
        public  void display(){
           for(int i=f;i<=r;i++){
            System.out.print(a[i]+" ");
           }
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            else{ 
                return a[f];
            }
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(56);
        q.add(67);
        q.add(12);
        q.add(1);
        q.add(23);
      System.out.println(q.peek());
       // q.display();
    }
}

import java.util.Stack;

class QueueUsingTwoStacks{
    static class queueUsingTwoStacks{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void add(int data){
            if(s1.isEmpty()){
                s1.push(data);
                return;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        int remove(){
            if(s1.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return s1.pop();
        }

        void printQueue(){
            while(!s1.isEmpty()){
                System.out.println(s1.pop());
            }
        }

        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }
    }

    public static void main(String[] args){
        queueUsingTwoStacks q = new queueUsingTwoStacks();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);
        q.printQueue();
    }
}
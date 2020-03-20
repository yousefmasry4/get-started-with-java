package chapter7;



public class TestStack2 {
    public static void main(String args[]) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
// push some numbers onto the stack
        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack2.push(i);
// pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2:");
        for(int i=0; i<8; i++)
            System.out.println(mystack2.pop());
        mystack1.test(1,2,3);
    }

    private static class Stack {
        private int[] _data;
        private int _tos=-1;
        public Stack(int i) {
            _data=new int[i];
        }

        public void push(int i) {
            _data[++_tos]=i;
        }

        public void test(int a,int ...v){
            for(int x : v)
                System.out.print(x + " ");
        }
        public int pop() {
            if(_tos < 0) {
                System.out.println("Stack underflow.");
                return 0;
            }
            else
                return _data[_tos--];

        }
    }
}

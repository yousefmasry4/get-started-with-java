package chapter7;

public class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();
        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
        System.out.println("Factorial of 5 is " + f.fact(5));



        RecTest ob = new RecTest(10);
        for(int i=0; i<10; i++)
            ob.values[i] = i;
        ob.printArray(10);
    }

    private static class Factorial {

        int fact(int i){
            if(i == 1)
                return 1;
            return i*fact(i-1);
        }
    }

    private static class RecTest {
        int[] values;

        public RecTest(int i) {
            values = new int[i];
        }

        public void printArray(int i) {
            if(i == 0)
                return;
            System.out.printf("[%2d ]%8d\n",i-1,values[i-1]);
            printArray(i-1);
        }
    }
}

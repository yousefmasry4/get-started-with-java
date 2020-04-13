package aast.sheet4.c3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String [] par){
        ArrayList<Integer> x=new ArrayList<Integer>(){
            public boolean add(Integer mt) {
                int index = Collections.binarySearch(this, mt);
                if (index < 0) index = ~index;
                System.out.println(index);
                super.add(index, mt);
                return true;
            }
        };
        x.add(5);
        x.add(9);
        x.add(0);
        x.add(6);
        x.add(2);
        x.add(2);

        System.out.println(x.toString());

    }
}

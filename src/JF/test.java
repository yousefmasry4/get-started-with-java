package JF;

import java.util.ArrayList;

public class test {
        public static void main(String [] par) {
            JoFile f= new JoFile("hello.txt");
            ArrayList<String> s=new ArrayList<String>();
            s.add("q");
            s.add("Ds");
            s.add("Ds");
            s.add("Ds");
            s.add("Ds");
          //  f.write(s,false);
            f.read().forEach((n)->{
                for(String ss:n.split(" ")){
                    System.out.println(ss);
                    f.write(ss=="jo"?"":ss+" ",false);

                }
            });
            //f.write("hello");

        }
}

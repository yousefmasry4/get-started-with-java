package JF;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class JoFile{
    /*TODo
               1.normal read into array                                 done
               2.normal write array with option of new line             done
               3.insert at
               4.remove string
               5.number of string
               6.sort int
               7.sort string
               8.random int
               9.random string

     */
    final String jFname;
    private BufferedReader br1;
    public JoFile(String jFname) {
        this.jFname = jFname;
    }
    public ArrayList<String> read() {
            BufferedReader objReader = null;
            ArrayList<String> data=new ArrayList<String>();
            try {
                String strCurrentLine;

                objReader = new BufferedReader(new FileReader(jFname));

                while ((strCurrentLine = objReader.readLine()) != null) {

                //    System.out.println(strCurrentLine);
                    data.add(strCurrentLine);
                }

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                try {
                    if (objReader != null)
                        objReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            return data;
    }
    public void write(String s){
        ArrayList<String> ss=new ArrayList<String>();
        ss.add(s);
        this.write(ss,false);
    }
    public void write(ArrayList<String> data,boolean newline) {
        try {
            PrintWriter writer = new PrintWriter(jFname, "UTF-8");
            for(String s:data){
                if (newline) {
                    writer.println(s);
                } else {
                    writer.print(s);
                }
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

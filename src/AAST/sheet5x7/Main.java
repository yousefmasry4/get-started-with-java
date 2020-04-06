package AAST.sheet5x7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

//7. Write a program to create a file named Heba.txt if it does not exist. Write 100 integers created
//randomly into the file using text I/O. Integers are separated by spaces in the file. Read the data
//back from the file and display the data in increasing order.
public class Main {

    public static int[] rand(){
        Random _rand = new Random();
        return IntStream.range(0, 100).map(i ->_rand.nextInt(100)).toArray();
    }

    public static void write(int[] data,FileWriter f) throws IOException {
        String s = "";
        for(int i=0;i<100;i++)
            s +=data[i]+" ";
        f.write(s);
        f.close();
    }

    public static PriorityQueue<Integer> read(FileReader f) throws IOException {
        String s="";
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        int ch;
        while ((ch=f.read())!=-1) {
            char c = (char) ch;
            if(c !=' '){
                s+=c;
            }else{
                pQueue.add(Integer.parseInt(s));
                s="";
            }
        }

        return pQueue;
    }

    public static void main(String[] args) throws IOException {
        if(!new File("Heba.txt").exists()){
          //  System.out.println("dsdasssssssssssssssssssssssssss");
            FileWriter f=new FileWriter("Heba.txt");
            write(rand(), new FileWriter("Heba.txt"));
        }
        try {
            PriorityQueue<Integer> data= read(new FileReader("Heba.txt"));
            for(int i=0;i<100;i++){
                System.out.println(data.remove());
            }
        }catch (Exception e){
            System.out.println("format not supported");
        }


    }
}

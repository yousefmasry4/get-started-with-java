package AAST.sheet5x5;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.Stack;


//Write a program that counts the number of words in President Abraham Lincoln’s Gettysburg
//address from http://cs.armstrong.edu/liang/data/ Lincoln.txt.


public class Main {
    public static void main(String[] args) {
        Stack<String> data=new Stack<String>();
        int c=0;
        try{
            //you can test by it : https://raw.githubusercontent.com/BernardoAbreu/NLP-scene_gen/53181be757ed006b5b6c29431e3e861d156e6189/data/raw/genres/Thriller.txt
            URL url =new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            Scanner scanner=new Scanner(url.openStream());
            while (scanner.hasNext()){
                for(String s:scanner.next().split(" ")){
                    if(Character.isLetter(s.charAt(0))) {
                        c++;
                       // System.out.println(s);
                        data.push(s);
                    }
                }
              //  System.out.println(scanner.next());
            }
            System.out.printf("the number of words in President Abraham Lincoln’s Gettysburg %5d\n",c);
            for(int i=0;i<c;i++){
                System.out.printf("%4d %s\n",i,data.pop());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e.getMessage()+"\n404 error");

        }catch (Exception e) {
            e.printStackTrace();
            System.out.print(e.getMessage()+"\nerror :(");
        }
    }
}

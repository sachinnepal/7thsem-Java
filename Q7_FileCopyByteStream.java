
import java.io.*;

public class Q7_FileCopyByteStream{
    public static void main(String[] args) throws Exception{

        FileInputStream in = new FileInputStream("source.txt");
        FileOutputStream out = new FileOutputStream("dest.txt");

        int data;
        while((data = in.read()) != -1){
            out.write(data);
        }

        in.close();
        out.close();

        System.out.println("File copied");
    }
}

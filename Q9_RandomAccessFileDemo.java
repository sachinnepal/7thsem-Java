
import java.io.*;

public class Q9_RandomAccessFileDemo{
    public static void main(String[] args) throws Exception{

        RandomAccessFile file = new RandomAccessFile("data.txt","rw");

        file.writeInt(100);
        file.writeInt(200);

        file.seek(0);
        System.out.println(file.readInt());

        file.seek(4);
        System.out.println(file.readInt());

        file.close();
    }
}

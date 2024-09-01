package IOFileFolder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;

class TestMain {
    public static void main(String[] args) {
        try {
            File f = new File("data.txt");
            FileOutputStream fout = new FileOutputStream(f);
            String data = "Java is simple language";
            byte b[] = data.getBytes();
            fout.write(b);
            System.out.println("Opertion Sucessfully......");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

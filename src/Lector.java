import java.io.FileReader;
import java.io.IOException;

public class Lector {
    //FileReader lector = null;

    public static void main(String[] args) {
        FileReader lector = null;
        try {
            lector = new FileReader("archivo.txt");
            int i = 0;
            while(i != -1){
                i = lector.read();
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error");
        } finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

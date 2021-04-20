import java.io.*;

//Создать файл на жестком диске и прочитать его.
// Вывести прочитанное в консоль.

public class FirstEasy {
    private static BufferedInputStream bis = null;
    private static int i;

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream(new File("C:\\Hello.txt"));
            BufferedInputStream bis = new BufferedInputStream(fis);
            bis.close();
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

import java.io.*;

//У Вас имеется текст "I am java developer".
// Запишите этот текст в файл на жестком диске.

public class SecondEasy {
    public static String str = "I am java developer";

    public static void main(String[] args) {
        try {
            OutputStream fos = new FileOutputStream(new File("C:\\Java.txt"));
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write(str);
            osw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

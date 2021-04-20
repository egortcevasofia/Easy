import java.io.*;

//В файле bestcode.txt написан Ваш самый лучший код:
// С помощью ввода/вывода java измените содержимое данного файла.
//В упражнении 2 замените System.out.println("Самый классный код");
// на System.out.println("А этот код еще лучше");

public class ThirdEasy {


    public static void main(String[] args) {
        File file = new File("C:\\bestcode.txt");
        String str = "";
        int i;
        try {
            InputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            while ((i = isr.read()) != -1) {
                str += (char) i;
            }
            isr.close();

            System.out.println(str);
            String result = str.replaceAll("Самый классный код", "А этот код еще лучше");
            System.out.println(result);

            OutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write(result);
            osw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

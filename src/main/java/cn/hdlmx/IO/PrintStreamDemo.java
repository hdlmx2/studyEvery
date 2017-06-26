package cn.hdlmx.IO;

import java.io.*;

/**
 * Created by yedong on 2017/6/26.
 */
public class PrintStreamDemo {
    public static void main(String[] args) {
        File file = new File("e:" + File.separator + "demo.txt");
        if (!file.exists()) file.getParentFile().mkdirs();
        try (
                OutputStream outputStream = new FileOutputStream(file, true);
                PrintStream printStream = new PrintStream(outputStream);

        ) {
            Person person=new Person("hds",12);

            double d = 12123.12;

            /*printStream.print(d);
            printStream.print(person);*/
            printStream.println(person);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

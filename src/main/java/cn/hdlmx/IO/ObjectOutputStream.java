package cn.hdlmx.IO;

import java.io.*;

/**
 * Created by handong on 2017/6/24.
 */
public class ObjectOutputStream {

    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "object.txt");
        if (!file.exists()) file.getParentFile().mkdir();

        try (
                OutputStream outputStream = new FileOutputStream(file);
                java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(outputStream);

        ) {

            Person person = new Person("hdmx", 29);
            objectOutputStream.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

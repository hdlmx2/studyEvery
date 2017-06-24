package cn.hdlmx.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 * Created by handong on 2017/6/24.
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "object.txt");
        try (
                InputStream inputStream = new FileInputStream(file);
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        ) {
            Person person = (Person) objectInputStream.readObject();
            System.out.println(person);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

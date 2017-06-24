package cn.hdlmx.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by handong on 2017/6/24.
 */
public class ReaderDemo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "demo.txt");
        if (!file.exists()) file.getParentFile().mkdir();

        try (Reader reader = new FileReader(file)) {

            char[] fileData = new char[1024];
            reader.read(fileData);

            String soutData = new String(fileData);
            System.out.println(soutData);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

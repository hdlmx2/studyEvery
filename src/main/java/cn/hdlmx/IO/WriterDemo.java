package cn.hdlmx.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by handong on 2017/6/24.
 */
public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "demo.text");
        if (!file.exists()) file.getParentFile().mkdir();
        try (Writer writer = new FileWriter(file)) {
            String data = "hello Writer!";
            writer.write(data);
            writer.flush();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}

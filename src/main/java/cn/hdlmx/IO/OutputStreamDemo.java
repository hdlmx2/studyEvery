package cn.hdlmx.IO;

import java.io.*;

/**
 * Created by handong on 2017/6/24.
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "demo.txt");
        if (!file.exists()) file.getParentFile().mkdir();
        try (OutputStream inputStream = new FileOutputStream(file, true)) {
            String data = "今天雨下的好大！\r\n";
            inputStream.write(data.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

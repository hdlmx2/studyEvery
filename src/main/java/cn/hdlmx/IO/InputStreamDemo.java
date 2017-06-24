package cn.hdlmx.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by handong on 2017/6/24.
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        File file = new File("E:" + File.separator + "demo.txt");
        try (InputStream inputStream = new FileInputStream(file)) {
            byte data[] = new byte[1024];
            int  len = inputStream.read(data);

            System.out.println(len);
            String inputData = new String(data);
            System.out.println("【"+inputData+"】");

        } catch (IOException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
    }
}

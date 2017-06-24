package cn.hdlmx.IO;

import java.io.*;

/**
 * Created by handong on 2017/6/24.
 */
public class FileCopyDemo {
    public static void main(String[] args) {
        File inFile = new File("E:" + File.separator + "GitHub入门与实践.pdf");
        File outFile = new File("E:" + File.separator + "GitHub入门与实践2.pdf");

        if (!inFile.exists()) System.out.println("需要复制的文件不存在！");

        else {
            long startTime = System.currentTimeMillis();
            try (InputStream inputStream = new FileInputStream(inFile);
                 OutputStream outputStream = new FileOutputStream(outFile)
            ) {
                int temp = 0;//保存每次读取的内容
                byte data[]=new byte[2048];
                while ((temp = inputStream.read(data)) != -1) {
                    outputStream.write(data,0,temp);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("本次复制花费的时间：" + (endTime - startTime));
        }

    }
}

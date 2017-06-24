package cn.hdlmx.IO;

import java.io.*;

/**
 * Created by handong on 2017/6/24.
 */
public class FileCopyByBufferedInputStream {

    public static void main(String[] args) {
        File inFile = new File("E:" + File.separator + "GitHub入门与实践.pdf");
        File outFile = new File("E:" + File.separator + "GitHub入门与实践2.pdf");

        if (!inFile.exists()) System.out.println("需要复制的文件不存在！");
        else {
            long startTime = System.currentTimeMillis();
            try (
                    InputStream inputStream = new FileInputStream(inFile);
                    OutputStream outputStream = new FileOutputStream(outFile);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            ) {
                byte data[] = new byte[2048];
                while ((bufferedInputStream.read(data, 0, data.length)) != -1) {
                    bufferedOutputStream.write(data, 0, data.length);
                }

            } catch (IOException e) {
                e.printStackTrace();

            }
            long endTime = System.currentTimeMillis();
            System.out.println("本次复制花费的时间：" + (endTime - startTime));
        }
    }
}

package org.example.socket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public void run() {
        try (Socket socket = new Socket("127.0.0.1", 9999);
             // 文件输入流，读取文件内容
             FileInputStream fileInputStream = new FileInputStream("E:/test1.txt")) {

            // socket输出流，发送文件内容
            OutputStream outputStream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            // 读取文件并通过socket发送给服务端
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
            }
            // 关闭socket输出流
            outputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

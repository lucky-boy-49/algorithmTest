package org.example.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {

    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(9999);
             // 文件输出流，数据写入文件
             FileOutputStream outputStream = new FileOutputStream("E:/test2.txt")) {

            Socket accept = serverSocket.accept();
            // socket输出流，接受客户端发送的数据
            InputStream inputStream = accept.getInputStream();
            byte[] buffer = new byte[1024];
            int read;
            // 接受数据并写入文件
            while ((read = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, read);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

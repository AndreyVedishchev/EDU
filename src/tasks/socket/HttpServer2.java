package tasks.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer2 {
    public static void start() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8082);

        while (true) {
            Socket socket = serverSocket.accept();//ожидание подключения к сокету, результат записываем в переменную
            new Thread(new SocketDispatcher(socket)).start();
        }
    }
}

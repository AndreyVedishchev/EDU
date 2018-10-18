package tasks.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDispatcher implements Runnable{
    private Socket socket;

    public SocketDispatcher(Socket socket) {
        this.socket = socket;
    }

    @Override

    public void run() {
        try {
            test(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void test(Socket socket) throws IOException {
        InputStream inputStream = socket.getInputStream();//входящий поток от клиента
        OutputStream outputStream = socket.getOutputStream();//исходящий поток

        String html = "<html>" +
                "<head><title>SUPER SERVER</title></head>" +
                "<body>" +
                "<h1>Hello</h1> " +
                "<br/>" +
                "<img src='https://avatars.mds.yandex.net/get-pdb/231404/839d57a8-3310-4b0e-ba9a-a4772d02fbe5/s1200'/>" +
                "</body>" +
                "</html>"; //генерация html

        String header = "HTTP/1.1 200 OK\n" +
                "Content-Type: text/html\n" +
                "Content_Length: " + html.length() + "\n" +
                "Connection: close\n\n";//хедер для http

        String resultText = header + html;
        outputStream.write(resultText.getBytes());//запись результата в исходящий поток
        socket.close();
    }
}

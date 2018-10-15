package tasks.connect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) throws IOException {

        String site = "https://yandex.ru";
        URL url = new URL(site);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection(); //создаем соединение

        int responseCode = urlConnection.getResponseCode();
        System.out.println(responseCode); //получаем код ответа

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                                  /*буферезированый поток*//*преобразование в символы*//*байтовый поток*/
        StringBuilder result = new StringBuilder();
        String input;
        while((input = bufferedReader.readLine()) != null) {
            result.append(input).append("\n");
        }

        System.out.println(result);

    }
}

import jdk.nashorn.internal.parser.JSONParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class JsonApp {


    public static void main(String[] args) {
        System.out.println(getWeatherForCity("Athens"));
    }

    public static String getWeatherForCity(String city) {
        BufferedReader rd = null;
        StringBuilder sb = null;
        String line = null;
        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="
                    + city
                    + "&appid=52a3c7eb60acb02a208a32f66e087284"
            );
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            sb = new StringBuilder();
            while ((line = rd.readLine()) != null) {
                sb.append(line + '\n');
            }
            return sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

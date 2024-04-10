package utilities;

import java.io.BufferedReader;
import java.io.IOException;

public class Utill {
    public static String converteJsonEmString(BufferedReader bufferedReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = bufferedReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}

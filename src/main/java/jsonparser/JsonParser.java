package jsonparser;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class JsonParser {

    public static void main(String[] args) throws IOException {
        File file = new File("/home/yurii/jsonParser/src/main/resources/json/task.json");
        String content = new String((Files.readAllBytes(file.toPath())));
        JSONObject jsonObject = new JSONObject(content);
        printJsonObject(jsonObject);
    }
    public static void printJsonObject(JSONObject jsonObject){
        for (String key : jsonObject.keySet()) {
            String keyStr = key;
            Object keyValue = jsonObject.get(keyStr);
            System.out.println(keyStr);
            System.out.println(keyValue);
        }
    }
}

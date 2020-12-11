package jsonparser;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {

    public static JSONObject readJsonFile(String file) {
        File fileJson = new File(file);
        String content = null;
        try {
            content = new String((Files.readAllBytes(fileJson.toPath())));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject(content);
    }

    public static JSONObject printJsonObject(JSONObject taskjsonObject) {

        for (String key : taskjsonObject.keySet()) {
            String keyStr = key;
            Object keyValue = taskjsonObject.get(keyStr);

        }
        return taskjsonObject;
    }

    public static List<JSONObject> getChildCompanies(String file) {
        JSONObject childCompanies = (JSONObject) ((JSONObject) readJsonFile(file).get("manufacturers")).get("childCompanies");
        List<JSONObject> companies = new ArrayList<>();
        for (Object key : childCompanies.keySet()) {
            String keyStr = (String) key;
            Object keyValue = childCompanies.get(keyStr);
            System.out.println(keyStr);
            System.out.println(keyValue);
        }
        return companies;
    }

}



package jsonparser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonParser {

    public static void main(String[] args) throws IOException {
        parseFromJson("/home/yurii/jsonParser/src/main/resources/json/task.json",
                "/home/yurii/jsonParser/src/main/resources/json/notExistCompany.json");

    }


    public static void parseFromJson(String file, String file2) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Map<String, Object>> dataMap = mapper.readValue(new File(file), Map.class);
        Map<String, Map<String, Object>> dataMap1 = mapper.readValue(new File(file2), Map.class);

        Object o = dataMap.get("manufacturers").get("childCompanies");
        Object o1 = dataMap1.get("manufacturers").get("childCompanies");

        if (o.equals(o1)) {
            System.out.println("isEquals");
            System.out.println(o + "\n" + o1);
        } else {
            System.out.println("notEquals");
            System.out.println(o + "\n" + o1);
        }
    }
}



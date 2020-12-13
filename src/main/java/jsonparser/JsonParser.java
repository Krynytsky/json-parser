package jsonparser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonParser {
    /**
     * @param file
     * @return childCompaniesMap
     * @throws IOException
     */
    public Map<String, Object> parseChildCompanyJson(String file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Map<String, Map<String, Object>>> childCompanyDataMap = mapper.readValue(new File(file), Map.class);
        Map<String, Object> childCompaniesMap = childCompanyDataMap.get("manufacturers").get("childCompanies");
        for (Map.Entry<String, Object> entry : childCompaniesMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return childCompaniesMap;
    }
}



package steps;

import helpers.JsonVerificationHelper;
import jsonparser.JsonParser;
import org.testng.Assert;

import java.io.IOException;
import java.util.Map;

import static enums.JsonPath.BASE_JSON;

public class ChekIfCompanyExistBL {

    JsonParser jsonParser;
    JsonVerificationHelper jsonVerificationHelper;

    public ChekIfCompanyExistBL() {
        this.jsonParser = new JsonParser();
        this.jsonVerificationHelper = new JsonVerificationHelper();
    }

    public Map<String, Object> createChildObjectMap() {
        Map<String, Object> stringObjectMap = null;
        try {
            stringObjectMap = jsonParser.parseChildCompanyJson(BASE_JSON.getJsonPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringObjectMap;
    }

    public void verifyChildCompanyExist(String name) {
        Assert.assertTrue(jsonVerificationHelper.isContainsChildCompany(createChildObjectMap(), name), "This company doesn't exist ih the json file");
    }

    public void verifyChildCompanyNotExist(String name) {
        Assert.assertFalse(jsonVerificationHelper.isContainsChildCompany(createChildObjectMap(), name), "This company exist ih the json file");
    }
}

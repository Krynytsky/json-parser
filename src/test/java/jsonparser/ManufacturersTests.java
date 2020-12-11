package jsonparser;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static jsonparser.JsonParser.printJsonObject;
import static jsonparser.JsonParser.readJsonFile;
import static logic.ManufacturersChecker.isChildCompanyExist;

public class ManufacturersTests {

    @Test
    public void validCompany() {
        final JSONObject existChildJsonObject = printJsonObject(readJsonFile("/home/yurii/jsonParser/src/main/resources/json/existCompany.json"));
        final JSONObject taskJsonObject = printJsonObject(readJsonFile("/home/yurii/jsonParser/src/main/resources/json/task.json"));
        Object manufacturersTask = taskJsonObject.get("manufacturers").toString();
        Object manufacturersExist = existChildJsonObject.get("manufacturers").toString();
        Assert.assertTrue(isChildCompanyExist(manufacturersTask, manufacturersExist));
    }

    @Test
    public void invalidCompany() {
        final JSONObject notExistChildJsonObject = printJsonObject(readJsonFile("/home/yurii/jsonParser/src/main/resources/json/notExistCompany.json"));
        final JSONObject taskJsonObject = printJsonObject(readJsonFile("/home/yurii/jsonParser/src/main/resources/json/task.json"));
        Object manufacturersTask = taskJsonObject.get("manufacturers").toString();
        Object manufacturersExist = notExistChildJsonObject.get("manufacturers").toString();
        Assert.assertFalse(isChildCompanyExist(manufacturersTask, manufacturersExist));
    }
}
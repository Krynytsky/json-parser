package enums;

public enum JsonPath {
    BASE_JSON("/home/yurii/jsonParser/src/main/resources/json/task.json");

    private String jsonPath;

    JsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public String getJsonPath() {
        return jsonPath;
    }
}

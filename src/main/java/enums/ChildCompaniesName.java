package enums;

public enum ChildCompaniesName {
    AMAZON("Amazon"),
    APPLE("Apple"),
    KYB("Kyb"),
    EBAY("Ebay"),
    GOOGLE("Google");

    private String value;

    ChildCompaniesName(String value) {
        this.value = value;

    }

    public String getValue() {
        return value;
    }
}

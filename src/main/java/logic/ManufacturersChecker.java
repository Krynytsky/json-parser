package logic;

public class ManufacturersChecker {

    public static boolean isChildCompanyExist(Object baseJson, Object otherJson) {
        if (baseJson.equals(otherJson)) {
            return true;
        }
        return false;
    }
}

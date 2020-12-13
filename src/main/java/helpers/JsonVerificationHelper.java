package helpers;

import java.util.Map;

public class JsonVerificationHelper {
    /**
     * @param stringObjectMap
     * @param nameToCheck
     * @return
     */
    public boolean isContainsChildCompany(Map<String, Object> stringObjectMap, String nameToCheck) {
        if (!stringObjectMap.containsKey(nameToCheck)) {
            return false;
        }
        return true;
    }
}

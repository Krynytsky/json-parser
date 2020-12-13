package steps;

import org.testng.annotations.Test;

import static enums.ChildCompaniesName.*;

public class ChekIfCompanyExistBLTest {
    @Test
    public void verifyExistCompany() {
        new ChekIfCompanyExistBL()
                .verifyChildCompanyExist(GOOGLE.getValue());
    }

    @Test
    public void verifyNotExistCompany() {
        new ChekIfCompanyExistBL()
                .verifyChildCompanyNotExist(KYB.getValue());
    }

}
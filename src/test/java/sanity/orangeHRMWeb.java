package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.WebFlows;

@Listeners(utilities.Listeners.class)
public class orangeHRMWeb extends CommonOps {

    //Enter on the Website.
    @Test(priority = 0, description = "Test01 Verify Header")
    @Description("This Test login and verifies the main header")
    public void test01_verifyHeader(){
        WebFlows.login(getData("UserName"),getData("Password"));
        Verifications.verifyTextInElement(orangeHRMMain.head_Dashboard, "Dashboard");
    }

    //Verification of how many users we have.
    @Test(description = "Test02 Verify Default Users")
    @Description("This Test verifies Verify Default Users")
    public void test02_verifyDefaultUsers(){
        WebFlows.checkAdminPage();
        WebFlows.recordsFound();
        Verifications.numberOfElements(orangeHRMAdminMain.rows,WebFlows.recordsFound());
    }

    //Add and verify a new user
    @Test(description = "Test03 Verify New User")
    @Description("This Test verifies a new user has been added")
    public void test03_verifyNewUsers(){

       WebFlows.createNewUser( "Maksym Fomin", "Ab123456789$", "ESS", "Enabled");
       Verifications.verifySuccess(orangeHRMAddNewUserPage.txt_success);
    }

    //Verify delete user
    @Test(description = "Test04 Verify User Deletion")
    @Description("This Test verifies the deletion of a user")
    public void test04_verifyDeleteUsers(){
        WebFlows.deleteUser("Maksym Fomin");
        Verifications.verifySuccess(orangeHRMAddNewUserPage.txt_success);
    }

    //Verify all displayed elements in dashboard
    @Test(description = "Test05 Verify Displayed Elements")
    @Description("This Test verifies all elements are displayed (using soft asserting)")
    public void test05_verifyDisplayedElements(){

        Verifications.visibilityOfElements(orangeHRMMain.list_Dashboard);
    }

    //Verify logo
    @Test(description = "Test06 Verify Logo Image")
    @Description("This Test verifies the Logo Image Using Sikuli tool")
    public void test06_verifyLogo(){

        Verifications.visualElement("LogoOrange");
    }

    //Search in left panel
    @Test(description = "Test07 Search in Left Panel", dataProvider = "data-provider-leftSearch", dataProviderClass = utilities.ManageDDT.class)
    @Description("This Test the Search in Left Panel using DDT")
    public void test07_verifySearch(String name, String shouldExist){
        WebFlows.searchVerify(name,shouldExist);
    }
}

package workflows;

import extensions.DBActions;
import extensions.UIActions;
import extensions.Verifications;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.List;

public class WebFlows extends CommonOps {

    @Step("Business Flow: Login to OrangeHR")
    public static void login(String user, String pass){
        UIActions.updateText(orangeHRMLogin.txt_username,user);
        UIActions.updateText(orangeHRMLogin.txt_password,pass);
        UIActions.click(orangeHRMLogin.btn_login);
    }

    @Step("Business Flow: Login to OrangeHR with DB Credentials")
    public static void loginDB(){
        String query = "SELECT name, password FROM user WHERE id='3'";
        List<String> cred = DBActions.getCredential(query);
        UIActions.updateText(orangeHRMLogin.txt_username,cred.get(0));
        UIActions.updateText(orangeHRMLogin.txt_password,cred.get(1));
        UIActions.click(orangeHRMLogin.btn_login);
    }

    @Step("Business Flow: Check Admin Page")
    public static void checkAdminPage(){
        UIActions.click(orangeHRMLeftMenu.btn_admin);
    }

    @Step("Business Flow: Number System Users")
    public static int recordsFound(){
        String recordsFound = orangeHRMAdminMain.txt_recordsFound.getText();
        String[] newArray = recordsFound.split(" ");
        String firstArray = newArray[0];
        String number = firstArray.substring(1,(firstArray.length()-1));
        return Integer.parseInt(number);
    }
    @Step("Business Flow: Create New User")
    public static void createNewUser(String userName, String password, String role, String status) {

        UIActions.click(orangeHRMLeftMenu.btn_admin);

        UIActions.click(orangeHRMAdminMain.btn_addUsers);

        UIActions.updateText(orangeHRMAddNewUserPage.txt_userName, userName);

        UIActions.updateText(orangeHRMAddNewUserPage.txt_employeeName, orangeHRMAddNewUserPage.text_nameAdmin.getText());
        UIActions.mouseHover(orangeHRMAddNewUserPage.btn_employeeOptions);

        UIActions.click(orangeHRMAddNewUserPage.btn_userRole);
        UIActions.updateDropDownWithDiv(orangeHRMAddNewUserPage.btn_userRole,role);

        UIActions.click(orangeHRMAddNewUserPage.btn_userStatus);
        UIActions.updateDropDownWithDiv(orangeHRMAddNewUserPage.btn_userStatus,status);

        UIActions.updateText(orangeHRMAddNewUserPage.txt_password, password);
        UIActions.updateText(orangeHRMAddNewUserPage.txt_confirmPassword, password);
        UIActions.click(orangeHRMAddNewUserPage.btn_save);
    }
    @Step("Business Flow: Delete User")
    public static void deleteUser(String text){

        UIActions.click(orangeHRMLeftMenu.btn_admin);

        UIActions.deleteNameInTable(orangeHRMAdminMain.rows, text);
        UIActions.click(orangeHRMAdminMain.btn_confirmDeleteUser);

    }

    @Step("Business Flow: Search Verify")
    public static void searchVerify (String text, String shouldExist){
        UIActions.updateTextHuman(orangeHRMLeftMenu.txt_search, text);
        if(shouldExist.equalsIgnoreCase("exist")){
            Verifications.existenceOfElement(orangeHRMLeftMenu.rows);
        }
        else if(shouldExist.equalsIgnoreCase("not-exist")){
            Verifications.nonExistenceOfElement(orangeHRMLeftMenu.rows);
        }
        else
            throw new RuntimeException("Invalid Expected Option in Data Driven testing. Should be exist or not-exist");
    }

}

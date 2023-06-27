package utilities;

import org.openqa.selenium.support.PageFactory;
import pageObjects.orangeHRM.AddNewUserPage;

public class ManagePages extends Base{

    public static void initOrangeHRM(){
        orangeHRMLogin = PageFactory.initElements(driver, pageObjects.orangeHRM.LoginPage.class);
        orangeHRMMain = PageFactory.initElements(driver, pageObjects.orangeHRM.MainPage.class);
        orangeHRMLeftMenu = PageFactory.initElements(driver, pageObjects.orangeHRM.LeftMenuPage.class);
        orangeHRMAdminMain = PageFactory.initElements(driver, pageObjects.orangeHRM.AdminMainPage.class);
        orangeHRMAddNewUserPage = PageFactory.initElements(driver, AddNewUserPage.class);
    }

    public static void initMetricConversion(){
        metricMainPage = new pageObjects.metricConversion.MainPage(mobileDriver);
        metricTemperaturePage = new pageObjects.metricConversion.TemperaturePage(mobileDriver);
        convertPage = new pageObjects.metricConversion.ConvertPage(mobileDriver);
    }

    public static void initToDO(){
        todoMain = PageFactory.initElements(driver, pageObjects.todo.MainPage.class);
    }

    public static void initCalculator(){
        calcMain = PageFactory.initElements(driver, pageObjects.calculator.MainPage.class);
    }
}

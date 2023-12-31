package utilities;

import io.appium.java_client.AppiumDriver;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;
import pageObjects.orangeHRM.*;
import pageObjects.metricConversion.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Base {

    // General
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;
    protected static String platform;

    // Web
    protected static WebDriver driver;

    // Mobile
    protected static AppiumDriver mobileDriver;
    protected static DesiredCapabilities dc = new DesiredCapabilities();


    // Page Objects - Web
    protected static LoginPage orangeHRMLogin;
    protected static pageObjects.orangeHRM.MainPage orangeHRMMain;
    protected static LeftMenuPage orangeHRMLeftMenu;
    protected static AdminMainPage orangeHRMAdminMain;
    protected static AddNewUserPage orangeHRMAddNewUserPage;

    // Page Objects - Mobile
    protected static pageObjects.metricConversion.MainPage metricMainPage;
    protected static TemperaturePage metricTemperaturePage;
    protected static ConvertPage convertPage;

    // Rest API
    protected static RequestSpecification httpRequest;
    protected static Response response;
    protected static JSONObject params = new JSONObject();
    protected static JsonPath jp;

    // Page Objects - Electron
    protected static pageObjects.todo.MainPage todoMain;

    // Page Objects - Desktop
    protected static pageObjects.calculator.MainPage calcMain;

    // Database
    protected static Connection con;
    protected static Statement stmt;
    protected static ResultSet rs;

}

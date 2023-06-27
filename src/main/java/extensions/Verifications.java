package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    @Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(),expected);
    }

    @Step("Verify Number Of Element")
    public static void numberOfElements(List<WebElement> elem, int expected){
        wait.until(ExpectedConditions.visibilityOf(elem.get(elem.size() - 1)));
        assertEquals(elem.size(),expected);
    }

    @Step("Verify Success")
    public static void verifySuccess(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), "Success");
    }

    @Step("Verify Visibility Of Elements(Soft-Asserting")
    public static void visibilityOfElements(List<WebElement> elems){
        for(WebElement elem: elems){
            softAssert.assertTrue(elem.isDisplayed(), elem.getText() + " not displayed");}
        softAssert.assertAll("SomeElements were not displayed");
    }

    @Step("Verify Element Visually")
    public static void visualElement(String expectedImageName){
        try {
            screen.find(getData("ImageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File: " + findFailed);
            fail("Error Comparing Image File: " + findFailed);
        }
    }

    @Step("Verify Element Displayed")
    public static void existenceOfElement(List<WebElement> elements){
        assertTrue(elements.size() > 0);
    }

    @Step("Verify Element Not Displayed")
    public static void nonExistenceOfElement(List<WebElement> elements){
        assertFalse(elements.size() > 0);
    }

    @Step("Verify Text with Text")
    public static void verifyText(String actual, String expected){
        assertEquals(actual,expected);
    }

    @Step("Verify Status Code")
    public static void verifyStatusCode(int status){
        assertEquals(response.getStatusCode(), status);
    }

    @Step("Verify Number with Number")
    public static void verifyNumber(int actual, int expected){
        assertEquals(actual,expected);
    }
}

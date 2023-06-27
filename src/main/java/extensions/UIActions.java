package extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {

    @Step("Click on Element")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    @Step("Update Text Element")
    public static void updateText(WebElement elem, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Update Text Element as Human")
    public static void updateTextHuman(WebElement elem, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        for (char ch: text.toCharArray()) {
            Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
            elem.sendKeys(ch + "");
        }
    }
    @Step("Update Drop Down Element")
    public static void updateDropDown(WebElement elem, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }

    @Step("Mouse Hover Element")
    public static void mouseHover(WebElement elem1,WebElement elem2){
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }
    @Step("Mouse Hover Element")
    public static void mouseHover(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        action.moveToElement(elem).click().build().perform();
    }

    @Step("Update Drop Down With Div")
    public static void updateDropDownWithDiv(WebElement elem, String text)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        List<WebElement> items = driver.findElements(By.xpath("//div[@role='option']"));
        for(WebElement myItem:items)
        {
            if(myItem.getText().equals(text)){
                myItem.click();
                break;
            }
        }
    }

    @Step("Delete Name in Table")
    public static void deleteNameInTable(List<WebElement> elements, String text)
    {
        for(WebElement element: elements){
            if(element.getText().contains(text))
            {
                int index = elements.indexOf(element);
                //driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+(index+1)+"]/div/div/div/div")).click();
                driver.findElement(By.xpath("//div[@class='oxd-table-body']/div["+(index+1)+"]/div/div[6]/div/button[1]")).click();
                break;
            }
        }
    }

    @Step("Insert Key")
    public static void insertKey(WebElement elem, Keys value){
        elem.sendKeys(value);
    }



}

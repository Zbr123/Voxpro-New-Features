package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class MyDocumentWeb {

    private String CATEGORY_REQUIRED_NOTIFICATION=".MuiGrid-container > div:nth-child(1) > div > div > span";



    public MyDocumentWeb(Page page) {}



    public WebElement getNotificationOfCategoryRequired(){
        return WebConnector.driver.findElement(By.cssSelector(CATEGORY_REQUIRED_NOTIFICATION));
    }


}

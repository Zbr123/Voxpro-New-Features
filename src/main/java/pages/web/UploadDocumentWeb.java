package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class UploadDocumentWeb {

    private String CATEGORY_REQUIRED_NOTIFICATION=".MuiGrid-container > div:nth-child(1) > div > div > span";
    private String DOCUMENT_TYPE_REQUIRED_NOTIFICATION=".MuiGrid-container > div:nth-child(2) > div > div > span";
    private String EXPIRATION_REQUIRED_NOTIFICATION="div:nth-child(3) > div > div > div > span";
    private String EMAIL_NOTIFICATION="div:nth-child(4) > div > span";
    private String PRIVACY_NOTIFICATION="div:nth-child(5) > div > div > span";


    public UploadDocumentWeb(Page page) {}

    public WebElement getNotificationOfTypeRequired() {
        return WebConnector.driver.findElement(By.cssSelector(DOCUMENT_TYPE_REQUIRED_NOTIFICATION));
    }

    public WebElement getNotificationOfCategoryRequired(){
        return WebConnector.driver.findElement(By.cssSelector(CATEGORY_REQUIRED_NOTIFICATION));
    }

    public WebElement getNotificationOfExpiration(){
        return WebConnector.driver.findElement(By.cssSelector(EXPIRATION_REQUIRED_NOTIFICATION));
    }

    public WebElement getNotificationOfEmail(){
        return WebConnector.driver.findElement(By.cssSelector(EMAIL_NOTIFICATION));
    }

    public WebElement getNotificationOfPrivacy(){
        return WebConnector.driver.findElement(By.cssSelector(PRIVACY_NOTIFICATION));
    }

}

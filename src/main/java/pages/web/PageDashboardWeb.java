package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageDashboardWeb {
    private String CANDIDATE_PROFILE_CSS = "div.app-header div:nth-child(2) > button";
    private String RESET_PASSWORD_CSS="div:nth-child(5)";
    private String PASSWORD_NAME="password";
    private String CONFIRM_PASSWORD_NAME="confirm_password";
    private String SET_Password_BUTTON_CSS=" form  button > span.MuiButton-label";
    private String VIEW_NEW_PASSWORD_BUTTON="div:nth-child(1) > div.MuiFormControl-root.MuiTextField-root.MuiFormControl-fullWidth button";
    private String NEW_EMAIL_ID="email";
    private String SECURITY_SETTING="div:nth-child(6)";
    private String CHANGE_EMAIL=" div:nth-child(2) > form > div.text-center.py-4 > button > span.MuiButton-label";
    private String CHANGE_PASSWORD=" div:nth-child(7) > button";
    public PageDashboardWeb(Page page) {}
    public WebElement getCandidateProfile() {
        return WebConnector.driver.findElement(By.cssSelector(CANDIDATE_PROFILE_CSS));}
    public WebElement getResetPasswordButton(){
            return WebConnector.driver.findElement(By.cssSelector(RESET_PASSWORD_CSS));
    }
    public WebElement getNewPassword() {
        return WebConnector.driver.findElement(By.name(PASSWORD_NAME));
    }
    public WebElement getConfirmNewPassword() {
        return WebConnector.driver.findElement(By.name(CONFIRM_PASSWORD_NAME));
    }
    public WebElement getSetPasswordButton() {
            return WebConnector.driver.findElement(By.cssSelector(SET_Password_BUTTON_CSS));
    }
    public WebElement getChangePasswordButton() {
        return WebConnector.driver.findElement(By.cssSelector(CHANGE_PASSWORD));
    }
    public WebElement getViewNewPassword() {
        return WebConnector.driver.findElement(By.cssSelector(VIEW_NEW_PASSWORD_BUTTON));
    }
    public WebElement getNewEmail() {
        return WebConnector.driver.findElement(By.name(NEW_EMAIL_ID));
    }
    public WebElement getSecuritySetting() {
        return WebConnector.driver.findElement(By.cssSelector(SECURITY_SETTING));
    }

    public WebElement getChangeEmailButton() {
        return WebConnector.driver.findElement(By.cssSelector(CHANGE_EMAIL));
    }


    public void clickOnElementUsingExecutor(WebElement abc) {
        WebElement element = abc;
        JavascriptExecutor executor = (JavascriptExecutor) WebConnector.driver;
        executor.executeScript("arguments[0].click()", element);
    }
}

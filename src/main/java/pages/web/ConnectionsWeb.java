package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class ConnectionsWeb {
    private String RECENT_CONNECTIONS_BUTTON=" div.mx-2  button:nth-child(1)";
    private String PENDING_CONNECTIONS_BUTTON=" div.mx-2 button:nth-child(2)";
    private String SENT_CONNECTIONS_BUTTON=" div.mx-2  button:nth-child(3)";
    private String EMAIL_RECENT_CONNECTION="div.profile-details > p:nth-child(3)";
    private String EMAIL_PROFILE="div.profile-info  tr:nth-child(2)";
    private String TELEPHONE_NUMBER_IN_RECENT_CONNECTION_PROFILE="div.profile-info  tr:nth-child(3) > td";
    private String MOBILE_NUMBER_IN_RECENT_CONNECTION_PROFILE="div.profile-info  tr:nth-child(4) > td";
    private String TELEPHONE_NUMBER_IN_SENT_CONNECTION_PROFILE="div.profile-info div:nth-child(2)  tr:nth-child(3)";
    private String UPLOAD_CV_IN_RECENT_CONNECTION="";
    public ConnectionsWeb(Page page) {}

    public WebElement getRecentConnectionsButton() {
        return WebConnector.driver.findElement(By.cssSelector(RECENT_CONNECTIONS_BUTTON));
    }
    public WebElement getPendingConnectionsButton() {
        return WebConnector.driver.findElement(By.cssSelector(PENDING_CONNECTIONS_BUTTON));
    }
    public WebElement getSentConnectionsButton() {
        return WebConnector.driver.findElement(By.cssSelector(SENT_CONNECTIONS_BUTTON));
    }
    public WebElement getEmailOnRecentConnection() {
        return WebConnector.driver.findElement(By.cssSelector(EMAIL_RECENT_CONNECTION));
    }
    public WebElement getEmailProfile() {
        return WebConnector.driver.findElement(By.cssSelector(EMAIL_PROFILE));
    }

    public WebElement getTelephoneContactInRecentConnectionProfile() {
        return WebConnector.driver.findElement(By.cssSelector(TELEPHONE_NUMBER_IN_RECENT_CONNECTION_PROFILE));
    }
    public WebElement getMobileContactInRecentConnectionProfile() {
        return WebConnector.driver.findElement(By.cssSelector(MOBILE_NUMBER_IN_RECENT_CONNECTION_PROFILE));
    }

    public WebElement getTelephoneContactInSentConnectionProfile() {
        return WebConnector.driver.findElement(By.cssSelector(TELEPHONE_NUMBER_IN_SENT_CONNECTION_PROFILE));
    }

    public WebElement getCv() {
        return WebConnector.driver.findElement(By.cssSelector(UPLOAD_CV_IN_RECENT_CONNECTION));
    }

}

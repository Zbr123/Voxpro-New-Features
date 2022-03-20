package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PagePartner {

    private String USERNAME_NAME = "username" ;
    private String PASSWORD_NAME= "password";
    private String LOGIN_BUTTON_CSS= ".login-row .login-button";
    private String GOT_IT_CSS= "#top > div  a:nth-child(4)";
    private String NAME_CSS= "div.name";
    private String SEARCH_CSS = "div:nth-child(3) input";
    private String TEAMS_CSS = "li:nth-child(6) > a";
    private String SEARCH_USER_CLASSNAME="search-btn";
    private String AUTOMATION_USER_CSS="div.member-name.cut-text.capitalize";

    public PagePartner(Page page) {
    }

    public WebElement getUserName() { return  WebConnector.driver.findElement(By.name(USERNAME_NAME)); }
    public WebElement getPassword() { return  WebConnector.driver.findElement(By.name(PASSWORD_NAME)); }
    public WebElement getLoginButton() { return  WebConnector.driver.findElement(By.cssSelector(LOGIN_BUTTON_CSS)); }
    public WebElement getGotItIcon() { return  WebConnector.driver.findElement(By.cssSelector(GOT_IT_CSS)); }
    public WebElement getNameText() { return  WebConnector.driver.findElement(By.cssSelector(NAME_CSS)); }
    public WebElement getSearchName() { return  WebConnector.driver.findElement(By.cssSelector(SEARCH_CSS)); }

    public WebElement getTeams() { return  WebConnector.driver.findElement(By.cssSelector(TEAMS_CSS)); }
    public WebElement getSearchUser() { return  WebConnector.driver.findElement(By.className(SEARCH_USER_CLASSNAME)); }

    public WebElement getUserDetails() { return  WebConnector.driver.findElement(By.cssSelector(AUTOMATION_USER_CSS)); }



}

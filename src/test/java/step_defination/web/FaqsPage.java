package step_defination.web;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.BrowerConfig.WebConnector;
import core.utils.ConfigUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.Page;

import java.util.Properties;

public class FaqsPage extends Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public WebDriver driver = WebConnector.driver;

    @Given("^\\[Main Page]Navigate to the Vox Pro home page$")
    public void  openWebUrl() {
        String webUrl = myProp.getProperty("weburl");
        driver.get(webUrl);
        driver.manage().window().maximize();
    }

//    @Then("^\\[Main Page] Navigate to FAQs page$")
//    public void openFaqsPage() throws InterruptedException {
//        getPagePartner().getHelpCenter().click();
//        getPagePartner().getFAQ().click();
//        Thread.sleep(10000);
//    }

    @Then("^\\[Main Page] Enter UserName and Password and Click on Login$")
    public void signInFunction() throws InterruptedException {
        getPagePartner().getUserName().sendKeys("nabeel@df.com");
        getPagePartner().getPassword().sendKeys("123123");
        getPagePartner().getLoginButton().click();
        Thread.sleep(10000);
        getPagePartner().getGotItIcon().click();
        getPagePartner().getNameText().click();
        getPagePartner().getNameText().click();
        Thread.sleep(10000);
        getPagePartner().getGotItIcon().click();
        Thread.sleep(40000);
        getPagePartner().getTeams().click();
        Thread.sleep(40000);
        getPagePartner().getSearchUser().click();
        getPagePartner().getSearchUser().sendKeys("Automation User");
        getPagePartner().getUserDetails().click();


    }
}


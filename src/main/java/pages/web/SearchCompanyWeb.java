package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.Page;

public class SearchCompanyWeb {

    private String SEARCH_BUTTON="li:nth-child(5) > a";
    private String SEARCH_AGENCY=" li:nth-child(5) li:nth-child(2) > a";
    private String NAME_FIELD_NAME= "name";
    private String COMPANY_LOCATION_NAME="locationName";
    private String COMPANY_INDUSTRY_NAME="industriesName";
    private String NUMBER_OF_JOBS_CSS="div:nth-child(4) > div > div > input";

    public SearchCompanyWeb(Page page) {}

    public WebElement getNameField() {
        return WebConnector.driver.findElement(By.name(NAME_FIELD_NAME));
    }
    public WebElement getCompanyLocation() {
        return WebConnector.driver.findElement(By.name(COMPANY_LOCATION_NAME));
    }
    public WebElement getCompanyIndustry() {
        return WebConnector.driver.findElement(By.name(COMPANY_INDUSTRY_NAME));
    }
    public WebElement getNumberOfJobs() {
        return WebConnector.driver.findElement(By.cssSelector(NUMBER_OF_JOBS_CSS));
    }
    public WebElement getSearchButton() {
        return WebConnector.driver.findElement(By.cssSelector(SEARCH_BUTTON));
    }
    public WebElement getSearchAgency() {
        return WebConnector.driver.findElement(By.cssSelector(SEARCH_AGENCY));
    }


}

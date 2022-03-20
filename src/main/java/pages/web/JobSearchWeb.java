package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

import java.util.List;

import static core.utils.AppiumHook.AppiumServerRunner.driver;

public class JobSearchWeb {

private String JOBS_SEARCH_WHAT="div:nth-child(1) > div > div > div > input";
private String JOBS_SEARCH_WHERE="div:nth-child(2) > div > div > div > input";
private String DISTANCE_FILTER="div:nth-child(2) > div:nth-child(1) > select";
private String SELECT_DISTANCE="div:nth-child(2) > div:nth-child(1) > select > option:nth-child(4)";
private String JOB_PAGES=":nth-child(1) > div > div > div >.py-2 > div > h2";


    public JobSearchWeb(Page page) {}



    public WebElement getJobPages() {
        List<WebElement> listBoxItems = driver.findElements(By.className("py-2"));

        return WebConnector.driver.findElement(By.cssSelector(JOBS_SEARCH_WHAT));}

    public WebElement getJobSearchWhat() {
        return WebConnector.driver.findElement(By.cssSelector(JOBS_SEARCH_WHAT));
    }

    public WebElement getJobSearchWhere() {
        return WebConnector.driver.findElement(By.cssSelector(JOBS_SEARCH_WHERE));}

    public WebElement getDistanceFilter() {
        return WebConnector.driver.findElement(By.cssSelector(DISTANCE_FILTER));}
    public WebElement getSelectDistance() {
        return WebConnector.driver.findElement(By.cssSelector(SELECT_DISTANCE));}

}

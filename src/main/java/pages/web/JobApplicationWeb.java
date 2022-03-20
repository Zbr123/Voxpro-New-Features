package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Page;

public class JobApplicationWeb {


private String JOB_TITLE_NAME ="jobTitleName";
private String LOCATION_NAME="locationName";
private String STATUS_CLASS= "z-over css-2b097c-container";
private String SEARCH_CLASS="px-2";
private String APPLIED_CSS=" div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-2 > div:nth-child(1)  div.font-size-lg.opacity-8";
private String UNSUCCESSFUL_CSS=" div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-2 > div:nth-child(2) div.font-size-lg.opacity-8";
private String Shortlisted_CSS=" div:nth-child(3) div.font-size-lg.opacity-8";
private String Interviews_CSS="div:nth-child(4) > div > a div.font-size-lg.opacity-8";
private String Offers_CSS="div:nth-child(5) > div > a > div > div.font-size-lg.opacity-8";
private String Placement_CSS="div:nth-child(6) > div > a > div > div.font-size-lg.opacity-8";
private String JOBS_PATHS="li:nth-child(6) > a";
private String JOBS_APPLICATION_BUTTON="li:nth-child(6)  li:nth-child(3) > a";
private String SEARCH_JOB_TITLE="tr:nth-child(1)  td:nth-child(3)";
private String SEARCH_JOB_LOCATION="tr:nth-child(1)  td:nth-child(4)";
private String APPLIED_JOBS_ASSERTION="div:nth-child(5)  td:nth-child(7) > div.font-size-md.text-center";

    public JobApplicationWeb(Page page) {}
    public WebElement getJobTitleField() {
        return WebConnector.driver.findElement(By.name(JOB_TITLE_NAME));}
    public WebElement getJobLocationField() {
        return WebConnector.driver.findElement(By.name(LOCATION_NAME));}
    public WebElement getStatusField() {
        return WebConnector.driver.findElement(By.className(STATUS_CLASS));}
    public WebElement getJobApplied() {
        return WebConnector.driver.findElement(By.cssSelector(APPLIED_CSS));}
    public WebElement getJobUnsuccessful() {
        return WebConnector.driver.findElement(By.cssSelector(UNSUCCESSFUL_CSS));}
    public WebElement getJobShortlisted() {
        return WebConnector.driver.findElement(By.cssSelector(Shortlisted_CSS));}
    public WebElement getJobInterview() {
        return WebConnector.driver.findElement(By.cssSelector(Interviews_CSS));}
    public WebElement getJobOffer() {
        return WebConnector.driver.findElement(By.cssSelector(Offers_CSS));}
    public WebElement getJobPlacement() {
        return WebConnector.driver.findElement(By.cssSelector(Placement_CSS));}
    public WebElement getJobSearch()
    {
        return WebConnector.driver.findElement(By.className(SEARCH_CLASS));
    }
    public WebElement getJobPath() {
        return WebConnector.driver.findElement(By.cssSelector(JOBS_PATHS));}

    public WebElement getJobApplicationButton() {
        return WebConnector.driver.findElement(By.cssSelector(JOBS_APPLICATION_BUTTON));}

    public WebElement getSearchJobTitle() {
        return WebConnector.driver.findElement(By.cssSelector(SEARCH_JOB_TITLE));}

    public WebElement getSearchJobLocation() {
        return WebConnector.driver.findElement(By.cssSelector(SEARCH_JOB_LOCATION));}

    public WebElement getAppliedJobCheck() {
        return WebConnector.driver.findElement(By.cssSelector(APPLIED_JOBS_ASSERTION));}

}

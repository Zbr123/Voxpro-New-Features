package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class JobPlacementWeb {


private String JOB_PLACEMENT_BUTTON ="li:nth-child(6)  li:nth-child(4) > a";
private String TOTAL_PLACEMENT_CSS=" div:nth-child(1) > div > a > div > div.font-size-lg.opacity-8";
private String ACTIVE_PLACEMENT_CSS="div:nth-child(2) > div > a > div > div.font-size-lg.opacity-8";
private String ACTIVE_PLACEMENT_DUE_TO_END_CSS="div:nth-child(3) > div > a > div > div.font-size-md.opacity-8";
private String PLACEMENT_ENDED_CSS="div:nth-child(4) > div > a div.font-size-lg.opacity-8";
private String OUTSTANDING_IR_STATUS_CSS=" div:nth-child(5) > div > a > div > div.font-size-md.opacity-8";
private String OUTSTANDING_ON_BOARDING_DOCUMENT_CSS="div:nth-child(6) > div > a > div > div.font-size-md.opacity-8";


    public JobPlacementWeb(Page page) {}

    public WebElement getJobPlacementButton() {
        return WebConnector.driver.findElement(By.cssSelector(JOB_PLACEMENT_BUTTON));}

    public WebElement getTotalPlacement() {
        return WebConnector.driver.findElement(By.cssSelector(TOTAL_PLACEMENT_CSS));}
    public WebElement getActivePlacement() {
        return WebConnector.driver.findElement(By.cssSelector(ACTIVE_PLACEMENT_CSS));}
    public WebElement getPlacementEnded() {
        return WebConnector.driver.findElement(By.cssSelector(PLACEMENT_ENDED_CSS));}
    public WebElement getActivePlacementDueToEnd() {
        return WebConnector.driver.findElement(By.cssSelector(ACTIVE_PLACEMENT_DUE_TO_END_CSS));}
    public WebElement getOutstandingIr() {
        return WebConnector.driver.findElement(By.cssSelector(OUTSTANDING_IR_STATUS_CSS));}
    public WebElement getOutstandingOnBoardingDocument() {
        return WebConnector.driver.findElement(By.cssSelector(OUTSTANDING_ON_BOARDING_DOCUMENT_CSS));}



}

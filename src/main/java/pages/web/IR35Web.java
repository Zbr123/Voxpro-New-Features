package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class IR35Web {
    private String IR_BUTTON=" li:nth-child(3) span.sidebar-icon-indicator > svg";
    private String IR_NEW_BUTTON=" li:nth-child(3)  li:nth-child(1) > a";
    private String IR_HISTORY_BUTTON=" li:nth-child(3)  li:nth-child(2) > a";
    private String IR_QUERIES_BUTTON=" li:nth-child(3)  li:nth-child(3) > a";
    private String NEW_IR_PAGE="div.font-12.position-relative.p-3 > div > h4";
    private String HISTORY_TOTAL_IR_SUBMITTED="div:nth-child(1) > div > div.font-weight-bold.font-size-sm.text-uppercase";
    private String HISTORY_TOTAL_IR_DETERMINATION="div:nth-child(2) > div > div.font-weight-bold.font-size-sm.text-uppercase";
    private String HISTORY_TOTAL_IR_DUE_TODAY="div:nth-child(3) > div > div.font-weight-bold.font-size-sm.text-uppercase";
    private String HISTORY_TITLE_PLACEMENT_ID=" th:nth-child(1)";
    private String HISTORY_TITLE_REQUESTER=" th:nth-child(2)";
    private String HISTORY_TITLE_ROLE=" th:nth-child(3)";
    private String HISTORY_TITLE_DATE_SUBMITTED="th:nth-child(4)";
    private String HISTORY_TITLE_STAGE="th:nth-child(5)";
    private String HISTORY_TITLE_DUE_DATE="th:nth-child(6)";
    private String HISTORY_TITLE_DOCUMENTS="th:nth-child(7)";
    private String HISTORY_TITLE_STATUS_CERTIFICATE="th:nth-child(8)";


    private String QUERIES_TOTAL_IR_PENDING="div:nth-child(1) > div > div.font-weight-bold.font-size-sm";
    private String QUERIES_TOTAL_IR_QUERY_RESOLVED="div:nth-child(2) > div > div.font-weight-bold.font-size-sm";
    private String QUERIES_RESPONSE_DUE="div:nth-child(3) > div > div.font-weight-bold.font-size-sm";
    private String QUERIES_TITLE_PLACEMENT_ID=" th:nth-child(1)";
    private String QUERIES_TITLE_REQUESTER=" th:nth-child(2)";
    private String QUERIES_TITLE_ROLE=" th:nth-child(3)";
    private String QUERIES_TITLE_DATE_OF_QUERY="th:nth-child(4)";
    private String QUERIES_TITLE_DUE_DATE="th:nth-child(5)";
    private String QUERIES_TITLE_STAGE_OF_QUERY="th:nth-child(6)";
    private String QUERIES_TITLE_RESPONSE="th:nth-child(7)";



    public IR35Web(Page page) {}

    public WebElement getIRButton() {
        return WebConnector.driver.findElement(By.cssSelector(IR_BUTTON));
    }
    public WebElement getIRNew() {
        return WebConnector.driver.findElement(By.cssSelector(IR_NEW_BUTTON));
    }
    public WebElement getIRHistory() {
        return WebConnector.driver.findElement(By.cssSelector(IR_HISTORY_BUTTON));
    }
    public WebElement getIRQueries() {
        return WebConnector.driver.findElement(By.cssSelector(IR_QUERIES_BUTTON));
    }

    public WebElement getIRPage() {
        return WebConnector.driver.findElement(By.cssSelector(NEW_IR_PAGE));
    }
    public WebElement getHistoryTotalIrSubmitted() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TOTAL_IR_SUBMITTED));
    }
    public WebElement getHistoryIrDetermination() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TOTAL_IR_DETERMINATION));
    }
    public WebElement getTotalIrDueToday() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TOTAL_IR_DUE_TODAY));
    }
    public WebElement getHistoryRequesterTitle() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TITLE_REQUESTER));
    }
    public WebElement getHistoryRoleTitle() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TITLE_ROLE));
    }
    public WebElement getHistoryDateSubmitted() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TITLE_DATE_SUBMITTED));
    }
    public WebElement getHistoryStageTitle() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TITLE_STAGE));
    }
    public WebElement getHistoryPlacementTitle() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TITLE_PLACEMENT_ID));
    }
    public WebElement getHistoryDueDateTitle() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TITLE_DUE_DATE));
    }
    public WebElement getHistoryDocument() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TITLE_DOCUMENTS));
    }
    public WebElement getHistoryStatusCertificate() {
        return WebConnector.driver.findElement(By.cssSelector(HISTORY_TITLE_STATUS_CERTIFICATE));
    }


    public WebElement getQueriesTotalIrPending() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TOTAL_IR_PENDING));
    }
    public WebElement getQueriesResolved() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TOTAL_IR_QUERY_RESOLVED));
    }
    public WebElement getQueriesResponseDueDay() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_RESPONSE_DUE));
    }

    public WebElement getQueriesRequesterTitle() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TITLE_REQUESTER));
    }
    public WebElement getQueriesRoleTitle() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TITLE_ROLE));
    }
    public WebElement getQueriesDateQuery() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TITLE_DATE_OF_QUERY));
    }
    public WebElement getQueriesStageQueryTitle() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TITLE_STAGE_OF_QUERY));
    }
    public WebElement getPlacementTitle() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TITLE_PLACEMENT_ID));
    }
    public WebElement getQueriesDueDateTitle() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TITLE_DUE_DATE));
    }
    public WebElement getQueriesResponseTitle() {
        return WebConnector.driver.findElement(By.cssSelector(QUERIES_TITLE_RESPONSE));
    }




}

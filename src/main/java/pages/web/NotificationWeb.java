package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Page;

public class NotificationWeb {


    private String NAME_FIELD_NAME= "name";
    private String JOB_TITLE_NAME="jobTitleName";
    private String JOB_LOCATION_NAME="locationName";
    private String NUMBER_OF_JOBS_CSS="div:nth-child(4) > div > div > input";
    private String OTHER_EMAIL_NAME="other_email";
    private String PHONE_NUMBER_CSS=".MuiDialogContent-root form :nth-child(3) > div>:nth-child(2) input";
    private String MOBILE_NUMBER_CSS=":nth-child(4) :nth-child(2) > div.MuiFormControl-root.MuiTextField-root.MuiFormControl-fullWidth > div input";
    private String WEBSITE_PORTFOLIO_CSS=":nth-child(5) > div >:nth-child(2) input";
    private String LINKEDIN_URL_CSS=":nth-child(6) :nth-child(2) .MuiFormControl-fullWidth input";
    private String FACEBOOK_URL_CSS=".MuiDialogContent-root form :nth-child(7) .MuiFormControl-fullWidth input";
    private String TWITTER_URL_CSS=":nth-child(8) :nth-child(2) .MuiFormControl-fullWidth input";
    private String INSTAGRAM_URL_CSS=":nth-child(9) :nth-child(2).MuiFormControl-fullWidth input";
    private String PROFILE_FIRST_NAME_NAME="first_name";
    private String PROFILE_LAST_NAME_NAME="last_name";
    private String PROFILE_HIGHLIGHT_NAME="headline";
    private String STREET_CSS="form > div:nth-child(8) input";
    private String POSTAL_CODE=".MuiDialogContent-root :nth-child(10) input";
    private String PRONOUN_NAME=" css-2b097c-container";
    private String SALUTATION_NAME=" css-1hwfws3";
    private String COUNTRY_ID="country";
    private String TOWN_STATE_NAME=" css-1hwfws3";
    private String CITY_NAME=" css-1hwfws3";
    private String NOTIFICATION_BUTTON="span:nth-child(5) > span > button";
    private String MAKE_YOUR_FIRST_CONNECTION_Button="div:nth-child(2) > div > div > div > div > div > div > div:nth-child(4) > button";
    private String TASK_BUTTON="div.mx-2 > div > div > div > button:nth-child(2)";
    private String CONSULTANT_KEYWORDS_BUTTON="div:nth-child(1) > div > div > div.card-header button";
    private String CONSULTANT_NAME_BUTTON="div:nth-child(2) > div > div > div.card-header button";
    private String CONSULTANT_RECRUITS_INDUSTRIES_BUTTON="div:nth-child(3) > div > div > div.card-header button";
    private String CONSULTANT_RECRUITS_LOCATION_BUTTON="div:nth-child(4) > div > div > div.card-header button";
    private String CONSULTANT_RECRUITS_FOR_JOB_TITLE_BUTTON="div:nth-child(5) > div > div > div.card-header button";
    private String CONSULTANT_RECRUITS_JOB_TYPE_BUTTON="div:nth-child(6) > div > div > div.card-header button";
    private String CONSULTANT_SPECIALITIES_BUTTON="div:nth-child(7) > div > div > div.card-header button";
    private String CONSULTANT_HAS_OPEN_JOBS_BUTTON="div:nth-child(8) > div > div > div.card-header button";
    private String CONSULTANT_KEYWORD_TEXT_NAME="keywords";
    private String CONSULTANT_NAME_TEXT_NAME="name";
    private String CONSULTANT_RECRUITS_INDUSTRIES_TEXT_NAME="industriesName";
    private String CONSULTANT_RECRUITS_LOCATION_TEXT_CSS="div:nth-child(4)  input";
    private String CONSULTANT_RECRUITS_FOR_JOB_TITLE_TEXT_CSS="div:nth-child(5)  input";
    private String CONSULTANT_RECRUITS_JOB_TYPE_TEXT_CSS="div:nth-child(6)  input";
    private String CONSULTANT_SPECIALITIES_TEXT_CSS="div:nth-child(7)  input";
    private String CONSULTANT_HAS_OPEN_JOBS_TICK_CSS="div:nth-child(8)  input";

    public NotificationWeb(Page page) {}
    public WebElement getNameField() {
        return WebConnector.driver.findElement(By.name(NAME_FIELD_NAME));
    }
    public WebElement getJobTitle() {
        return WebConnector.driver.findElement(By.name(JOB_TITLE_NAME));
    }
    public WebElement getJobLocation() {
        return WebConnector.driver.findElement(By.name(JOB_LOCATION_NAME));
    }
    public WebElement getOtherEmail() {
        return WebConnector.driver.findElement(By.name(OTHER_EMAIL_NAME));
    }
    public WebElement getMobileNumber() {
        return WebConnector.driver.findElement(By.cssSelector(MOBILE_NUMBER_CSS));
    }
    public WebElement getPhoneNumber() {
        return WebConnector.driver.findElement(By.cssSelector(PHONE_NUMBER_CSS));
    }
    public WebElement getWebsitePortfolio() {
        return WebConnector.driver.findElement(By.cssSelector(WEBSITE_PORTFOLIO_CSS));
    }
    public WebElement getLinkedInUrl() {
        return WebConnector.driver.findElement(By.cssSelector(LINKEDIN_URL_CSS));
    }
    public WebElement getFacebook() {
        return WebConnector.driver.findElement(By.cssSelector(FACEBOOK_URL_CSS));
    }
    public WebElement getInstagramUrl() {
        return WebConnector.driver.findElement(By.cssSelector(INSTAGRAM_URL_CSS));
    }
    public WebElement getTwitterUrl() {
        return WebConnector.driver.findElement(By.cssSelector(TWITTER_URL_CSS));
    }
    public WebElement getProfileFirstName() {
        return WebConnector.driver.findElement(By.name(PROFILE_FIRST_NAME_NAME));
    }
    public WebElement getProfileLastName() {
        return WebConnector.driver.findElement(By.name(PROFILE_LAST_NAME_NAME));
    }
    public WebElement getProfileHighlight() {
        return WebConnector.driver.findElement(By.name(PROFILE_HIGHLIGHT_NAME));
    }
    public WebElement getStreet() {
        return WebConnector.driver.findElement(By.cssSelector(STREET_CSS));
    }
    public WebElement getPostalCode() {
        return WebConnector.driver.findElement(By.cssSelector(POSTAL_CODE));
    }
    public WebElement getNumberOfJobs() {
        return WebConnector.driver.findElement(By.cssSelector(NUMBER_OF_JOBS_CSS));
    }
    public WebElement getPronoun() {
        return WebConnector.driver.findElement(By.className(PRONOUN_NAME));
    }
    public WebElement getSalutationName() {
        return WebConnector.driver.findElement(By.name(SALUTATION_NAME));
    }
    public WebElement getCountry() {
        return WebConnector.driver.findElement(By.id(COUNTRY_ID));
    }
    public WebElement getTownOrState() {
        return WebConnector.driver.findElement(By.name(TOWN_STATE_NAME));
    }

    public WebElement getCityName() {
        return WebConnector.driver.findElement(By.name(CITY_NAME));
    }
    public WebElement getNotificationButton() {
        return WebConnector.driver.findElement(By.cssSelector(NOTIFICATION_BUTTON));
    }
    public WebElement getConsultantKeywordButton() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_KEYWORDS_BUTTON));
    }
    public WebElement getConsultantKeywordText() {
        return WebConnector.driver.findElement(By.name(CONSULTANT_KEYWORD_TEXT_NAME));
    }
    public WebElement getConsultantRecruitIndustriesButton() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_RECRUITS_INDUSTRIES_BUTTON));
    }
    public WebElement getConsultantRecruitLocationButton() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_RECRUITS_LOCATION_BUTTON));
    }
    public WebElement getConsultantRecruitJobTitleButton() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_RECRUITS_FOR_JOB_TITLE_BUTTON));
    }
    public WebElement getConsultantRecruitJobTypeButton() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_RECRUITS_JOB_TYPE_BUTTON));
    }
    public WebElement getConsultantSpecialitiesButton() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_SPECIALITIES_BUTTON));
    }
    public WebElement getConsultantHasOpenJobsButton() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_HAS_OPEN_JOBS_BUTTON));
    }
    public WebElement getConsultantHasOpenJobsTick() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_HAS_OPEN_JOBS_TICK_CSS));
    }
    public WebElement getConsultantNameButton() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_NAME_BUTTON));
    }
    public WebElement getConsultantNameText() {
        return WebConnector.driver.findElement(By.name(CONSULTANT_NAME_TEXT_NAME));
    }
    public WebElement getConsultantRecruitsIndustries() {
        return WebConnector.driver.findElement(By.name(CONSULTANT_RECRUITS_INDUSTRIES_TEXT_NAME));
    }
    public WebElement getConsultantRecruitsLocation() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_RECRUITS_LOCATION_TEXT_CSS));
    }
    public WebElement getConsultantRecruitsJobTitle() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_RECRUITS_FOR_JOB_TITLE_TEXT_CSS));
    }
    public WebElement getConsultantRecruitsJobType() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_RECRUITS_JOB_TYPE_TEXT_CSS));
    }
    public WebElement getConsultantSpecialities() {
        return WebConnector.driver.findElement(By.cssSelector(CONSULTANT_SPECIALITIES_TEXT_CSS));
    }
    public WebElement getMakeYourFirstConnection() {
        return WebConnector.driver.findElement(By.cssSelector(MAKE_YOUR_FIRST_CONNECTION_Button));
    }
    public WebElement getTaskButton() {
        return WebConnector.driver.findElement(By.cssSelector(TASK_BUTTON));
    }
}

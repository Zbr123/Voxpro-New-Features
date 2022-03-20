package step_defination.web;

import core.utils.AndroidCore.AndroidDriverSetup;
import core.utils.AndroidCore.AppiumServerRunner;
import core.utils.AndroidCore.CapabilitiesGenerator;
import core.utils.BrowerConfig.WebConnector;
import core.utils.ConfigUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en_old.Ac;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Page;


import static core.utils.AndroidCore.AndroidDriverSetup.quitAndroidDriver;
import static core.utils.AndroidCore.AppiumServerRunner.StartAppiumServer;
import static core.utils.AndroidCore.AndroidDriverSetup.androidDriver;
import static core.utils.AppiumHook.AppiumServerRunner.driver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MainPage extends Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public WebDriver driver = WebConnector.driver;
    String signInButtonCss = "form > div > button";
    String verifyButton = "form button > span:nth-child(2)";
    String keepSignIn = "#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > div:nth-child(3) > form > div.d-flex.justify-content-between.align-items-center.font-size-md > label > span.MuiButtonBase-root.MuiIconButton-root.jss206.MuiCheckbox-root.MuiCheckbox-colorPrimary.MuiIconButton-colorPrimary > span.MuiIconButton-label";
    String forgetPassword = "#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > div:nth-child(3) > div:nth-child(2) > a";
    String registerButton = "div:nth-child(3) > a";
    String candidateProfileButton = "div.app-header div:nth-child(2) > button";
    String resetPasswordButton = "div:nth-child(5)";
    String confirmPasswordButton = ".app-main :nth-child(4) .text-center.py-4 .MuiButton-label";
    String agencyRegistrationButton = " div:nth-child(2) > div > div > div > div > div.font-size-sm.text-black.px-2.opacity-7 > a";
    String companyRegistrationButton = " div:nth-child(3) > div > div > div > div > div.font-size-sm.text-black.px-2.opacity-7 > a";
    String candidateRegistrationButton = " div:nth-child(1) > div > div > div > div > div.font-size-sm.text-black.px-2.opacity-7 > a";
    String privacyPolicyButton = "policy";
    String CreateAccountButton = "MuiButton-label";
    String registerWithGoogleAccount = "gb-btn";
    String registerWithFacebookAccount = "fb-btn";
    String sendPassword = "MuiButton-label";
    String returnToHomePage = "text-first";
    String notificationButton = "span:nth-child(5) > span > button";
    String taskButton = "div.mx-2 > div > div > div > button:nth-child(2)";
    String makeYourFirstConnection = " div:nth-child(2) > div > div > div > div > div > div > div:nth-child(4) > button";
    String searchButton = " div.MuiGrid-root.MuiGrid-item.MuiGrid-grid-xs-12.MuiGrid-grid-md-2 > button > span.MuiButton-label";
    String passwordViewButton = "span.MuiIconButton-label";
    String capcha_CSS = "goggle.capcha";
    String log_Out_Password = "li.MuiListItem-root.d-block.text-center.p-3.MuiListItem-gutters > button > span.MuiButton-label";
    String COMPLETE_YOUR_PROFILE =" div:nth-child(5) > div.MuiPaper-root.MuiPopover-paper.MuiPaper-elevation8.MuiPaper-rounded > div > div.height-470 > div > div:nth-child(2) > div > div > div > div > div > div > div:nth-child(3) > button";
    String Edit_Personal_Information_Button="div:nth-child(2) > div.MuiGrid-root.mt-5.MuiGrid-item.MuiGrid-grid-xs-1 > svg";
    String PROFILE_SAVE_BUTTON=" div.text-right.mt-3 span.MuiTouchRipple-root";
    String COUNTRY_BUTTON=" css-tlfecz-indicatorContainer";
    String TASK_BUTTON=" button.MuiTab-textColorInherit > span.MuiTab-wrapper";
    String VIEW_NEW_PASSWORD_BUTTON="div:nth-child(1) > div.MuiFormControl-root.MuiTextField-root.MuiFormControl-fullWidth button";
    String SEARCH_BUTTON="li:nth-child(5) > a";
    String SEARCH_CONSULTANT=" li:nth-child(5) li:nth-child(3) > a";
    String SECURITY_SETTING="div:nth-child(6)";
    String CHANGE_EMAIL="div:nth-child(4) > button";
    String NEW_EMAIL_ID="email";
    String CHANGE_PASSWORD=" div:nth-child(7) > button";
    String VIEW_NEW_PASSWORD_CSS=" form > div:nth-child(1)  button";
    String VIEW_CONFIRM_NEW_PASSWORD_CSS=" form > div:nth-child(2) button";
    String JOBS_PATHS="li:nth-child(6) > a";
    String JOBS_APPLICATION_BUTTON="li:nth-child(6)  li:nth-child(3) > a";
    String STATUS_CLASS= "css-1wa3eu0-placeholder";
    String SEARCH_CLASS="px-2";
    String DROP_DOWN=".css-1wy0on6 svg path";
    String APPLIED_CSS=" div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-2 > div:nth-child(1)  div.font-size-lg.opacity-8";
    String ACTION_BUTTON_IN_APPLIED_JOB="div:nth-child(5) td:nth-child(8)  button";
    String FOLLOW_UP_ACTION_IN_APPLIED_JOB=".MuiPaper-elevation8.MuiPaper-rounded > ul > div > li:nth-child(1)";
    String UNSUCCESSFUL_CSS=" div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-2 > div:nth-child(2) div.font-size-lg.opacity-8";
    String Shortlisted_CSS=" div:nth-child(3) div.font-size-lg.opacity-8";
    String Interviews_CSS="div:nth-child(4) > div > a div.font-size-lg.opacity-8";
    String Offers_CSS="div:nth-child(5) > div > a > div > div.font-size-lg.opacity-8";
    String Placement_CSS="div:nth-child(6) > div > a > div > div.font-size-lg.opacity-8";
    String CONSULTANT_KEYWORDS="div:nth-child(1) > div > div > div.card-header button";
    String CONSULTANT_NAME_BUTTON="div:nth-child(2) > div > div > div.card-header button";
    String CONSULTANT_RECRUITS_INDUSTRIES_BUTTON="div:nth-child(3) > div > div > div.card-header button";
    String CONSULTANT_RECRUITS_LOCATION_BUTTON="div:nth-child(4) > div > div > div.card-header button";
    String CONSULTANT_RECRUITS_FOR_JOB_TITLE_BUTTON="div:nth-child(5) > div > div > div.card-header button";
    String CONSULTANT_RECRUITS_JOB_TYPE_BUTTON="div:nth-child(6) > div > div > div.card-header button";
    String CONSULTANT_SPECIALITIES_BUTTON="div:nth-child(7) > div > div > div.card-header button";
    String CONSULTANT_HAS_OPEN_JOBS_BUTTON="div:nth-child(8) > div > div > div.card-header button";
    String CONSULTANT_HAS_OPEN_JOBS_TICK_CSS="div:nth-child(8)  input";
    String SEARCH_COMPANIES="li:nth-child(5)  li:nth-child(1) > a";
    String SEARCH_AGENCY=" li:nth-child(5) li:nth-child(2) > a";
    String ADVANCED_SEARCH=" div.MuiGrid-root.text-center.MuiGrid-grid-xs-12 > button > span.MuiButton-label";
    String IR_BUTTON="li:nth-child(3) > a";
    String IR_NEW_BUTTON=" li:nth-child(3)  li:nth-child(1) > a";
    String IR_HISTORY_BUTTON=" li:nth-child(3)  li:nth-child(2) > a";
    String IR_QUERIES_BUTTON=" li:nth-child(3)  li:nth-child(3) > a";
    String REQUEST_FOR_INFORMATION="li:nth-child(4) > a";
    String NEW_REQUEST_FOR_INFORMATION=" li:nth-child(4)  li:nth-child(1) > a";
    String HISTORY_REQUEST_FOR_INFORMATION=" li:nth-child(4)  li:nth-child(2) > a";
    String CONNECTIONS_BUTTON="li:nth-child(8) > a";
    String RECENT_CONNECTIONS_BUTTON="div.mx-2  button:nth-child(1)";
    String PENDING_CONNECTIONS_BUTTON=" div.mx-2 button:nth-child(2)";
    String SENT_CONNECTIONS_BUTTON=" div.mx-2  button:nth-child(3)";
    String RECENT_CONNECTIONS_VIEW_BUTTON=" div:nth-child(1) > div.profile-list-btn > button.MuiButtonBase-root.bg-dark-blue.text-white";
    String RECENT_CONNECTION_MORE_BUTTON=" div:nth-child(1) button.btn-outline-primary.d-flex.justify-content-around";
    String RECENT_CONNECTION_SEND_CV="#simple-menu  ul > div  li:nth-child(1)";
    String RECENT_CONNECTIONS_CHAT_BUTTON=" div:nth-child(1) > div.profile-list-btn  svg";
    String MESSAGE_BUTTON_RECENT_CONNECTION="div:nth-child(1) > div > div > button:nth-child(1)";
    String SENT_CONNECTIONS_VIEW_BUTTON="div:nth-child(3) div:nth-child(1) > div.profile-list-btn > button";
    String SENT_CONNECTIONS_CANCEL_BUTTON="div:nth-child(3) div:nth-child(3) div:nth-child(1) > div.profile-list-btn > svg";
    String PENDING_CONNECTION_IN_SENT_CONNECTION=" div:nth-child(1) > div > div > button:nth-child(1)";
    String WITH_DRAW_CONNECTION_BUTTON_IN_SENT_CONNECTION="button.hover-scale-sm.mr-2";
    String SEARCH_JOBS=" li:nth-child(6) li:nth-child(1) > a";
    String SEARCH_JOBS_SEARCH_BUTTON="div:nth-child(3) > button ";
    String DISTANCE_FILTER="div:nth-child(2) > div:nth-child(1) > select";
    String SELECT_DISTANCE="div:nth-child(2) > div:nth-child(1) > select > option:nth-child(4)";
    String SALARY_RANGE_START_FILTER_NAME="startSalary";
    String SALARY_START_RANGE="div:nth-child(3) > select:nth-child(2) > option:nth-child(3)";
    String SALARY_END_RANGE="select:nth-child(4) > option:nth-child(4)";
    String SALARY_RANGE_END_FILTER_NAME="endSalary";
    String JOB_TYPE_IN_SEARCH_JOB="div:nth-child(4)  div:nth-child(4) > div > div label:nth-child(1) input";
    String DATE_POSTED_FILTER_NAME="datePost";
    String DATE_POSTED_FIELD="div:nth-child(6) > div > select > option:nth-child(3)";
    String SPECIALISMS_SEARCH_JOB_FILTER="div:nth-child(8) label:nth-child(1)  input";
    String POST_BY_SEARCH_JOB_FILTER="div:nth-child(10)  label:nth-child(1)  input";
    String RELATED_JOBS_SEARCH_JOB_FILTER=" div:nth-child(12) div:nth-child(5)  input";
    String ONBOARD_DOCUMENT="li:nth-child(2) > a";
    //UPLOAD DOCUMENT
    String UPLOAD_DOCUMENT="li:nth-child(2)  ul > li:nth-child(2) > a";
    String CATEGORY_NAME="categoryId";
    String SELECT_DOC_NAME="docId";
    String EXPIRATION="div:nth-child(3) > div > div > select";
    String NOTIFY_BY_EMAIL=" div:nth-child(3)  div:nth-child(4)  select";
    String PRIVACY="div:nth-child(3)  div:nth-child(5)  select";
    String UPLOAD_BUTTON="div:nth-child(3) > div.pt-1 > button";
   //Connection
   String EMAIL_RECENT_CONNECTION="div.profile-details > p:nth-child(3)";
   String EMAIL_PROFILE="div.profile-info  tr:nth-child(2) > td";
   String PROFILE_NAME_IN_RECENT_CONNECTION="p:nth-child(1)";
   String PROFILE_NAME_IN_PROFILE="div:nth-child(1) > div > h2";
   String PROFILE_NAME_IN_SENT_CONNECTION="div:nth-child(1) > div.profile-details > p:nth-child(1)";
   String PROFILE_NAME_IN_VIEW_SENT_CONNECTION="div:nth-child(1) > div.profile-details > p:nth-child(1)";
   String EMAIL_IN_SENT_CONNECTION="div:nth-child(1) > div.profile-details > p:nth-child(3)";
   String EMAIL_IN_VIEW_SENT_CONNECTION_PROFILE="div.profile-info div:nth-child(2)  tr:nth-child(2) > td";
    //Job application
    String JOB_APPLICATION_ACTION_BUTTON="tr:nth-child(1) > td:nth-child(8) > div > button";
    String JOB_APPLICATION_FOLLOW_UP_BUTTON=".MuiPaper-rounded > ul > div > li:nth-child(1)";
    String JOB_APPLICATION_WITH_DRAW_APPLICATION=".MuiPaper-rounded > ul > div > li:nth-child(2)";
   //
    String MY_DOCUMENT_BUTTON="li:nth-child(2)  ul > li:nth-child(1) > a";
    String PERSONAL_DOCUMENT_VIEW_BUTTON="div:nth-child(1) > div:nth-child(1) > div.card-content-overlay a > button";
    String COMPANY_DOCUMENT_VIEW_BUTTON="div:nth-child(2) > div:nth-child(1) > div.card-content-overlay a > button";
    String GENERAL_DOCUMENT_VIEW_BUTTON="div:nth-child(3) > div:nth-child(1) > div.card-content-overlay a > button";
    String ON_BOARDING_DOCUMENTS_VIEW_BUTTON="div:nth-child(4) > div:nth-child(1) > div.card-content-overlay a > button";
    String MY_DOCUMENT_SHARED_WITH_VIEW_BUTTON="tr:nth-child(1) > td:nth-child(4) > button";
    String ACTION_BUTTON="tr:nth-child(1) div > button";
    String VIEW_DOCUMENT_BUTTON="#simple-menu-0 li:nth-child(1)";
    String ACTION_BUTTON_EDIT_REPLACE="tr:nth-child(3) div > button";
    String EDIT_REPLACE_BUTTON="#simple-menu-0 li:nth-child(2)";
   //Job Placement
    String JOB_PLACEMENT_BUTTON ="li:nth-child(6)  li:nth-child(4) > a";
    String TOTAL_PLACEMENT_CSS=" div:nth-child(1) > div > a > div > div.font-size-lg.opacity-8";
    String ACTIVE_PLACEMENT_CSS="div:nth-child(2) > div > a > div > div.font-size-lg.opacity-8";
    String ACTIVE_PLACEMENT_DUE_TO_END_CSS="div:nth-child(3) > div > a > div > div.font-size-md.opacity-8";
    String PLACEMENT_ENDED_CSS="div:nth-child(4) > div > a div.font-size-lg.opacity-8";
    String OUTSTANDING_IR_STATUS_CSS=" div:nth-child(5) > div > a > div > div.font-size-md.opacity-8";
    String OUTSTANDING_ON_BOARDING_DOCUMENT_CSS="div:nth-child(6) > div > a > div > div.font-size-md.opacity-8";





    @Before
    public void startTest() throws Exception {

        if (myProp.getProperty("platformname").toString().equals("WEB")) {
            WebConnector connector = new WebConnector();
            driver = connector.openBrowser();
        }
    }

    @After
    public void afterTest() {
        if (myProp.getProperty("platformname").toString().equals("WEB")) {
            if (driver != null) {
                driver.quit();
            }
        }
    }


    @Given("^\\[Main Page] Navigate to VoxPro Web app$")
    public void openWebUrl() {
        String webUrl = myProp.getProperty("weburl");
        driver.get(webUrl);
        driver.manage().window().maximize();
    }

    @Given("^\\[Main Page] Go to the Dashboard Page")
    public void navigateToDashboardPage() {
        driver.get("http://34.219.20.222/dashboard");
    }


    @Given("^\\[Main Page] Verify Login page should display as user isn't signin the application")
    public void verifyLoginPage() {
        assertLoginButton();
    }

    @Given("^\\[Main Page] Go to the Login page")
    public void navigateLoginPage() {
        getPageMainWeb().getSignLink().click();
    }

    @Given("^\\[Main Page] Verify Email and Password Field availability")
    public void assertEmailAndPassword() {
        Assert.assertTrue(getPageMainWeb().getEmail().isDisplayed());
        Assert.assertTrue(getPageMainWeb().getPassword().isDisplayed());
    }

    @Given("^\\[Main Page] Verify the Login Button availability")
    public void assertLoginButton() {
        Assert.assertTrue(getPageMainWeb().getSignInButton().isDisplayed());
    }

    @Given("^\\[Main Page] Click on Register Button")
    public void clickOnRegisterButton() {
        getPageMainWeb().clickOnElementUsingExecutor(registerButton);
    }

    @Given("^\\[Main Page] Verify the Email and Password edit-ability")
    public void emailPasswordEditAbility() {

    }

    @Given("^\\[Main Page] Verify the Login Button is click-ability")
    public void assertLoginButtonClickAbility() {
        Assert.assertTrue(getPageMainWeb().getSignInButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify the availability of view icon")
    public void assertViewIconDisplay() {
        Assert.assertTrue(getPageMainWeb().getViewPasswordButton().isDisplayed());
    }

    @Given("^\\[Main Page] Check the place holder message for email on login screen")
    public void assertEmailAndPasswordPlaceHolder() {
        Assert.assertTrue(getPageMainWeb().getEmailPlaceHolder().isDisplayed());
        Assert.assertTrue(getPageMainWeb().getPasswordPlaceHolder().isDisplayed());
    }

    @Given("^\\[Main Page] Verify the view icon is click-ability")
    public void assertViewButtonClickAbility() {
        Assert.assertTrue(getPageMainWeb().getViewPasswordButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify the Invalid Email Address error message")
    public void invalidEmailAddressErrorMessage() {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);

    }

    @Given("^\\[Main Page] Verify error message with invalid email address")
    public void invalidEmailAddressMessage() {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);

    }

    @Given("^\\[Main Page] Verify error message with invalid password")
    public void invalidPasswordErrorMessage() {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);

    }


    @Given("^\\[Main Page] Verify the Invalid Password error message")
    public void invalidPasswordMessage() {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
    }

    @Given("^\\[Main Page] verify the error message with whitespaces for Email field")
    public void emailWithWhiteSpaces() {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
    }

    @Given("^\\[Main Page] Verify the Password is in encrypted form")
    public void passwordInEncryptedForm() {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
    }

    @Given("^\\[Main Page] Verify keep me sign is clickable")
    public void assertKeepMeSignInIsClickable() {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);

    }

    @Given("^\\[Main Page] The user should be kept signed in for X mins")
    public void keptSignedInForXMins() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
        getPageMainWeb().getOTPField().sendKeys("000000");
        getPageMainWeb().clickOnElementUsingExecutor(verifyButton);
        Thread.sleep(15000);
    }

    @Given("^\\[Main Page] Verify that the user should be signed out after x minutes of inactivity")
    public void signedOutAfterXMins() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
        getPageMainWeb().getOTPField().sendKeys("000000");
        getPageMainWeb().clickOnElementUsingExecutor(verifyButton);
        Thread.sleep(15000);
    }

    @Given("^\\[Main Page] Verify user is redirected to OTP page")
    public void redirectToOTPPage() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
        getPageMainWeb().getOTPField().sendKeys("000000");
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] User click on Logout Button")
    public void clickOnLogOut() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(log_Out_Password);
        Thread.sleep(3000);

    }

    @Given("^\\[Main Page] Click on Back button")
    public void browserBackButton() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Press Enter Button from keyboard")
    public void enterButton() throws InterruptedException {
        getPageMainWeb().getSignInButton().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Press the Tab button multiple times")
    public void tabButton() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            getPageMainWeb().getViewPasswordButton().sendKeys(Keys.TAB);
            Thread.sleep(3000);

        }
    }

    @Given("^\\[Main Page] Incognito mode")
    public void incognitoMode() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    }


    @Given("^\\[Main Page] User click on Forward button")
    public void browserForwardButton() throws InterruptedException {
        driver.navigate().forward();
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] User should be redirected to the login screen")
    public void redirectToLoginScreen() throws InterruptedException {

    }

    @Given("^\\[Main Page] Enter Username and Password and Click SigIn Button")
    public void userLogin() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        getPageMainWeb().getPassword().sendKeys("Demo@1234");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
        getPageMainWeb().getOTPField().sendKeys("000000");
        getPageMainWeb().clickOnElementUsingExecutor(verifyButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify user is able to logIn successfully after Change password")
    public void userLoginAfterChangePassword() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
        getPageMainWeb().getOTPField().sendKeys("000000");
        getPageMainWeb().clickOnElementUsingExecutor(verifyButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Enter Email \"([^\"]*)\"$")
    public void enterEmailWithParam(String email) {
        getPageMainWeb().getEmail().sendKeys(email);
    }


    @Given("^\\[Main Page] User try with Invalid Login attempts \"([^\"]*)\"$")
    public void invalidLoginAttempts(int number) {
        for (int i = 0; i < number; i++) {
            getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        }
    }

    @Given("^\\[Main Page] verify user asked to enter captcha and try again or user should be blocked for a time period")
    public void assertCapcha() {
        Assert.assertTrue(Boolean.parseBoolean(capcha_CSS));
    }

    @Given("^\\[Main Page] verify user should redirected to forget Password")
    public void redirectToForgetPassword() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        getPageMainWeb().getPassword().sendKeys("Demo@12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(forgetPassword);
        Thread.sleep(3000);
    }


    @Given("^\\[Main Page] Enter Password \"([^\"]*)\"$")
    public void enterPasswordWithParam(String password) {
        getPageMainWeb().getPassword().sendKeys(password);
    }


    @Given("^\\[Main Page] click on signIn button multiple times")
    public void enterMultipleLoginButton() {

        for (int i = 0; i < 5; i++) {
            getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        }
    }


    @Given("^\\[Main Page] Invalid OTP")
    public void invalidOTP() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        getPageMainWeb().getPassword().sendKeys("Demo@1234");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
        getPageMainWeb().getOTPField().sendKeys("00000");
        getPageMainWeb().clickOnElementUsingExecutor(verifyButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Dash Board Login")
    public void DashBoard() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
        getPageMainWeb().getOTPField().sendKeys("000000");
        getPageMainWeb().clickOnElementUsingExecutor(verifyButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Keep me signIn Button is clickable")
    public void keepSignIn() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        getPageMainWeb().getPassword().sendKeys("Demo@1234");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(keepSignIn);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Valid email address with white space")
    public void ValidEmailWithSpace() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com      ");
        getPageMainWeb().getPassword().sendKeys("Demo@1234");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(keepSignIn);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Invalid Email")
    public void invalidEmailAddress() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubai@mailinator.com");
        getPageMainWeb().getPassword().sendKeys("Demo@1234");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(keepSignIn);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);

    }

    @Given("^\\[Main Page] Invalid Password")
    public void InvalidPassword() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        getPageMainWeb().getPassword().sendKeys("Dem@1234");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(keepSignIn);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Enable view icon")
    public void EnableViewIcon() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(passwordViewButton);
        Thread.sleep(3000);
        getPageMainWeb().getPassword().sendKeys("Demo@1234");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(keepSignIn);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Null value on Email and Password Field")
    public void NullValueInEmailAndPasswordField() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Whitespaces in email and password field")
    public void WhiteSpacesInEmailAndPasswordField() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("              ");
        getPageMainWeb().getPassword().sendKeys("         ");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(keepSignIn);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Validation invalid email address")
    public void ValidationInvalidEmailAddress() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(signInButtonCss);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Password Forgot")
    public void ForgotPassword() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        getPageMainWeb().getPassword().sendKeys("Demo@12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(forgetPassword);
        Thread.sleep(3000);
        getPageSignUpWeb().getEmailAddress().sendKeys("zubair@mailinator.com");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorClass(sendPassword);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Unregister email")
    public void UnregisterEmailAddress() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(forgetPassword);
        Thread.sleep(3000);
        getPageSignUpWeb().getEmailAddress().sendKeys("zubair@gmail.com");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorClass(sendPassword);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] return to home page button is clickable")
    public void ReturnToHomePage() throws InterruptedException {
        getPageMainWeb().getEmail().sendKeys("zubair@mailinator.com");
        getPageMainWeb().getPassword().sendKeys("Demo@12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(forgetPassword);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorClass(returnToHomePage);
        Thread.sleep(3000);
    }


    @Given("^\\[Main Page] Registration Flow For Agency")
    public void registrationAgency() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(agencyRegistrationButton);
        Thread.sleep(3000);
        getPageSignUpWeb().getEmailAddress().sendKeys("zubair@gmail.com");
        Thread.sleep(3000);
        getPageSignUpWeb().getPassword().sendKeys("Vista@123");
        Thread.sleep(3000);
        getPageSignUpWeb().getConfirmPassword().sendKeys("Vista@123");
        Thread.sleep(3000);
        getPageSignUpWeb().getFirstName().sendKeys("Zubair");
        Thread.sleep(3000);
        getPageSignUpWeb().getLastName().sendKeys("Alam");
        Thread.sleep(3000);
        getPageSignUpWeb().getCompanyName().sendKeys("Co-VenTech");
        Thread.sleep(3000);
        getPageSignUpWeb().getContactNumber().sendKeys("01234556778");
        Thread.sleep(3000);
        getPageSignUpWeb().getAddress().sendKeys("r-51");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorName(privacyPolicyButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorClass(CreateAccountButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Registration Flow For Candidate")
    public void registrationCandidate() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateRegistrationButton);
        Thread.sleep(3000);
        getPageSignUpWeb().getEmailAddress().sendKeys("zubair@gmail.com");
        Thread.sleep(3000);
        getPageSignUpWeb().getPassword().sendKeys("Vista@123");
        Thread.sleep(3000);
        getPageSignUpWeb().getConfirmPassword().sendKeys("Vista@123");
        Thread.sleep(3000);
        getPageSignUpWeb().getFirstName().sendKeys("Zubair");
        Thread.sleep(3000);
        getPageSignUpWeb().getLastName().sendKeys("Alam");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorName(privacyPolicyButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorClass(CreateAccountButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Account registration using google account")
    public void registrationCandidateUsingGoogleAccount() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateRegistrationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorClass(registerWithGoogleAccount);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Account registration using facebook")
    public void registrationCandidateUsingFacebookAccount() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateRegistrationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorClass(registerWithFacebookAccount);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Registration Flow For Company")
    public void registrationCompany() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(companyRegistrationButton);
        Thread.sleep(3000);
        getPageSignUpWeb().getEmailAddress().sendKeys("zubair@gmail.com");
        getPageSignUpWeb().getPassword().sendKeys("Vista123");
        getPageSignUpWeb().getConfirmPassword().sendKeys("Vista123");
        getPageSignUpWeb().getFirstName().sendKeys("Zubair");
        Thread.sleep(3000);
        getPageSignUpWeb().getLastName().sendKeys("Alam");
        getPageSignUpWeb().getCompanyName().sendKeys("Co-VenTech");
        getPageSignUpWeb().getContactNumber().sendKeys("01234556778");
        Thread.sleep(3000);
        getPageSignUpWeb().getAddress().sendKeys("r-51");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorName(privacyPolicyButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutorClass(CreateAccountButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Change Password \"([^\"]*)\"$")
    public void ChangePassword(String password) throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(resetPasswordButton);
        Thread.sleep(3000);
        getPageDashboardWeb().getNewPassword().sendKeys(password);
        Thread.sleep(3000);
        getPageDashboardWeb().getConfirmNewPassword().sendKeys(password);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(confirmPasswordButton);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] To verify user is able to enter new password \"([^\"]*)\"$")
    public void newPassword(String password) throws InterruptedException {
        getPageDashboardWeb().getNewPassword().sendKeys(password);
        Thread.sleep(3000);
        getPageDashboardWeb().getConfirmNewPassword().sendKeys(password);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] To verify user is able to change password")
    public void SetNewPassword() throws InterruptedException {
    getPageMainWeb().clickOnElementUsingExecutor(confirmPasswordButton);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] To verify user is able to view password")
    public void viewNewPassword() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(VIEW_NEW_PASSWORD_CSS);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(VIEW_CONFIRM_NEW_PASSWORD_CSS);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify candidate profile button is click-able")
    public void assertCandidateProfileButton() throws InterruptedException {
        getPageDashboardWeb().getCandidateProfile().isEnabled();
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] Verify reset password button is clickable")
    public void assertResetPassword() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageDashboardWeb().getResetPasswordButton().isEnabled();
        Thread.sleep(3000);
    }



    @Given("^\\[Main Page] Verify new password and confirm new password field availability")
    public void assertNewPassword() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(resetPasswordButton);
        Thread.sleep(3000);
        Assert.assertTrue(getPageDashboardWeb().getNewPassword().isDisplayed());
        Assert.assertTrue(getPageDashboardWeb().getConfirmNewPassword().isDisplayed());
    }


    @Given("^\\[Main Page] Password must contain a Special Character")
    public void PasswordContainSpecialChar() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(resetPasswordButton);
        Thread.sleep(3000);
        getPageDashboardWeb().getNewPassword().sendKeys("Demo01234");
        Thread.sleep(3000);
        getPageDashboardWeb().getConfirmNewPassword().sendKeys("Demo0123");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(confirmPasswordButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Miss match new password")
    public void MissMatchPassword() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(resetPasswordButton);
        Thread.sleep(3000);
        getPageDashboardWeb().getNewPassword().sendKeys("Demo@1234");
        Thread.sleep(3000);
        getPageDashboardWeb().getConfirmNewPassword().sendKeys("Dem@123");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(confirmPasswordButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Password must contain 8 character")
    public void PasswordSize() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(resetPasswordButton);
        Thread.sleep(3000);
        getPageDashboardWeb().getNewPassword().sendKeys("De@1234");
        Thread.sleep(3000);
        getPageDashboardWeb().getConfirmNewPassword().sendKeys("De@123");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(confirmPasswordButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] New password field is empty")
    public void EmptyPasswordField() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(resetPasswordButton);
        Thread.sleep(3000);
        getPageDashboardWeb().getNewPassword().sendKeys("");
        Thread.sleep(3000);
        getPageDashboardWeb().getConfirmNewPassword().sendKeys("Demo@123");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(confirmPasswordButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Confirm new password field is empty")
    public void EmptyConfirmPasswordField() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(resetPasswordButton);
        Thread.sleep(3000);
        getPageDashboardWeb().getNewPassword().sendKeys("Demo@1234");
        Thread.sleep(3000);
        getPageDashboardWeb().getConfirmNewPassword().sendKeys("");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(confirmPasswordButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Password must contain a upper case letter")
    public void PasswordWithOutUpperCaseLetter() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(resetPasswordButton);
        Thread.sleep(3000);
        getPageDashboardWeb().getNewPassword().sendKeys("demo@1234");
        Thread.sleep(3000);
        getPageDashboardWeb().getConfirmNewPassword().sendKeys("demo@1234");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(confirmPasswordButton);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] Security Setting")
    public void SecuritySetting() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(SECURITY_SETTING);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] To verify Change Password is clickable")
    public void assertChangePasswordButton() throws InterruptedException {
       Assert.assertTrue(getPageDashboardWeb().getChangePasswordButton().isEnabled());
        Thread.sleep(3000);
    }


    @Given("^\\[Main Page] Verify Security Setting is click-able")
    public void assertSecuritySetting() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(candidateProfileButton);
        Thread.sleep(3000);
        Assert.assertTrue(getPageDashboardWeb().getSecuritySetting().isEnabled());
    }

    @Given("^\\[Main Page] Verify change email address is clickable")
    public void assertChangeEmail() throws InterruptedException {
        Assert.assertTrue(getPageDashboardWeb().getChangeEmailButton().isEnabled());
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Change Email")
    public void ChangeEmail() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(CHANGE_EMAIL);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify Submit new email address is click able")
    public void assertNewEmailIsClickable() throws InterruptedException {
        Assert.assertTrue(getPageDashboardWeb().getChangeEmailButton().isEnabled());
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify new email address field availability")
    public void assertNewEmailField() throws InterruptedException {
        Assert.assertTrue(getPageDashboardWeb().getNewEmail().isDisplayed());
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Enter New Email \"([^\"]*)\"$")
    public void enterNewEmailWithParam(String email) {
        getPageDashboardWeb().getNewEmail().sendKeys(email);
    }

    @Given("^\\[Main Page] Change Password field")
    public void changePasswordField() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(CHANGE_PASSWORD);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] To verify set password button is click able")
    public void assertNewPasswordButton() throws InterruptedException {
        Assert.assertTrue(getPageDashboardWeb().getSetPasswordButton().isEnabled());
        Thread.sleep(3000);
    }



    @Given("^\\[Main Page] To verify new password field is available")
    public void assertNewPasswordField() throws InterruptedException {
        Assert.assertTrue(getPageDashboardWeb().getNewPassword().isDisplayed());
        Assert.assertTrue(getPageDashboardWeb().getSetPasswordButton().isDisplayed());
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Make your First Connection")
    public void MakeFirstConnection() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("Automation Engineer");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("Pakistan");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Search Consultant")
    public void SearchConsultant() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SEARCH_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(SEARCH_CONSULTANT);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("Automation Engineer");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("Pakistan");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Advanced search by using keyword\"([^\"]*)\"$")
    public void enterConsultantKeywordByPeram(String keyword) {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_KEYWORDS);
        getNotificationWeb().getConsultantKeywordText().sendKeys(keyword);
    }
    @Given("^\\[Main Page] Verify add keyword button availability in advanced search")
    public void assertConsultantKeywordButton() {
        Assert.assertTrue(getNotificationWeb().getConsultantKeywordButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify add keyword field in advanced available")
    public void assertConsultantKeywordField() {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_KEYWORDS);
        //Assert.assertTrue(getNotificationWeb().getConsultantKeywordText().isDisplayed());
    }
    @Given("^\\[Main Page] Verify add Name button availability in advanced search")
    public void assertConsultantNameButton() {
        Assert.assertTrue(getNotificationWeb().getConsultantNameButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify add Name field in advanced available")
    public void assertConsultantNameField() {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_NAME_BUTTON);
        //Assert.assertTrue(getNotificationWeb().getConsultantNameText().isDisplayed());
    }
    @Given("^\\[Main Page] Verify add Recruit industry button availability in advanced search")
    public void assertConsultantRecruitButton() {
        Assert.assertTrue(getNotificationWeb().getConsultantRecruitIndustriesButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify add recruit Industry field in advanced available")
    public void assertConsultantRecruitIndustryField() {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_RECRUITS_INDUSTRIES_BUTTON);
       // Assert.assertTrue(getNotificationWeb().getConsultantRecruitsIndustries().isDisplayed());
    }
    @Given("^\\[Main Page] Verify add Recruit location button availability in advanced search")
    public void assertConsultantRecruitLocationButton() {
        Assert.assertTrue(getNotificationWeb().getConsultantRecruitLocationButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify add recruit location field in advanced available")
    public void assertConsultantRecruitLocationField() {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_RECRUITS_LOCATION_BUTTON);
        //Assert.assertTrue(getNotificationWeb().getConsultantRecruitsLocation().isDisplayed());
    }
    @Given("^\\[Main Page] Verify add job title button availability in advanced search")
    public void assertConsultantJobTitleButton() {
        Assert.assertTrue(getNotificationWeb().getConsultantRecruitsJobTitle().isEnabled());
    }

    @Given("^\\[Main Page] Verify add job title field in advanced available")
    public void assertConsultantJobTitleField() {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_RECRUITS_FOR_JOB_TITLE_BUTTON);
        //Assert.assertTrue(getNotificationWeb().getConsultantRecruitsJobTitle().isDisplayed());
    }
    @Given("^\\[Main Page] Verify add job type button availability in advanced search")
    public void assertConsultantJobTypeButton() {
        Assert.assertTrue(getNotificationWeb().getConsultantRecruitJobTypeButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify add job type field in advanced search is available")
    public void assertConsultantJobTypeField() {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_RECRUITS_JOB_TYPE_BUTTON);
        //Assert.assertTrue(getNotificationWeb().getConsultantRecruitsJobType().isDisplayed());
    }
    @Given("^\\[Main Page] Verify add Specialities button availability in advanced search")
    public void assertConsultantSpecialitiesButton() {
        Assert.assertTrue(getNotificationWeb().getConsultantSpecialitiesButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify specialities type field in advanced search is available")
    public void assertConsultantSpecialitiesTypeField() {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_SPECIALITIES_BUTTON);
        //Assert.assertTrue(getNotificationWeb().getConsultantSpecialities().isDisplayed());
    }

    @Given("^\\[Main Page] Advanced search by using Name\"([^\"]*)\"$")
    public void enterConsultantNameByPeram(String keyword) {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_NAME_BUTTON);
        getNotificationWeb().getConsultantNameText().sendKeys(keyword);
    }
    @Given("^\\[Main Page] Advanced search by using Recruits industries\"([^\"]*)\"$")
    public void enterConsultantRecruitsIndustriesByPeram(String keyword) {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_RECRUITS_INDUSTRIES_BUTTON);
        getNotificationWeb().getConsultantRecruitsIndustries().sendKeys(keyword);
    }
    @Given("^\\[Main Page] Advanced search by using Location\"([^\"]*)\"$")
    public void enterConsultantRecruitsLocationByPeram(String keyword) {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_RECRUITS_LOCATION_BUTTON);
        getNotificationWeb().getConsultantRecruitsLocation().sendKeys(keyword);
    }
    @Given("^\\[Main Page] Advanced search by using Job title\"([^\"]*)\"$")
    public void enterConsultantRecruitsJobTitleByPeram(String keyword) {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_RECRUITS_FOR_JOB_TITLE_BUTTON);
        getNotificationWeb().getConsultantRecruitsJobTitle().sendKeys(keyword);
    }

    @Given("^\\[Main Page] Advanced search by using Job type\"([^\"]*)\"$")
    public void enterConsultantRecruitsJobTypeByPeram(String keyword) {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_RECRUITS_JOB_TYPE_BUTTON);
        getNotificationWeb().getConsultantRecruitsJobType().sendKeys(keyword);
    }

    @Given("^\\[Main Page] Advanced search by using Specialities\"([^\"]*)\"$")
    public void enterConsultantSpecialitiesByPeram(String keyword) {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_SPECIALITIES_BUTTON);
        getNotificationWeb().getConsultantSpecialities().sendKeys(keyword);
    }
    @Given("^\\[Main Page] Advanced search by using Has Open Jobs")
    public void enterConsultantHasOpenJobsByPeram() {
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_HAS_OPEN_JOBS_BUTTON);
        getPageMainWeb().clickOnElementUsingExecutor(CONSULTANT_HAS_OPEN_JOBS_TICK_CSS);
    }

    @Given("^\\[Main Page] Verify notification button is clickable")
    public void NotificationButtonIS() throws InterruptedException {
        Assert.assertTrue(getNotificationWeb().getNotificationButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify activity button is clickable")
    public void assertActivityButton() throws InterruptedException {
        Assert.assertTrue(getNotificationWeb().getTaskButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify task button is Clickable")
    public void assertTaskButton() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        Assert.assertTrue(getNotificationWeb().getTaskButton().isEnabled());
    }

    @Given("^\\[Main Page] verify make your first connection is clickable")
    public void assertMakeYourFirstConnection() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        Assert.assertTrue(getNotificationWeb().getMakeYourFirstConnection().isEnabled());
    }


    @Given("^\\[Main Page] User miss name field")
    public void ConsultantUserNameField() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("Automation Engineer");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("Pakistan");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify miss name field In Search Consultant")
    public void ConsultantNameFieldMissing() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("Automation Engineer");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("Pakistan");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }



    @Given("^\\[Main Page] User miss job title field")
    public void ConsultantJobTitle() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("Pakistan");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify if user miss job title field")
    public void ConsultantMissJobTitle() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("Pakistan");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }



    @Given("^\\[Main Page] User miss job location field")
    public void ConsultantJobLocation() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("Automation Engineer");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] Verify if user miss job location field")
    public void ConsultantMissJobLocation() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("Automation Engineer");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("12");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }



    @Given("^\\[Main Page] User miss no of job field")
    public void ConsultantNoOfJobField() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("Automation Engineer");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("Pakistan");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify if user miss no of job field")
    public void ConsultantMissNoOfJobField() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(makeYourFirstConnection);
        Thread.sleep(3000);
        getNotificationWeb().getNameField().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getJobTitle().sendKeys("Automation Engineer");
        Thread.sleep(3000);
        getNotificationWeb().getJobLocation().sendKeys("Pakistan");
        Thread.sleep(3000);
        getNotificationWeb().getNumberOfJobs().sendKeys("");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
        Thread.sleep(3000);
    }


    @Given("^\\[Main Page] Complete your profile")
    public void completeYourProfile() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(notificationButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(taskButton);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(COMPLETE_YOUR_PROFILE);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Edit Personal information")
    public void editPersonalInformationButton() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(Edit_Personal_Information_Button);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] Drop Downs")
    public void editDropDownPersonalInformationField() throws InterruptedException {
        WebElement dropDownEl = driver.findElement(By.cssSelector("css-2b097c-container"));
        Select select = new Select(dropDownEl);
        select.selectByIndex(1);
       // getNotificationWeb().getPronoun().sendKeys("He",Keys.ENTER);
        //getNotificationWeb().getPronoun().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement salutation = driver.findElement(By.cssSelector("css-1hwfws3"));
        Select selec = new Select(dropDownEl);
        selec.selectByIndex(1);
       //getNotificationWeb().getSalutationName().sendKeys("Mr",Keys.ENTER);
        //Thread.sleep(3000);
        //getPageMainWeb().clickOnElementUsingExecutorClass(COUNTRY_BUTTON);
        //Thread.sleep(3000);
        //getNotificationWeb().getCountry().sendKeys("Pakistan");
        //Thread.sleep(3000);
        //getNotificationWeb().getCountry().sendKeys(Keys.ENTER);
        //Thread.sleep(3000);
        //getNotificationWeb().getTownOrState().sendKeys("Sindh",Keys.ENTER);
        //Thread.sleep(3000);
        //getNotificationWeb().getCityName().sendKeys("Karachi",Keys.ENTER);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify user is able to edit personal information field")
    public void editPersonalInformationField() throws InterruptedException {
        Thread.sleep(3000);
        getNotificationWeb().getOtherEmail().sendKeys("zubair133@mailiniator.com");
        getNotificationWeb().getPhoneNumber().sendKeys("+92 315871718");
        Thread.sleep(3000);
        getNotificationWeb().getMobileNumber().sendKeys("021-31256980");
        getNotificationWeb().getProfileFirstName().sendKeys("Zubair");
        Thread.sleep(3000);
        getNotificationWeb().getProfileLastName().sendKeys("Alam");
        getNotificationWeb().getWebsitePortfolio().sendKeys("I am here to update my profile");
        Thread.sleep(3000);
        getNotificationWeb().getProfileHighlight().sendKeys("This profile is Automated");
        Thread.sleep(3000);
        getNotificationWeb().getLinkedInUrl().sendKeys("LinkedIn.com");
        Thread.sleep(3000);
        getNotificationWeb().getFacebook().sendKeys("Facebook.com");
        getNotificationWeb().getInstagramUrl().sendKeys("Instagram.com");
        Thread.sleep(3000);
        getNotificationWeb().getTwitterUrl().sendKeys("Twitter.com");
        Thread.sleep(3000);
        getNotificationWeb().getStreet().sendKeys("F-97");
        getNotificationWeb().getPostalCode().sendKeys("7430");
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Jobs Application")
    public void jobApplication() throws InterruptedException {
    getPageMainWeb().clickOnElementUsingExecutor(JOBS_PATHS);
    Thread.sleep(3000);
    getPageMainWeb().clickOnElementUsingExecutor(JOBS_APPLICATION_BUTTON);
    Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Jobs Placement")
    public void jobPlacement() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(JOBS_PATHS);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(JOB_PLACEMENT_BUTTON);
        Thread.sleep(3000);
    }


    @Given("^\\[Main Page] Verify the the list of job and count in applied job")
    public void jobApplicationList() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(APPLIED_CSS);
        Thread.sleep(3000);
        List <WebElement> ele=driver.findElements(By.cssSelector("tbody tr"));
        String Expected= String.valueOf(ele.size());
        String Actual=String.valueOf(driver.findElement(By.cssSelector("div:nth-child(1) > div > a text")).getText());
        Assert.assertEquals(Expected,Actual);
    }

    @Given("^\\[Main Page] Verify the the list of job and count in withdrawn job")
    public void withDrawJobApplicationList() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(UNSUCCESSFUL_CSS);
        Thread.sleep(3000);
        List <WebElement> ele=driver.findElements(By.cssSelector("tbody tr"));
        String Expected= String.valueOf(ele.size());
        String Actual=String.valueOf(driver.findElement(By.cssSelector("div:nth-child(2) > div > a text")).getText());
        Assert.assertEquals(Expected,Actual);
    }


    @Given("^\\[Main Page] Verify the the list of job and count in interviews")
    public void interviewsJobApplicationList() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(Interviews_CSS);
        Thread.sleep(3000);
        List <WebElement> ele=driver.findElements(By.cssSelector("tbody tr"));
        String Expected= String.valueOf(ele.size());
        String Actual=String.valueOf(driver.findElement(By.cssSelector("div:nth-child(4) > div > a text")).getText());
        Assert.assertEquals(Expected,Actual);
    }



    @Given("^\\[Main Page] Verify Follow up in job application is redirected to chat")
    public void jobApplicationApplied() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(JOB_APPLICATION_ACTION_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(JOB_APPLICATION_FOLLOW_UP_BUTTON);
        Thread.sleep(5000);
    }

    @Given("^\\[Main Page] Verify withdraw application remove job application from the list")
    public void withDrawApplication() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(ACTION_BUTTON_IN_APPLIED_JOB);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(JOB_APPLICATION_WITH_DRAW_APPLICATION);
        Thread.sleep(5000);
    }

    @Given("^\\[Main Page] Verify jobs field button is clickable")
    public void assertJobPath() throws InterruptedException {
        Assert.assertTrue(getJobApplicationWeb().getJobPath().isEnabled());
    }

    @Given("^\\[Main Page] Verify the list of jobs appear only contain selected job title")
    public void assertSearchJobTitle() throws InterruptedException {
        Assert.assertTrue(getJobApplicationWeb().getSearchJobTitle().isDisplayed());
    }

    @Given("^\\[Main Page] Verify the list of jobs appear only contain selected job location")
    public void assertSearchJobLocation() throws InterruptedException {
        Assert.assertTrue(getJobApplicationWeb().getSearchJobLocation().isDisplayed());
    }

    @Given("^\\[Main Page] Verify job application button is clickable")
    public void assertJobApplicationButton() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(JOBS_PATHS);
        Thread.sleep(3000);
        Assert.assertTrue(getJobApplicationWeb().getJobApplicationButton().isEnabled());
    }

    @Given("^\\[Main Page] Verify job placement button is clickable")
    public void assertJobPlacement() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(JOBS_PATHS);
        Thread.sleep(3000);
        Assert.assertTrue(getJobPlacementWeb().getJobPlacementButton().isEnabled());
    }



    @Given("^\\[Main Page] Verify job title and location field is editable")
    public void assertJobApplicationFieldEditablility() throws InterruptedException {
        Assert.assertFalse(getJobApplicationWeb().getJobTitleField().isDisplayed());
        Assert.assertFalse(getJobApplicationWeb().getJobLocationField().isDisplayed());
    }


    @Given("^\\[Main Page] Job title\"([^\"]*)\"$")
    public void jobApplicationTitle(String JobTitle) {
        getJobApplicationWeb().getJobTitleField().sendKeys(JobTitle);
    }

    @Given("^\\[Main Page] Job location\"([^\"]*)\"$")
    public void jobLocationTitle(String JobLocation) {
        getJobApplicationWeb().getJobLocationField().sendKeys(JobLocation);
      //  getJobApplicationWeb().getJobLocationField().sendKeys(Keys.ENTER);
    }

    @Given("^\\[Main Page] Job Status\"([^\"]*)\"$")
    public void jobStatus(String Job) throws InterruptedException {
        Thread.sleep(5000);
        getPageMainWeb().clickOnElementUsingExecutor(DROP_DOWN);
        Thread.sleep(3000);
        getJobApplicationWeb().getStatusField().sendKeys(Job);
        getJobApplicationWeb().getStatusField().sendKeys(Keys.ENTER);
    }
    @Given("^\\[Main page] search button")
    public void jobSearch() {
       getPageMainWeb().clickOnElementUsingExecutor(searchButton);
    }

    @Given("^\\[Main Page] Applied button is clickable")
    public void assertAppliedButton() {
        Assert.assertTrue(getJobApplicationWeb().getJobApplied().isEnabled());;
    }
    @Given("^\\[Main Page] Total Placement button is clickable")
    public void assertTotalPlacementButton() {
        Assert.assertTrue(getJobPlacementWeb().getJobPlacementButton().isEnabled());;
    }


    @Given("^\\[Main Page] Verify job applied button is functioning")
    public void jobApplied() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(APPLIED_CSS);
        Thread.sleep(3000);
        Assert.assertTrue(getJobApplicationWeb().getAppliedJobCheck().isDisplayed());
    }

    @Given("^\\[Main Page] Total Placement button is clickable")
    public void assertTotalPlacement() {
        Assert.assertTrue(getJobPlacementWeb().getJobPlacementButton().isEnabled());;
    }

    @Given("^\\[Main Page] Active placement in job placement is clickable")
    public void assertActiveJobPlacement() {
        Assert.assertTrue(getJobPlacementWeb().getActivePlacement().isEnabled());;
    }
    @Given("^\\[Main Page] Active placement due to end in job placement is clickable")
    public void assertActiveJobPlacementDueToEnd() {
        Assert.assertTrue(getJobPlacementWeb().getActivePlacementDueToEnd().isEnabled());;
    }

    @Given("^\\[Main Page] Placement ended in job placement is clickable")
    public void assertPlacementEnded() {
        Assert.assertTrue(getJobPlacementWeb().getPlacementEnded().isEnabled());;
    }

    @Given("^\\[Main Page] Outstanding IR35 in job placement is clickable")
    public void assertOutstandingIR() {
        Assert.assertTrue(getJobPlacementWeb().getOutstandingIr().isEnabled());;
    }

    @Given("^\\[Main Page] Outstanding On Boarding in job placement is clickable")
    public void assertOutstandingOnBoardingDocument() {
        Assert.assertTrue(getJobPlacementWeb().getOutstandingOnBoardingDocument().isEnabled());;
    }


    @Given("^\\[Main Page] Verify Outstanding On Boarding is functioning")
    public void outstandingOnBoardingDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(OUTSTANDING_ON_BOARDING_DOCUMENT_CSS);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify Outstanding IR35 is functioning")
    public void outstandingIr() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(OUTSTANDING_IR_STATUS_CSS);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify job Placement ended is functioning")
    public void placementEnded() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(PLACEMENT_ENDED_CSS);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify job Total Placement is functioning")
    public void totalPlacement() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(TOTAL_PLACEMENT_CSS);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify job Active Placement due to end is functioning")
    public void activePlacementDueToEnd() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(ACTIVE_PLACEMENT_DUE_TO_END_CSS);
        Thread.sleep(3000);
    }


    @Given("^\\[Main Page] Verify job Active Placement is functioning")
    public void activePlacement() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(ACTIVE_PLACEMENT_CSS);
        Thread.sleep(3000);
    }






    @Given("^\\[Main Page] Verify the Follow up action in applied job")
    public void followUpActionInJobApplied() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(APPLIED_CSS);

    }



    @Given("^\\[Main Page] To verify unsuccessful button is clickable")
    public void assertUnsuccesfulButton() {
        Assert.assertTrue(getJobApplicationWeb().getJobUnsuccessful().isEnabled());
    }

    @Given("^\\[Main Page] Verify job Unsuccessful button is functioning")
    public void jobApplicationUnsuccessfulButton() {
        getPageMainWeb().clickOnElementUsingExecutor(UNSUCCESSFUL_CSS);
    }

   @Given("^\\[Main Page] To verify Shortlisted button is clickable")
    public void assertShortlistedButton() {
        Assert.assertTrue(getJobApplicationWeb().getJobShortlisted().isEnabled());
    }

    @Given("^\\[Main Page] Verify job shortlisted button is functioning")
    public void jobApplicationShortlistedButton() {
        getPageMainWeb().clickOnElementUsingExecutor(Shortlisted_CSS);
    }

    @Given("^\\[Main Page] To verify Interview button is clickable")
    public void assertInterviewButton() {
        Assert.assertTrue(getJobApplicationWeb().getJobInterview().isEnabled());
    }

    @Given("^\\[Main Page] Verify job interview button is functioning")
    public void jobApplicationInterviewButton() {
        getPageMainWeb().clickOnElementUsingExecutor(Interviews_CSS);
    }

    @Given("^\\[Main Page] To verify Offer button is clickable")
    public void assertJobOfferButton() {
        Assert.assertTrue(getJobApplicationWeb().getJobOffer().isEnabled());
    }

    @Given("^\\[Main Page] To Verify job offer button is functioning")
    public void jobApplicationJobOfferButton() {
        getPageMainWeb().clickOnElementUsingExecutor(Offers_CSS);
    }

    @Given("^\\[Main Page] Job placement button is clickable")
    public void assertJobPlacementButton() {
        Assert.assertTrue(getJobApplicationWeb().getJobPlacement().isEnabled());
    }

    @Given("^\\[Main Page] Verify job placement button is functioning")
    public void jobApplicationJobPlacementButton() {
        getPageMainWeb().clickOnElementUsingExecutor(Placement_CSS);
    }

    @Given("^\\[Main Page] Search Companies")
    public void SearchCompanies() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SEARCH_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(SEARCH_COMPANIES);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Search Agencies")
    public void SearchAgency() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SEARCH_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(SEARCH_AGENCY);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Search company name \"([^\"]*)\"$")
    public void enterCompanyName(String name) throws InterruptedException {
      getSearchCompanyWeb().getNameField().sendKeys(name);
      Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Search Company Industries \"([^\"]*)\"$")
    public void enterCompanyIndustry(String industry) {
      getSearchCompanyWeb().getCompanyIndustry().sendKeys(industry);
    }

    @Given("^\\[Main Page] Search Company Location \"([^\"]*)\"$")
    public void enterCompanyLocation(String industry) throws InterruptedException {
        getSearchCompanyWeb().getCompanyLocation().sendKeys(industry);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Number of Jobs \"([^\"]*)\"$")
    public void enterCompanyNoOfJobs(String no) {
        getSearchCompanyWeb().getNumberOfJobs().sendKeys(no);

    }

    @Given("^\\[Main Page] Search for companies")
    public void enterCompanyNoOfJobs() {
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
    }

    @Given("^\\[Main Page] Search for Agencies")
    public void enterCompanyNoOfJobsInAgency() {
        getPageMainWeb().clickOnElementUsingExecutor(searchButton);
    }

    @Given("^\\[Main Page] Go to IR35")
    public void ir35() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(IR_BUTTON);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Go to Connections")
    public void connectionsButton() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(CONNECTIONS_BUTTON);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify view icon in recent connection")
    public void RecentConnections() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
    }

    @Given("^\\[Main Page] Verify user is able to send cv to his recent connection")
    public void RecentConnectionsCvSend() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTION_MORE_BUTTON);
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTION_SEND_CV);
        Assert.assertTrue(getConnectionsWeb().getCv().isDisplayed());
        Thread.sleep(5000);
    }

    @Given("^\\[Main Page] Verify profile contain same email address as shown in recent connection")
    public void emailCheckOnProfile() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
       String Expected= String.valueOf(driver.findElement(By.cssSelector(EMAIL_RECENT_CONNECTION)).getText());
       getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
        String Actual=String.valueOf(driver.findElement(By.cssSelector(EMAIL_PROFILE)).getText());
        Assert.assertEquals(Expected,Actual);
    }

    @Given("^\\[Main Page] Verify same user is redirected to right profile in")
    public void profileName() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        String Expected= String.valueOf(driver.findElement(By.cssSelector(PROFILE_NAME_IN_RECENT_CONNECTION)).getText());
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
        String Actual=String.valueOf(driver.findElement(By.cssSelector(PROFILE_NAME_IN_PROFILE)).getText());
        Assert.assertEquals(Expected,Actual);
    }

    @Given("^\\[Main Page] Verify telephone number is present in recent connection profile")
    public void contactNumberAssertion() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
        Assert.assertTrue(getConnectionsWeb().getTelephoneContactInRecentConnectionProfile().isDisplayed());
    }

    @Given("^\\[Main Page] Verify profile name in sent connection and view profile")
    public void profileNameSentConnection() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        String Expected= String.valueOf(driver.findElement(By.cssSelector(PROFILE_NAME_IN_SENT_CONNECTION)).getText());
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
        String Actual=String.valueOf(driver.findElement(By.cssSelector(PROFILE_NAME_IN_VIEW_SENT_CONNECTION)).getText());
        Assert.assertEquals(Expected,Actual);
    }

    @Given("^\\[Main Page] Verify profile contain same email address as shown in sent connection")
    public void profileEmailSentConnection() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        String Expected= String.valueOf(driver.findElement(By.cssSelector(EMAIL_IN_SENT_CONNECTION)).getText());
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
        String Actual=String.valueOf(driver.findElement(By.cssSelector(EMAIL_IN_VIEW_SENT_CONNECTION_PROFILE)).getText());
        Assert.assertEquals(Expected,Actual);
    }

    @Given("^\\[Main Page] Verify telephone number is present in sent connection profile")
    public void telephoneNumberInSentConnection() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(3000);
        Assert.assertTrue(getConnectionsWeb().getTelephoneContactInSentConnectionProfile().isDisplayed());

    }

    @Given("^\\[Main Page] Verify Mobile number is present in recent connection profile")
    public void contactMobileNumberAssertion() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
        Assert.assertTrue(getConnectionsWeb().getMobileContactInRecentConnectionProfile().isDisplayed());
    }

    @Given("^\\[Main Page] Verify message button is redirected to chat in recent connections")
    public void RecentConnectionsMessage() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(5000);
        getPageMainWeb().clickOnElementUsingExecutor(MESSAGE_BUTTON_RECENT_CONNECTION);
        Thread.sleep(5000);
    }

    @Given("^\\[Main Page] Verify chat icon in recent connections")
    public void RecentConnectionsChat() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(RECENT_CONNECTIONS_CHAT_BUTTON);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify pending connections is visible")
    public void pendingConnections() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(PENDING_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify sent connections is visible")
    public void sentConnections() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify view icon in sent connections is redirected to profile page")
    public void sentConnectionsView() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_VIEW_BUTTON);
    }

    @Given("^\\[Main Page] Verify user is able to withdraw after sent connections request")
    public void withDrawPendingConnections() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_BUTTON);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(SENT_CONNECTIONS_VIEW_BUTTON);
        Thread.sleep(7000);
        getPageMainWeb().clickOnElementUsingExecutor(PENDING_CONNECTION_IN_SENT_CONNECTION);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(WITH_DRAW_CONNECTION_BUTTON_IN_SENT_CONNECTION);
        Thread.sleep(7000);
    }



    @Given("^\\[Main Page] Go to the IR35 New")
    public void newIR35() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(IR_NEW_BUTTON);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify New IR is redirected to new IR page")
    public void assertNewIrPageVisibility() throws InterruptedException {
       Assert.assertTrue(getIr35WebWeb().getIRPage().isDisplayed());
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify Submitted Determination & Due today present on IR history page")
    public void assertHistoryPageVisibility() throws InterruptedException {
        Assert.assertTrue(getIr35WebWeb().getHistoryTotalIrSubmitted().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getHistoryIrDetermination().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getTotalIrDueToday().isDisplayed());
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify all titles is present on IR History Page")
    public void assertIrHistoryTitle() throws InterruptedException {
        Assert.assertTrue(getIr35WebWeb().getHistoryPlacementTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getHistoryRequesterTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getHistoryRoleTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getHistoryDateSubmitted().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getHistoryStageTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getHistoryDueDateTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getHistoryDocument().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getHistoryStatusCertificate().isDisplayed());
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify Submitted Determination & Due today present on IR Queries page")
    public void assertQueriesHeaderVisibility() throws InterruptedException {
        Assert.assertTrue(getIr35WebWeb().getQueriesTotalIrPending().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getQueriesResolved().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getQueriesResponseDueDay().isDisplayed());
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Verify all titles is present on IR Queries Page")
    public void assertIrQueriesTitle() throws InterruptedException {
        Assert.assertTrue(getIr35WebWeb().getPlacementTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getQueriesRequesterTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getQueriesRoleTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getQueriesDueDateTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getQueriesDateQuery().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getQueriesStageQueryTitle().isDisplayed());
        Assert.assertTrue(getIr35WebWeb().getQueriesResponseTitle().isDisplayed());
    }





    @Given("^\\[Main Page] Go to the IR35 History")
    public void ir35History() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(IR_HISTORY_BUTTON);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Go to the IR35 Queries")
    public void ir35Queries() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(IR_QUERIES_BUTTON);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Go to the Request for information")
    public void requestForInformation() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(REQUEST_FOR_INFORMATION);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Go to New Request")
    public void newRequestForInformation() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(NEW_REQUEST_FOR_INFORMATION);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Go to the Request History")
    public void requestForInformationHistory() throws InterruptedException
    {
        getPageMainWeb().clickOnElementUsingExecutor(HISTORY_REQUEST_FOR_INFORMATION);
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Job search")
    public void JobSearch() throws InterruptedException
    {
        getPageMainWeb().clickOnElementUsingExecutor(JOBS_PATHS);
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(SEARCH_JOBS);
        Thread.sleep(3000);
        getJobSearchWeb().getJobSearchWhat().sendKeys("angular");
        getJobSearchWeb().getJobSearchWhere().sendKeys("london");
        getPageMainWeb().clickOnElementUsingExecutor(SEARCH_JOBS_SEARCH_BUTTON);
        Thread.sleep(3000);
    }
    @Given("^\\[Main Page] To verify Salary Range filter is working")
    public void SalaryRangeFilterInJobSearch() throws InterruptedException {
        Select SalaryFrom=new Select(driver.findElement(By.cssSelector(SALARY_RANGE_START_FILTER_NAME)));
        SalaryFrom.selectByVisibleText("30,000");
        Thread.sleep(3000);
        Select SalaryTo=new Select(driver.findElement(By.cssSelector(SALARY_RANGE_END_FILTER_NAME)));
        SalaryTo.selectByVisibleText("50,000");
        Thread.sleep(30000);
    }

    @Given("^\\[Main page] To verify Distance filter is working")
    public void DistanceFilterInJobSearch() throws InterruptedException {
        Select Distance=new Select(driver.findElement(By.cssSelector(DISTANCE_FILTER)));
        Distance.selectByVisibleText("20 miles");
        Thread.sleep(3000);

    }

    @Given("^\\[Main Page] To verify Date posted filter is working")
    public void DatePostedFilterInJobSearch() throws InterruptedException {
        Select DatePosted=new Select(driver.findElement(By.name(DATE_POSTED_FILTER_NAME)));
        DatePosted.selectByVisibleText("Last Week");
        Thread.sleep(3000);

    }

    @Given("^\\[Main Page] To verify Job type filter is working")
    public void JobTypeFilterInJobSearch() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(JOB_TYPE_IN_SEARCH_JOB);
        Thread.sleep(10000);
    }

    @Given("^\\[Main Page] To verify Specialisms filter is working")
    public void SpecailismsFilterInJobSearch() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(SPECIALISMS_SEARCH_JOB_FILTER);
        Thread.sleep(10000);
    }

    @Given("^\\[Main Page] To verify Related jobs filter is working")
    public void RelatedJobFilterInJobSearch() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(RELATED_JOBS_SEARCH_JOB_FILTER);
        Thread.sleep(10000);
    }


    @Given("^\\[Main Page] To verify the jobs listed on the page is required one")
    public void JobPages() throws InterruptedException {
//        String expected="Angular";
//       for(int i=1;i<6;i++){
//       String pages= driver.findElement(By.cssSelector(":nth-child("+i+") > div > div > div >.py-2 > div > h2));
//       //Assert.assertEquals("Angular","pages");
//           Assert.assertEquals(expected,pages);
//           System.out.println("assertion passed");
//           Thread.sleep(1000);
        List<WebElement> listBoxItems = driver.findElements(By.className("py-2"));
        boolean flag = false;
        for(WebElement item : listBoxItems) {
            Assert.assertEquals("Angular", item);
            System.out.println("Angular is found on job search");
            // break;

        }
       }
    @Given("^\\[Main Page] Click on OnBoarding documents")
    public void OnBoardingDocuments() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(ONBOARD_DOCUMENT);
    }

    @Given("^\\[Main Page] Click On My Documents")
    public void myDocuments() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(MY_DOCUMENT_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Click on Edit and replace document in personal document")
    public void editReplacePersonalDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(ACTION_BUTTON_EDIT_REPLACE);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(EDIT_REPLACE_BUTTON);
    }


    @Given("^\\[Main Page] Verify document shared view in personal document")
    public void sharedViewPersonalDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(PERSONAL_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(MY_DOCUMENT_SHARED_WITH_VIEW_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Verify document shared view in company document")
    public void sharedViewCompanyDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(COMPANY_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(MY_DOCUMENT_SHARED_WITH_VIEW_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Verify document shared view in general document")
    public void sharedViewGeneralDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(GENERAL_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(MY_DOCUMENT_SHARED_WITH_VIEW_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Verify document shared view in On Boarding document")
    public void sharedViewOnBoardingDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(ON_BOARDING_DOCUMENTS_VIEW_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(MY_DOCUMENT_SHARED_WITH_VIEW_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Verify view uploaded document in personal document")
    public void viewUploadedDocumentInPersonalDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(PERSONAL_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(ACTION_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(VIEW_DOCUMENT_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Verify view uploaded document in company document")
    public void viewUploadedDocumentInCompanyDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(COMPANY_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(ACTION_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(VIEW_DOCUMENT_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Verify view uploaded document in General document")
    public void viewUploadedDocumentInGeneralDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(GENERAL_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(ACTION_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(VIEW_DOCUMENT_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Verify view uploaded document in On Boarding document")
    public void viewUploadedDocumentInOnBoardingDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(ON_BOARDING_DOCUMENTS_VIEW_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(ACTION_BUTTON);
        Thread.sleep(2000);
        getPageMainWeb().clickOnElementUsingExecutor(VIEW_DOCUMENT_BUTTON);
        Thread.sleep(2000);
    }

    @Given("^\\[Main Page] Verify the list of upload document is same and seen on personal document")
    public void upLoadPersonalDocumentCount() throws InterruptedException {
        String Total=String.valueOf(driver.findElement(By.cssSelector("div:nth-child(1) > div:nth-child(1) > div > div.mb-1.mt-2.text-black")).getText());
        String Actual= String.valueOf(Total.charAt(0));
        getPageMainWeb().clickOnElementUsingExecutor(PERSONAL_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(3000);
        List <WebElement> ele=driver.findElements(By.cssSelector("tbody > tr"));
        String Expected= String.valueOf(ele.size()/2);
        Assert.assertEquals(Expected,Actual);
    }

    @Given("^\\[Main Page] Verify company document is count correct")
    public void companyDocumentCount() throws InterruptedException {
        String Total=String.valueOf(driver.findElement(By.cssSelector("div:nth-child(2) > div:nth-child(1) > div > div.mb-1.mt-2.text-black")).getText());
        String Actual= String.valueOf(Total.charAt(0));
        getPageMainWeb().clickOnElementUsingExecutor(COMPANY_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(3000);
        List <WebElement> ele=driver.findElements(By.cssSelector("tbody > tr"));
        String Expected= String.valueOf(ele.size()/2);
        Assert.assertEquals(Expected,Actual);
    }

    @Given("^\\[Main Page] Verify general document count is correct")
    public void generalDocumentCount() throws InterruptedException {
        String Total=String.valueOf(driver.findElement(By.cssSelector("div:nth-child(3) > div:nth-child(1) > div > div.mb-1.mt-2.text-black")).getText());
        String Actual= String.valueOf(Total.charAt(0));
        getPageMainWeb().clickOnElementUsingExecutor(GENERAL_DOCUMENT_VIEW_BUTTON);
        Thread.sleep(3000);
        List <WebElement> ele=driver.findElements(By.cssSelector("tbody > tr"));
        String Expected= String.valueOf(ele.size()/2);
        Assert.assertEquals(Expected,Actual);
    }

    @Given("^\\[Main Page] Verify onboard document count is correct")
    public void onBoardingDocumentCount() throws InterruptedException {
        String Total=String.valueOf(driver.findElement(By.cssSelector("div:nth-child(4) > div:nth-child(1) > div > div.mb-1.mt-2.text-black")).getText());
        String Actual= String.valueOf(Total.charAt(0));
        getPageMainWeb().clickOnElementUsingExecutor(ON_BOARDING_DOCUMENTS_VIEW_BUTTON);
        Thread.sleep(3000);
        List <WebElement> ele=driver.findElements(By.cssSelector("tbody > tr"));
        String Expected= String.valueOf(ele.size()/2);
        Assert.assertEquals(Expected,Actual);
    }


    @Given("^\\[Main Page] Click on Upload documents")
    public void upLoadDocumentsButton() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(UPLOAD_DOCUMENT);
        Thread.sleep(1000);
    }
    @Given("^\\[Main Page] Browse file to upload documents")
    public void browseFile() throws InterruptedException {
        getPageMainWeb().getbrowseFile().sendKeys("C:\\Users\\user\\Desktop\\voxpro_web_automation\\Asset\\voxpro.docx");
        Thread.sleep(1000);

    }

    @Given("^\\[Main Page] Enter category name")
    public void category() throws InterruptedException {
        Select Category=new Select(driver.findElement(By.name(CATEGORY_NAME)));
        Category.selectByVisibleText("Personal");
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Enter type of document to add")
    public void documentType() throws InterruptedException {
        Select Category=new Select(driver.findElement(By.name(CATEGORY_NAME)));
        Category.selectByVisibleText("Personal");
        Thread.sleep(3000);
        Select Doc=new Select(driver.findElement(By.name(SELECT_DOC_NAME)));
        Doc.selectByVisibleText("CV");
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Enter Expiration")
    public void expirationOfUploadedDocument() throws InterruptedException {
        Select Expiration=new Select(driver.findElement(By.cssSelector(EXPIRATION)));
        Expiration.selectByVisibleText("No Expiration");
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Select notify my email")
    public void emailNotificationOfUploadedDocument() throws InterruptedException {
        Select Expiration=new Select(driver.findElement(By.cssSelector(EXPIRATION)));
        Expiration.selectByVisibleText("No Expiration");
        Thread.sleep(3000);
    }

    @Given("^\\[Main Page] Enter privacy type")
    public void privacyTypeOfUploadedDocument() throws InterruptedException {
        Select Privacy=new Select(driver.findElement(By.cssSelector(PRIVACY)));
        Privacy.selectByVisibleText("No");
        Thread.sleep(3000);
    }



    @Given("^\\[Main Page] Upload a new document")
    public void UploadDocument() throws InterruptedException {
        getPageMainWeb().clickOnElementUsingExecutor(UPLOAD_DOCUMENT);
        Thread.sleep(10000);
        getPageMainWeb().getbrowseFile().sendKeys("C:\\Users\\user\\Desktop\\voxpro_web_automation\\Asset\\voxpro.docx");
        Thread.sleep(10000);
        Select Category=new Select(driver.findElement(By.name(CATEGORY_NAME)));
        Category.selectByVisibleText("Personal");
        Thread.sleep(3000);
        Select Doc=new Select(driver.findElement(By.name(SELECT_DOC_NAME)));
        Doc.selectByVisibleText("CV");
        Thread.sleep(3000);
        Select Expiration=new Select(driver.findElement(By.cssSelector(EXPIRATION)));
        Expiration.selectByVisibleText("No Expiration");
        Thread.sleep(3000);
        Select NotifyByEmail=new Select(driver.findElement(By.cssSelector(NOTIFY_BY_EMAIL)));
        NotifyByEmail.selectByVisibleText("No");
        Thread.sleep(3000);
        Select Privacy=new Select(driver.findElement(By.cssSelector(PRIVACY)));
        Privacy.selectByVisibleText("No");
        Thread.sleep(3000);
        getPageMainWeb().clickOnElementUsingExecutor(UPLOAD_BUTTON);
        Thread.sleep(3000);
    }


}











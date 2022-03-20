package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageMainWeb {


    private String SIGN_IN_LINK_CSS = "#top-bar__action > div > div.top-bar__auth-btns > a.btn-first";
    private String EMAIL_ID = "textfield-email";
    private String PASSWORD_ID ="textfield-password";
    private String SIGN_IN_BUTTON_CSS ="form > div > button";
    private String VIEW_PASSWORD_CSS ="span.MuiIconButton-label";
    private String OTP_NAME ="otp";
    private String VERIFY_BUTTON_CSS = "form button > span:nth-child(2)";
    private String Keep_Me_SIGN_IN_BUTTON_CSS= "root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > div:nth-child(3) > form > div.d-flex.justify-content-between.align-items-center.font-size-md > label > span.MuiButtonBase-root.MuiIconButton-root.jss206.MuiCheckbox-root.MuiCheckbox-colorPrimary.MuiIconButton-colorPrimary > span.MuiIconButton-label";
    private String FORGET_PASSWORD_BUTTON_CSS = "#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > div:nth-child(3) > div:nth-child(2) > a";
    private String ACCOUNT_REGISTRATION_CSS="#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > div:nth-child(3) > div:nth-child(3) > a";
    private  String CANDIDATE_REGISTRATION_CSS="div:nth-child(1) > div > div > div > div > div.font-size-sm.text-black.px-2.opacity-7 > a > svg > path";
    private String EMAIL_ADDRESS_ID="#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > form > div:nth-child(1) > div.MuiFormControl-root.MuiTextField-root.MuiFormControl-fullWidth > div > input";
   //private String PASSWORD_ID="#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > form > div:nth-child(2) > div.MuiFormControl-root.MuiTextField-root.MuiFormControl-fullWidth > div > input";
   private String CONFIRMATION_PASSWORD_ID="#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > form > div:nth-child(3) > div.MuiFormControl-root.MuiTextField-root.MuiFormControl-fullWidth > div > input";
   private String FIRST_NAME_ID="#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > form > div:nth-child(4) > div > div:nth-child(1) > div.MuiFormControl-root.MuiTextField-root.MuiFormControl-fullWidth > div > input";
  private String LAST_NAME_ID="#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > form > div:nth-child(4) > div > div:nth-child(2) > div.MuiFormControl-root.MuiTextField-root.MuiFormControl-fullWidth > div > input";
  private String PRIVACY_POLICY="#root > div:nth-child(2) > div > div > div > div > div > div > div > div.MuiGrid-root.d-flex.align-items-center.MuiGrid-item.MuiGrid-grid-lg-7.MuiGrid-grid-xl-6 > div > div > form > div.d-flex.justify-content-between.align-items-center.font-size-md > label > span.MuiButtonBase-root.MuiIconButton-root.jss186.MuiCheckbox-root.MuiCheckbox-colorPrimary.jss187.Mui-checked.MuiIconButton-colorPrimary > span.MuiIconButton-label > input";
  private String CREATE_ACCOUNT_CSS="form > button ";
  private String REGISTER_BUTTON_CSS = "div:nth-child(3) > a";
  private String EMAIL_PLACEHOLDER="textfield-email-label";
  private String PASSWORD_PLACEHOLDER="textfield-password-label";
  private  String BROWSE_FILE="input[type=file]";
  private String DROP_DOWN=".css-1wy0on6 svg path";

  public PageMainWeb(Page page) {}


        public WebElement getSignLink () {
            return WebConnector.driver.findElement(By.cssSelector(SIGN_IN_LINK_CSS));
        }

        public WebElement getEmail() {
            return WebConnector.driver.findElement(By.id(EMAIL_ID));
        }

        public WebElement getPassword () {
            return WebConnector.driver.findElement(By.id(PASSWORD_ID));
        }

        public WebElement getSignInButton () {
            return WebConnector.driver.findElement(By.cssSelector(SIGN_IN_BUTTON_CSS));
        }


    public WebElement getViewPasswordButton () {
        return WebConnector.driver.findElement(By.cssSelector(VIEW_PASSWORD_CSS));
    }

        public WebElement getKeepMeSignInButton () {
           return WebConnector.driver.findElement(By.className(Keep_Me_SIGN_IN_BUTTON_CSS));
        }
    public WebElement getForGetButton () {
        return WebConnector.driver.findElement(By.className(FORGET_PASSWORD_BUTTON_CSS));
    }
    public WebElement getbrowseFile() {
        return WebConnector.driver.findElement(By.cssSelector(BROWSE_FILE));
    }
    public WebElement getAccountRegistration () {
        return WebConnector.driver.findElement(By.className(ACCOUNT_REGISTRATION_CSS));
    }
    public WebElement getCandidateRegistration () {
        return WebConnector.driver.findElement(By.className(CANDIDATE_REGISTRATION_CSS));
    }
    public WebElement getCandidateEmailAddress () {
        return WebConnector.driver.findElement(By.className(EMAIL_ADDRESS_ID));
    }
    public WebElement getCandidatePassword() {
        return WebConnector.driver.findElement(By.className(PASSWORD_ID));
    }
    public WebElement getConfirmPassword() {
        return WebConnector.driver.findElement(By.className(CONFIRMATION_PASSWORD_ID));
    }
    public WebElement getFirstName() {
        return WebConnector.driver.findElement(By.className(FIRST_NAME_ID));
    }
    public WebElement getLastName() {
        return WebConnector.driver.findElement(By.className(LAST_NAME_ID));
    }
    public WebElement getCandidatePrivacyPolicy() {
        return WebConnector.driver.findElement(By.className(PRIVACY_POLICY));
    }
    public WebElement getCreateCandidateAccount() {
        return WebConnector.driver.findElement(By.cssSelector(CREATE_ACCOUNT_CSS));
    }

    public WebElement getRegisterButton() {
        return WebConnector.driver.findElement(By.cssSelector(REGISTER_BUTTON_CSS));
    }
    public WebElement getEmailPlaceHolder() {
        return WebConnector.driver.findElement(By.id(EMAIL_PLACEHOLDER));
    }
    public WebElement getPasswordPlaceHolder() {
        return WebConnector.driver.findElement(By.id(PASSWORD_PLACEHOLDER));
    }
    public WebElement getOTPField() { return  WebConnector.driver.findElement(By.name(OTP_NAME)); }
    public WebElement testTest() {
        return WebConnector.driver.findElement(By.cssSelector(DROP_DOWN));
    }


    public void clickOnElementUsingExecutor(String cssLocator) {
        WebElement element = WebConnector.driver.findElement(By.cssSelector(cssLocator));
        JavascriptExecutor executor = (JavascriptExecutor) WebConnector.driver;
        executor.executeScript("arguments[0].click()", element);
    }
    public void clickOnElementUsingExecutorName(String cssLocator) {
        WebElement element = WebConnector.driver.findElement(By.name(cssLocator));
        JavascriptExecutor executor = (JavascriptExecutor) WebConnector.driver;
        executor.executeScript("arguments[0].click()", element);
    }
    public void clickOnElementUsingExecutorClass(String cssLocator) {
        WebElement element = WebConnector.driver.findElement(By.className(cssLocator));
        JavascriptExecutor executor = (JavascriptExecutor) WebConnector.driver;
        executor.executeScript("arguments[0].click()", element);
    }







}

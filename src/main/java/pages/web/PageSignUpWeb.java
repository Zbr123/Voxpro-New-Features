package pages.web;

import core.utils.BrowerConfig.WebConnector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageSignUpWeb {

   private String REGISTRATION_CATEGORY_CSS = ".px-2.opacity-7 > a > svg > path";
   private String EMAIL_ADDRESS_NAME="email";
   private String PASSWORD_NAME="password";
   private String CONFIRM_PASSWORD_NAME="confirm_password";
   private String FIRST_NAME="first_name";
   private String LAST_NAME="last_name";
   private String CONTACT_NUMBER_NAME="contact_number";
   private String COMPANY_NAME="company_name";
   private String NAME_NAME="company_name";
   private String ADDRESS_NAME="address";
   private String COUNTRY_REGISTRATION_NAME="xyz";
   private String ACCEPT_PRIVACY_POLICY_NAME="policy";

   public PageSignUpWeb(Page page) {}


    public WebElement getRegistrationCategoryCandidate() {
       return WebConnector.driver.findElements(By.cssSelector(REGISTRATION_CATEGORY_CSS)).get(1);
    }

    public WebElement getRegistrationCategoryAgency() {
        return WebConnector.driver.findElements(By.cssSelector(REGISTRATION_CATEGORY_CSS)).get(2);
    }

    public WebElement getRegistrationCategoryCompany() {
        return WebConnector.driver.findElements(By.cssSelector(REGISTRATION_CATEGORY_CSS)).get(3);
    }

       public WebElement getEmailAddress() {
        return WebConnector.driver.findElement(By.name(EMAIL_ADDRESS_NAME));
    }

        public WebElement getPassword () {
            return WebConnector.driver.findElement(By.name(PASSWORD_NAME));
        }

        public WebElement getConfirmPassword () {
            return WebConnector.driver.findElement(By.name(CONFIRM_PASSWORD_NAME));
        }

        public WebElement getFirstName () {
           return WebConnector.driver.findElement(By.name(FIRST_NAME));
        }
        public WebElement getLastName () {
        return WebConnector.driver.findElement(By.name(LAST_NAME));
        }
        public WebElement getCompanyName() {
        return WebConnector.driver.findElement(By.name(COMPANY_NAME));
        }
        public WebElement getContactNumber () {
        return WebConnector.driver.findElement(By.name(CONTACT_NUMBER_NAME));
       }
       public WebElement getName () {
       return WebConnector.driver.findElement(By.name(NAME_NAME));
       }
       public WebElement getAddress() {
       return WebConnector.driver.findElement(By.name(ADDRESS_NAME));
       }
       public WebElement getCountryOfRegistration() {
        return WebConnector.driver.findElement(By.name(COUNTRY_REGISTRATION_NAME));
       }
       public WebElement getPrivacyPolicyButton() {
       return WebConnector.driver.findElement(By.name(ACCEPT_PRIVACY_POLICY_NAME));
       }


}

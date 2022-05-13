package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    //click On "Open Account" Tab
    @FindBy(xpath = "//button[@ng-click=\"openAccount()\"]")

    WebElement openaccounttab;

    public void clickonopenaccounttab() {
        Reporter.log("Clicking on open account tab "+ openaccounttab.toString()+ "<br>");
        clickOnElement(openaccounttab);
    }


    //Search customer that created in first test
    @FindBy(xpath = "//select[@id=\"userSelect\"]")
    WebElement serchuser;

    public void selectfromserchuser(String text) {
        Reporter.log("serch user "+text+" from dropdown "+serchuser.toString() + "<br>");
        selectByVisibleTextFromDropDown(serchuser, text);
    }


    //Select currency "Pound"
    @FindBy(xpath = "//select[@id=\"currency\"]")
    WebElement currancypoundselect;

    public void selectcurrancypoundselect(String text) {
        Reporter.log("currancy pound select "+text+" from dropdown "+currancypoundselect.toString() + "<br>");
        selectByValueFromDropDown(currancypoundselect, text);
    }

    //click on "process" button
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processclick;

    public void clickonprocessc() {
        Reporter.log("Clicking on process click "+ processclick.toString()+ "<br>");
        clickOnElement(processclick);
    }
    // search customer
    @FindBy(xpath = "//select[@name='userSelect']")
    WebElement searchCustomer;
    public void selectCustomer(String customer){
        Reporter.log("Selecting Customer "+customer+" from dropdown "+searchCustomer.toString() + "<br>");
        selectByVisibleTextFromDropDown(searchCustomer,customer);
    }

    //popup displayed and click
 //   @FindBy(xpath = "")       // x path needs to find out
  //          WebElement popupclick;

  //  public void clickonpopup() {
  //      clickOnElement(popupclick);
  //  }


    //verify message "Account created successfully"

    public String varrifyAlertText() {
       //    Reporter.log("getting account createsuccessfully text from "+accountcreatesuccessfully.toString()+"<br>");
           return getTextFromAlert();
         }

}



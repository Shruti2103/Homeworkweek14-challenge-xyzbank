package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }
      //click On "Bank Manager Login" Tab
    @FindBy(xpath = "//button[@ng-click=\"manager()\"]")
    WebElement clickonBankManagerLogin;
    public void setClickonBankManagerLogin(){
        Reporter.log("Clicking on  BankManager Login"+ clickonBankManagerLogin.toString()+ "<br>");
        clickOnElement(clickonBankManagerLogin);
    }
    //click On "Add Customer" Tab
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement clickonAddCustomer;

    public void clickonaddingcustomer() {
        Reporter.log("Clicking on  Add Customer "+ clickonAddCustomer.toString()+ "<br>");
        clickOnElement(clickonAddCustomer);
    }


    //enter FirstName
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement enterFirstName;

    public void enterFirstNameField(String name) {
        Reporter.log("Enter name "+name+ " to name  field "+enterFirstName.toString() + "<br>");
        sendTextToElement(enterFirstName, name);
    }


    //enter LastName
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement enterLastName;

    public void enterLastNameField(String name) {
        Reporter.log("Enter email "+name+ " to email field "+enterLastName.toString() + "<br>");
        sendTextToElement(enterLastName, name);
    }

    //enter PostCode
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement enterPostcode;

    public void setEnterPostcode(String postcode) {
        Reporter.log("Enter Postcode"+postcode+ " to email field "+enterPostcode.toString() + "<br>");
        sendTextToElement(enterPostcode, postcode);
    }

    //click On "Add Customer" Button
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addcustomerclick;

    public void clcikonaddcustomer() {
        Reporter.log("Clicking on add customer "+ addcustomerclick.toString()+ "<br>");
        clickOnElement(addcustomerclick);
    }

    public String verifyAlertText(){
        //Reporter.log("getting  text from alert"+.toString()+"<br>");
        return getTextFromAlert();
    }




}

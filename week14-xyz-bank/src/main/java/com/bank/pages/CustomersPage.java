package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.nio.file.Watchable;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver,this);
    }
    //search customer that you created.
    @FindBy(xpath = "//select[@id=\"userSelect\"]")
    WebElement searchcustomer;
    public void searchcustomerfromdroppdown(String name) {
        Reporter.log("Selecting search customer  "+name+" from dropdown "+searchcustomer.toString() + "<br>");
        selectByVisibleTextFromDropDown(searchcustomer, name);
    }
    //click on "Login" Button
    @FindBy(xpath = "//button[contains(text(),\"Login\")]")
    WebElement loginclick;
    public void loginclickforcustomer(){
        Reporter.log("Clicking on login  "+ loginclick.toString()+ "<br>");
        clickOnElement(loginclick);
    }
    //verify "Logout" Tab displayed.
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement yourNameText;

    public String verifyYourNameText(){
        Reporter.log("Selecting your Name Text "+yourNameText+" from dropdown "+yourNameText.toString() + "<br>");
        return getTextFromElement(yourNameText);
    }

    //click on "Logout"
      @FindBy(xpath = "//button[contains(text(),'Logout')]")
      WebElement logoutclick;
    public void clickonlogout(){
        Reporter.log("Clicking on logout "+ logoutclick.toString()+ "<br>");
        clickOnElement(logoutclick);
    }
    public String varifylogout(){
        Reporter.log("getting logout click  text from "+logoutclick.toString()+"<br>");
     return    getTextFromElement(logoutclick);
    }
    //verify "Your Name" text displayed.
    @FindBy(xpath = "//span[@class=\"fontBig ng-binding\"]")
    WebElement nametextvarrify;
    public String varrifynametext(){
        Reporter.log("getting nametext varrify text from "+nametextvarrify.toString()+"<br>");
        return getTextFromElement(nametextvarrify);
    }


}

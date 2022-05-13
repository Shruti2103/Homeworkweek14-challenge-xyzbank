package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);
    }
    // click On "Bank Manager Login" Tab
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickonBankmanagerLogin;
    public void clickonBankmanagerLoginset(){
        Reporter.log("Clicking on click on Bankmanager Login "+ clickonBankmanagerLogin.toString()+ "<br>");
        clickOnElement(clickonBankmanagerLogin);
    }




















}

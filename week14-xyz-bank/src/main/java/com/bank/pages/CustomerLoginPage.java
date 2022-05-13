package com.bank.pages;


import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class CustomerLoginPage extends Utility {
    public CustomerLoginPage() {
        PageFactory.initElements(driver,this);
    }
   // click on "Customer Login" Tab
    @FindBy(xpath = "//button[@ng-click=\"customer()\"]")
    WebElement customerloginclick;
    public void clickoncustomerlogin(){
        Reporter.log("Clicking on customer login  "+ customerloginclick.toString()+ "<br>");
        clickOnElement(customerloginclick);
    }

















}


package com.bank.pages;


import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement gohomepage;
   public void setGohomepage(){
       Reporter.log("Clicking on home page "+ gohomepage.toString()+ "<br>");
       clickOnElement(gohomepage);
   }


}

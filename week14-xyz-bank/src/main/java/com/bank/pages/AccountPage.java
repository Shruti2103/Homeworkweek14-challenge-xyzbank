package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }

    //click on "Deposit" Tab
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement deposittab;
    public void clickdeposittab(){
        Reporter.log("Clicking on deposit tab  "+ deposittab.toString()+ "<br>");
        clickOnElement(deposittab);
    }

    //Enter amount 100
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amontadd;
    public void setamontadd(String amount1) {
        Reporter.log("Enter amount "+amount1+ " to amount field "+amontadd.toString() + "<br>");
        sendTextToElement(amontadd, amount1);
    }


    //click on "Deposit" Button
    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement depositbuttonclick;
    public void clickdepositbutton(){
        Reporter.log("Clicking on deposit button click  "+ depositbuttonclick.toString()+ "<br>");
        clickOnElement(depositbuttonclick);
    }


    //verify message "Deposit Successful"
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositsuccwsfulmessage;
    public String varrifydepositsuccwsfulmessage(){
        Reporter.log("getting deposit succwsful message text from "+depositsuccwsfulmessage.toString()+"<br>");
        return getTextFromElement(depositsuccwsfulmessage);
    }

    //click on "Withdrawl" Tab
    //button[@ng-click="withdrawl()"]
    @FindBy(xpath = "//button[@ng-click=\"withdrawl()\"]")
    WebElement withdrawalclick;
    public void clickonwithdrawal(){
        Reporter.log("Clicking on withdrawal click "+ withdrawalclick.toString()+ "<br>");
        clickOnElement(withdrawalclick);
    }



//Enter amount 50
    @FindBy(xpath = "//input[@ng-model=\"amount\"]")
     WebElement amountenter;
    public void enteramount(String amount) {
        Reporter.log("Enter amount "+amount+ " to amount field "+amountenter.toString() + "<br>");
        sendTextToElement(amountenter, amount);
    }

//click on "Withdraw" Button
     @FindBy(xpath = "//button[@type=\"submit\"]")
      WebElement withdrawbutton;
    public void clickonwithdrawbutton(){
        Reporter.log("Clicking on withdraw button  "+ withdrawbutton.toString()+ "<br>");
        clickOnElement(withdrawbutton);
    }

//verify message "Transaction Successful"
     @FindBy(xpath = "//span[@class=\"error ng-binding\"]")
    WebElement  transactionsuccessful;
    public String varrifytransactionsuccessful(){
        Reporter.log("getting transaction successful text from "+transactionsuccessful.toString()+"<br>");
        return getTextFromElement(transactionsuccessful);
    }



}

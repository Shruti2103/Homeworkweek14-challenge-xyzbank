package com.bank.testsuite;


import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Jay Vaghani
 */

public class BankTest extends TestBase {
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    AccountPage accountPage;
     HomePage homePage;
    @BeforeMethod
    public void inIt() {
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        homePage=new HomePage();
    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        bankManagerLoginPage.clickonBankmanagerLoginset();
        addCustomerPage.clickonaddingcustomer();
        addCustomerPage.enterFirstNameField("Zarmar");
        addCustomerPage.enterLastNameField("Tripathi");
        addCustomerPage.setEnterPostcode("ha2 6pz");
        addCustomerPage.clcikonaddcustomer();

        softAssert.assertEquals(addCustomerPage.verifyAlertText().substring(0,27), "Customer added successfully", "Not navigate to page");
        softAssert.assertAll();
        acceptAlert();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.setGohomepage();
        bankManagerLoginPage.clickonBankmanagerLoginset();
        openAccountPage.clickonopenaccounttab();
        openAccountPage.selectCustomer("Harry Potter");
        openAccountPage.selectcurrancypoundselect("Pound");
        openAccountPage.clickonprocessc();

        try{
            switchToAlert();
            softAssert.assertEquals(openAccountPage.varrifyAlertText().substring(0,28),"Account created successfully","not navigate to page");
            acceptAlert();
        }catch (Exception e){
            //exception handling
        }
        softAssert.assertAll();
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {

        SoftAssert softAssert = new SoftAssert();
        homePage.setGohomepage();
        customerLoginPage.clickoncustomerlogin();
        customersPage.searchcustomerfromdroppdown("Harry Potter");
        customersPage.loginclickforcustomer();
        softAssert.assertEquals(customersPage.varifylogout(), "Logout", "Not navigate to page");

        softAssert.assertEquals(customersPage.varrifynametext(), "Harry Potter", "Not navigate to page");
         customersPage.clickonlogout();

    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldDepositMoneySuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.setGohomepage();
        customerLoginPage.clickoncustomerlogin();
        customersPage.searchcustomerfromdroppdown("Harry Potter");
        customersPage.loginclickforcustomer();
        accountPage.clickdeposittab();
        accountPage.setamontadd("100");
        accountPage.clickdepositbutton();
        softAssert.assertEquals(accountPage.varrifydepositsuccwsfulmessage(), "Deposit Successful", "Not navigate to page");

    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.setGohomepage();
        customerLoginPage.clickoncustomerlogin();
        customersPage.searchcustomerfromdroppdown("Harry Potter");
        customersPage.loginclickforcustomer();
        accountPage.clickonwithdrawal();
        accountPage.enteramount("50");
        accountPage.clickonwithdrawbutton();
        softAssert.assertEquals(accountPage.varrifytransactionsuccessful(), "Transaction Successful", "Not navigate to page");


    }


}

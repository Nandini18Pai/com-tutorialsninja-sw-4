package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.Pages.MyAccount;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMyAccountTest extends BaseTest {
    MyAccount myAccount = new MyAccount();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        myAccount.clickOnMyAccount();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter "Register”
        myAccount.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        String expectedMessage = "Register Account";
        String actualMessage = myAccount.getRegisterAccountMsg();
        Assert.assertEquals( expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        //2.1 Click on My Account Link.
        myAccount.clickOnAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccount.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        String expectedMessage = "Returning Customer";
        String actualMessage = myAccount.getReturningCustomerMsg();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        //3.1 Click on My Account Link.
        myAccount.clickOnAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccount.selectMyAccountOptions("Register");
        //3.3 Enter First Name
        myAccount.setFirstName();
        //3.4 Enter Last Name
        myAccount.setLastName();
        //3.5 Enter Email
        myAccount.setEmailName();
        //3.6 Enter Telephone
        myAccount.setTelephone();
        //3.7 Enter Password
        myAccount.setPassword();
        //3.8 Enter Password Confirm
        myAccount.setConfirmPassword();
        //3.9 Select Subscribe Yes radio button
        myAccount.subscribe();
        //3.10 Click on Privacy Policy check box
        myAccount.setPrivacy();
        //3.11 Click on Continue button
        myAccount.clickOnContinue();
        //3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals( "Your Account Has Been Created!", myAccount.accountCreatedMsg());
        //3.13 Click on Continue button
        myAccount.clickOnfinalContinue();
        //3.14 Click on My Account Link.
        myAccount.clickOnMyAccount();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccount.selectMyAccountOptions();
        //3.16 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = myAccount.getAccountLogoutMsg();
        Assert.assertEquals(expectedMessage, actualMessage);
        //3.17 Click on Continue button
        myAccount.clickOnfinalContinue();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on My Account Link.
        myAccount.clickOnMyAccount();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter "Login”
        myAccount.selectMyAccountOptions("Login");
        //4.3 Enter Email address
        myAccount.setEmaiLogin();
        //4.4 Enter Password
        myAccount.setPassword();
        //4.5 Click on Login button
        myAccount.loginButton();
        //4.8 Click on My Account Link.
        myAccount.clickOnMyAccount();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccount.selectMyAccountOptions();
        //4.10 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = myAccount.getAccountLogoutMsg();
        Assert.assertEquals( expectedMessage, actualMessage);
        //4.11 Click on Continue button
        myAccount.clickOnfinalContinue();
    }



}

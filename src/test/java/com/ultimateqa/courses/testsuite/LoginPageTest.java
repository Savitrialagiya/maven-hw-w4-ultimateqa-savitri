package com.ultimateqa.courses.testsuite;


import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
   LoginPage loginPage = new LoginPage();

   @Test
   public void userShouldNavigateToLoginPageSuccessfully(){
       loginPage.clickOnSignInLink();
       Assert.assertEquals(loginPage.getWelcomeText(),"Welcome Back!","Message not displayed");
   }

   @Test
    public void verifyTheErrorMessage(){
       loginPage.clickOnSignInLink();
       loginPage.enterTextInUsernameFiled("admin1234@gmail.com");
       loginPage.enterTextInPasswordField("admin1234");
       loginPage.clickOnSignInButton();
       Assert.assertEquals(loginPage.getInvalidEmailOrPassword(),"Invalid email or password.","Message not displayed");
   }
}

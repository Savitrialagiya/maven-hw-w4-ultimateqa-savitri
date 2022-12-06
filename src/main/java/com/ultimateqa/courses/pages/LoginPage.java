package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

  By signIn = By.linkText("Sign In");
  By welcomeText = By.xpath("//h1[@class=\"page__heading\"]");
  By usernameField = By.id("user[email]");
  By passwordField = By.id("user[password]");
  By signInButton = By.xpath("//input[@type=\"submit\"]");
  By invalidText = By.xpath("//li[contains(text(),\"Invalid email or password.\")]");

  public void clickOnSignInLink(){
      clickOnElement(signIn);
  }
  public String getWelcomeText(){
      return getTextFromElement(welcomeText);
  }
  public void enterTextInUsernameFiled(String username){
      sendTextToElement(usernameField,username);
  }
  public void enterTextInPasswordField(String password){
      sendTextToElement(passwordField,password);
  }
  public void clickOnSignInButton(){
      clickOnElement(signInButton);
  }
  public String getInvalidEmailOrPassword(){
      return getTextFromElement(invalidText);
  }


}

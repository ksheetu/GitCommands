package Locators;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.util.concurrent.TimeUnit;

public class LocatosDemo {



public static void main(String[] args) {

	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "F:\\Sheetal\\Udemy\\WebDriver\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.get("https://rahulshettyacademy.com/angularpractice/");

	WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));

	//System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
	
	WebElement Label=(driver.findElement(withTagName("label").above(nameEditBox)));
	System.out.println(Label.getText());
	/*
	 * WebElement dateofBirth=
	 * driver.findElement(By.cssSelector("[for='dateofBirth']"));
	 * 
	 * driver.findElement(withTagName("input").below(dateofBirth)).sendKeys(
	 * "02/02/1992");
	 * 
	 * WebElement iceCreamLabel=driver.findElement(By.
	 * xpath("//label[text()='Check me out if you Love IceCreams!']"));
	 * 
	 * driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();
	 * 
	 * //Get me the label of first Radio button
	 * 
	 * WebElement rb=driver.findElement(By.id("inlineRadio1"));
	 * 
	 * System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).
	 * getText());
	 */

}



}


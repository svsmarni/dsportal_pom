package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Saucedemo {
	
	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://saucedemo.com/");
	driver.manage().window().maximize();
	
	WebElement userName = driver.findElement(By.id("user-name"));
	userName.sendKeys("standard_user");
	
	WebElement password = driver.findElement(By.id("password"));
	password.sendKeys("secret_sauce");
	
	
	driver.findElement(By.id("login-button")).click();
	driver.findElement(By.xpath("//*[@id='item_4_title_link']")).click();
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();
	driver.findElement(By.name("checkout")).click();
	
	WebElement firstName = driver.findElement(By.id("first-name"));
	firstName.sendKeys("sireesha");
	
	WebElement lastName = driver.findElement(By.id("last-name"));
	lastName.sendKeys("marni");
	
	WebElement zipcode = driver.findElement(By.id("postal-code"));
	zipcode.sendKeys("95119");
	
	driver.findElement(By.className("submit-button")).click();
	driver.findElement(By.name("finish")).click();
	//driver.findElement(By.name("back-to-products")).click();
	
	
	
	

}
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	By txt_username = By.id("id_username");
	By txt_password = By.id("id_password");
	
	By btn_login = By.xpath("//input[@value ='Login']");
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void btn_login(String username, String password) {
		
	driver.findElement(txt_username).sendKeys(username);
	driver.findElement(txt_password).sendKeys(password);
	driver.findElement(btn_login).click();
	System.out.println("able to finish login page");
	}

}

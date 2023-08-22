package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signIn {
	
	
	WebDriver driver;
	
	By sign_In = By.xpath("//*[contains(@href, '/login')]");
	
	
	public signIn(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clk_signIn() {
		driver.findElement(sign_In).click();
		System.out.println("able to finish signin page");
	}
	
	

}

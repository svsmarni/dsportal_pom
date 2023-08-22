package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class getStarted {
	
	WebDriver driver;
	
	By get_Started = By.cssSelector("button.btn");
	
	public getStarted(WebDriver driver) {
		
		this.driver = driver;
	}


public void btn_getStarted() {
	driver.findElement(get_Started).click();
	System.out.println("able to finish getstarted page");
}

}

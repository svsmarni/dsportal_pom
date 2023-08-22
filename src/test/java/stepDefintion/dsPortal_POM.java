package stepDefintion;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login;
import pages.getStarted;
import pages.signIn;

public class dsPortal_POM {
	
	
	WebDriver driver = null;
	getStarted startpage;
	signIn signinpage;
	Login loginpage;
	
	//WebDriverManager.chromedriver().setup();
	
	
	@Given("user is on home page")
	public void browser_is_open() {
	    
		
		//System.setProperty("webdriver.chrome.driver", "/Users/marni/eclipse-workspace/sauce-demo/src/test/resources/drivers/chromedriver");
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com");
		driver.manage().window().maximize();
	}

	@And("user clicks on \"Get Started\" button")
	public void user_is_on_home_page() {
		
		startpage= new getStarted(driver);
	    startpage.btn_getStarted();
		//driver.findElement(By.cssSelector("button.btn")).click();
	}



	@And("Next page is displayed with content")
	public void user_is_navigated_to_next_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.getPageSource().contains("Data Structures-Introduction");
	    
	}
	
	@When("user cicks on \"sign-in\" button")
	public void user_cicks_on_login() {
		
		signinpage = new signIn(driver);
	    signinpage.clk_signIn();
		//driver.findElement(By.xpath("//*[contains(@href, '/login')]")).click();
	}

	@When("^user enters valid username (.*) and password (.*) and clicks on login button$")
	public void user_enters_valid_username_password_click_login(String username, String password) {
		
		loginpage = new Login(driver);
		loginpage.btn_login(username, password);
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("id_username")).sendKeys(username);
		//driver.findElement(By.id("id_password")).sendKeys(password);
		//driver.findElement(By.xpath("//input[@value ='Login']")).click();
		
	}

//	@When("^user enters a password (.*)$")
//	public void user_enters_valid_password(String password) {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("id_password")).sendKeys(password);
//	}
//
//	@When("user clicks on \"Login\" button")
//	public void user_clicks_on_Login() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@value ='Login']")).click();
//	}

	@Then("^user should be signed-in and (.*) visible on the page$")
	public void user_should_be_signed_in(String username) {
	    // Write code here that turns the phrase above into concrete actions
		driver.getPageSource().contains("Signout");
		driver.getPageSource().contains(username);
	}
	
	@And("user selects Arrays from dropdown")
	public void user_selects_arrays_from_dropdown() {
		driver.findElement(By.className("nav-link")).click();
		driver.findElement(By.xpath("//*[contains(@href, 'array')]")).click();
	}
	
	@Then("user selects Arrays in Python")
	public void user_selects_arrays_in_python() {
		driver.findElement(By.className("list-group-item")).click();
	}

	@Then("user clicks on \"try here\"")
	public void user_clicks_on_try_here() {
		driver.findElement(By.linkText("Try here>>>")).click();
		System.out.println("try here executed");
	}

	@And("^user types code in the textarea$")
	public void user_types_sample_python_code() {
		
		driver.findElement(By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea")).sendKeys("a=1 \nb=2 \nc=a+b \nprint(c)");	

	}

	@Then("user clicks \"run\" and then go back to homepage")
	public void user_runs_the_code() {
		driver.findElement(By.xpath("//*[@id=\"answer_form\"]/button")).click();
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}
	
	@Then("user selects Linked List from dropdown")
	public void user_selects_linked_list_from_dropdown() {
		driver.findElement(By.className("nav-link")).click();
		//driver.findElement(By.xpath("//*[contains(@href, 'linked-list')]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]")).click();
	}

	@Then("user selects Stack from dropdown")
	public void user_selects_stack_from_dropdown() {
		driver.findElement(By.className("nav-link")).click();
		driver.findElement(By.linkText("Stack")).click();
	}

	@Then("user selects Queue from dropdown")
	public void user_selects_queue_from_dropdown() {
		driver.findElement(By.className("nav-link")).click();
		driver.findElement(By.xpath("//*[contains(@href, 'queue')]")).click();
	}

	@Then("user selects Tree from dropdown")
	public void user_selects_tree_from_dropdown() {
		driver.findElement(By.className("nav-link")).click();
		driver.findElement(By.xpath("//*[contains(@href, 'tree')]")).click();
	}

	@Then("user selects Graph from dropdown")
	public void user_selects_graph_from_dropdown() {
		driver.findElement(By.className("nav-link")).click();
		driver.findElement(By.xpath("//*[contains(@href, 'graph')]")).click();
	}




	


}

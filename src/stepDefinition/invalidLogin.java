package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class invalidLogin {

	WebDriver driver;

	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.edge.driver","E:\\Softs\\Programming\\Servers and Others\\Selenuim Software\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^user enters valid username and invalid password$")
	public void user_enters_valid_username_and_invalid_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("nky1047@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("NKY1346ln");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("^user should see a error message$")
	public void user_should_see_a_error_message() throws Throwable {
		System.out.println("Login Failed!!");
		driver.close();
	}
}

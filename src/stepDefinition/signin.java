package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signin {
	WebDriver driver;

	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.edge.driver","E:\\Softs\\Programming\\Servers and Others\\Selenuim Software\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("nky1047@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("NKY1346sln");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		throw new PendingException();
	}

	@Then("^message displayed login successfully$")
	public void message_displayed_login_successfully() throws Throwable {
		System.out.println("Login Successful");
		throw new PendingException();
	}
}

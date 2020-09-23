package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDemo {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.edge.driver",
				"E:\\Softs\\Programming\\Servers and Others\\Selenuim Software\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println("Setup Edge Driver Done!");
	}

	@After
	public void teardown() {
		driver.close();
		System.out.println("Browser Closed!");
	}

	@Given("^User has opened login page$")
	public void user_has_opened_login_page() throws Throwable {
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("Open application");
	}

	@When("^user provides username and password$")
	public void user_provides_username_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println("Entered credentials");
	}

	@Then("^user signs in successfully$")
	public void user_signs_in_successfully() throws Throwable {
		System.out.println("Signed in successfully");
	}
}
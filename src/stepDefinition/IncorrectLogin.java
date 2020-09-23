package stepDefinition;
 
import org.openqa.selenium.By;

 import org.openqa.selenium.WebDriver;
 
import cucumber.api.java.en.Given;

 import cucumber.api.java.en.Then;

 import cucumber.api.java.en.When;
 
public class IncorrectLogin {

     WebDriver driver;

     @Given("^Application is opened$")
     public void application_is_opened() throws Throwable {
         driver.get("http://demowebshop.tricentis.com/login");
         driver.manage().window().maximize();
         System.out.println("start app");
     }
 
    @When("^I provide valid username and invalid password$")
     public void i_provide_valid_username_and_invalid_password() throws Throwable {
         driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
         driver.findElement(By.name("Password")).sendKeys("rekha");
         driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
         System.out.println("Input credentials");
     }
 
    @Then("^I should view a error message\\.$")
     public void i_should_view_a_error_message() throws Throwable {
         System.out.println("Displays error message");
     }
 
}
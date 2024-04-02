package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class MyAccountLoginStepDefinitions {
	
	WebDriver driver;

@Given("that user opens the browser")
public void that_user_opens_the_browser() 
{
    driver = new ChromeDriver();
}

@When("user enters the url {string}")
public void user_enters_the_url(String string) throws InterruptedException 
{
   driver.get(string);
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   Thread.sleep(3000);
}

/*@When("Enter valid email and password")
public void enter_valid_email_and_password() 
{
	driver.findElement(By.xpath("//input[@id='logonIdentifier']")).sendKeys("testdeployment2019@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test123!");

}*/

@When("Enter valid email {string} and password {string}")
public void enter_valid_email_and_password(String string, String string2) 
{
	driver.findElement(By.xpath("//input[@id='logonIdentifier']")).sendKeys(string);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
}
    

@When("Click the Login button")
public void click_the_login_button() 
{
  driver.findElement(By.id("next")).click();
}

@Then("the user successfully logs in to the application")
public void the_user_successfully_logs_in_to_the_application() 
{
   boolean displayName = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/div/div/ul[1]/li[1]/span")).isDisplayed();
   Assert.assertTrue(displayName);
   
   driver.quit();
}
}

package scenario2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginn {
	WebDriver driver;
	@Given("User enters in Homepage for work")
	public void user_enters_in_Homepage() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Gowtham\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://10.232.237.143:443/TestMeApp/");
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    System.out.println("User Enters in the Homepage");
	}
  	@When("User enters SignIn button")
	public void user_enters_SignIn_button() {
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@Then("User enter username {string}")
	public void user_enter_userName_AlexUser(String name) {
	   driver.findElement(By.id("userName")).sendKeys(name);
	}

	@Then("User enter password {string}")
	public void user_enter_Password_Alex(String password) {
		 driver.findElement(By.id("password")).sendKeys(password);
	  
	}
	@Then("User clicks Login button")
	public void user_clicks_Login_button() throws InterruptedException {
	   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	   Assert.assertEquals(driver.getTitle(), "Home");
	   System.out.println("Login Successfuly");
	   Thread.sleep(2000);
	   driver.close();
	}
	}
	


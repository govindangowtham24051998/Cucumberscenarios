package search;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search {
	WebDriver driver;
	@Given("User opens testme app")
	public void user_opens_testme_app() { 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Gowtham\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://10.232.237.143:443/TestMeApp/");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    System.out.println("User Enters in the Homepage");
	}

	@When("User clicks SignIn button")
	public void user_clicks_SignIn_button() {
		driver.findElement(By.partialLinkText("SignIn")).click();
	}

	@Then("User enters username {string} in the field")
	public void user_enters_username_in_the_field(String name) {
		   driver.findElement(By.id("userName")).sendKeys(name);

	  
	}

	@Then("User enters password {string} in the field")
	public void user_enters_password_in_the_field(String password) {
		   driver.findElement(By.id("password")).sendKeys(password);
		   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();

	}

	@Then("User Searches the product")
	public void user_Searches_the_product() {
	 driver.findElement(By.id("myInput")).sendKeys("Hand bag");
	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchSubCat.htm?val=search");
	 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	 Assert.assertEquals(driver.getTitle(),"View Cart");
	 System.out.println("Product added");
	 
	}

	@Then("User proceeds to checkout")
	public void user_proceeds_to_checkout() {
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	  System.out.println("product processed for payment");
	}

	@Then("User buys the product")
	public void user_buys_the_product() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
	   driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[1]")).sendKeys("lalitha");
	   driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input[2]")).sendKeys("Password123");
	   driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	   Thread.sleep(2000);
	   driver.close();
	}
	


}

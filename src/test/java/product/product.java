package product;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class product {

	WebDriver driver;
	
	@Given("Alex has registerd into TestMEapp")
	public void alex_has_registerd_into_TestMEapp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Gowtham\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    System.out.println("User Enters in the Homepage");
		driver.findElement(By.partialLinkText("SignIn")).click();
		 driver.findElement(By.id("userName")).sendKeys("lalitha");
		 driver.findElement(By.id("password")).sendKeys("Password123");
		   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		   System.out.println("User Login successfully");

	}

	@When("Alex search for product Headphones")
	public void alex_search_for_product_Headphones() {
		 driver.findElement(By.id("myInput")).sendKeys("Hand bag");
		 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		// driver.get("http://10.232.237.143:443/TestMeApp/fetchSubCat.htm?val=search");
		 driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		 
	}

	@And("Try to proceed to checkout without adding item in cart")
	public void try_to_proceed_to_checkout_without_adding_item_in_cart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  Assert.assertEquals(driver.getCurrentUrl(), "http://10.232.237.143:443/TestMeApp/removeCartItem.htm?prodId=18");
	  System.out.println("No product to proceed");
	  
	}

	@Test
	@Then("TestMeApp doesnt display the cart icon")
	public void testmeapp_doesnt_display_the_cart_icon() {
		driver.navigate().to("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		System.out.println("Search Another Time with Product added");
		  driver.close();
	}


}

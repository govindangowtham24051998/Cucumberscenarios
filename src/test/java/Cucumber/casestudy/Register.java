package Cucumber.casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	WebDriver driver;
	@Given("User enters in Homepage")
	public void user_enters_in_Homepage() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Gowtham\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("http://10.232.237.143:443/TestMeApp/");
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    System.out.println("User Enters in the Homepage");
	}
  @When("User clicks the SignUp button")
	public void user_clicks_the_SignUp_button() {
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	   System.out.println("User clicks Signup");
	}

	@Given("User enters Username {string} in field")
	public void user_enters_Username_in_field(String Username) {
	   driver.findElement(By.id("userName")).sendKeys(Username);
	}
	

	@Given("User enters firstname {string} in field")
	public void user_enters_firstname_in_field(String firstname) {
		   driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(firstname);

	}

	@Given("User enters lastname {string} in field")
	public void user_enters_lastname_in_field(String lastname) {
		 driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(lastname);
	}

	@Given("User enters password {string} in field")
	public void user_enters_password_in_field(String password) {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);

	}

	@Given("User enters confirmpassword {string} in field")
	public void user_enters_confirmpassword_in_field(String confirmpassword) {
		 driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(confirmpassword);

	}

	@Given("User enters gender {string} in field")
	public void user_enters_gender_in_field(String gender ) {
		 driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();

	}

	@Given("User enters email {string} in field")
	public void user_enters_e_mail_in_field(String email) {
		 driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(email);

	}

	@Given("User enters mobilenumber {string} in field")
	public void user_enters_mobilenumber_in_field(String mobilenumber) {
		 driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys(mobilenumber);

	}

	@Given("User enters dob {string} in field")
	public void user_enters_dob_in_field(String dob) throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(dob);
	

	}

	@Given("User enters address {string} in field")
	public void user_enters_address_in_field(String address) {
		 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(address);

	}

	@Given("User enters security question {string} in field")
	public void user_enters_security_question_in_field(String securityquestion) {
		 driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[1]")).click();

	}

	@Given("User enters answer {string} in field")
	public void user_enters_answer_in_field(String answer) throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(answer);
		 
	}
@Then("user clicks Register button")
	public void user_clicks_Register_button() {
		 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}
	@Then("Login page is diplayed")
	public void login_page_is_diplayed()  throws InterruptedException {
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(),"Login");
		System.out.println("Login page displayed");
		driver.close();
	   
	}
}

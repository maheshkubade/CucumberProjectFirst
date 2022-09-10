package StepDefination;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	public WebDriver driver;

	@Given("^Intialize the chrome driver$")
	public void intialize_the_chrome_driver() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mahes\\OneDrive\\Desktop\\ChromeDriver\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@When("^user navigates to URL$")
	public void user_navigates_to_url() throws Throwable {

		driver.get("https://login.salesforce.com/");
	}

	@And("^user enter username and password and clicks on login button$")
	public void user_enter_username_and_password_and_clicks_on_login_button() throws Throwable {

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mk");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass@1234");
		driver.findElement(By.xpath("//input[@id='Login']")).click();

	}

	@Then("^user shpuld be able to login$")
	public void user_shpuld_be_able_to_login() throws Throwable {

		System.out.print("hello i am in");

	}

}

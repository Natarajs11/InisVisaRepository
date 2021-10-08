package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.*;

public class FrenchVisaSteps {

	WebDriver driver;

	@Given("user is on the website")
	public void user_is_on_the_website() 
	{

		System.setProperty("webdriver.chrome.driver","D:/Workspace/InisVisaproject/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/check-irish-visa");

	}

	@When("user selects nationality from drop down list")
	public void user_selects_nationality_from_drop_down_list() throws InterruptedException 
	{

		Select drpCountry = new Select(driver.findElement(By.name("SelectURL")));
		drpCountry.selectByVisibleText("France");
		Thread.sleep(2000);

	}

	@And("user hits select button")
	public void user_hits_select_button() 
	{

		try {
			Thread.sleep(5000);
			driver.findElement(By.className("buttons")).click();

		}catch(Exception e) {
			System.out.println("exception" +e);
		}

	}

	@Then("user is navigated to visa not required page.")
	public void user_is_navigated_to_visa_not_required_page()throws InterruptedException
	{

		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/visa-europe");
		Thread.sleep(2000);
		driver.close();

	}

}

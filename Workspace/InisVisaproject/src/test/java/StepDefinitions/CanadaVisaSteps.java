package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.*;

public class CanadaVisaSteps {

	WebDriver driver;

	@Given("User has visited inis website")
	public void user_has_visited_inis_website()
	{

		System.setProperty("webdriver.chrome.driver","D:/Workspace/InisVisaproject/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/check-irish-visa");
	}



	@When("user selects his nationality from drop down list")
	public void user_selects_his_nationality_from_drop_down_list() throws InterruptedException
	{

		Select drpCountry = new Select(driver.findElement(By.name("SelectURL")));
		drpCountry.selectByVisibleText("Canada");
		Thread.sleep(1000);

	}

	@When("hits on the select button")
	public void hits_on_the_select_button()
	{

		try {
			Thread.sleep(5000);
			driver.findElement(By.className("buttons")).click();

		}catch(Exception e) {
			System.out.println("exception" +e);
		}

	}

	@Then("Users are navigated to visa requiremnt page")
	public void users_are_navigated_to_visa_requiremnt_page() throws InterruptedException 
	{

		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/visa-required");
		driver.getPageSource().contains("More than 3 months");
		Thread.sleep(2000);

	}

	@Then("when user select more than {int} months option.")
	public void when_user_select_more_than_months_option(Integer int1) throws InterruptedException
	{

		driver.getPageSource().contains("More than 3 months");
		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/non-visa-required-long");
		Thread.sleep(2000);

	}

	@Then("users are navigated to study page.")
	public void users_are_navigated_to_study_page() throws InterruptedException 
	{

		driver.getPageSource().contains("Study");
		Thread.sleep(2000);
	}

	@Then("when users clicks on the study link")
	public void when_users_clicks_on_the_study_link() throws InterruptedException
	{

		driver.findElement(By.linkText("Study")).click();
		Thread.sleep(2000);

	}

	@Then("Users are navigated to visa not required page")
	public void users_are_navigated_to_visa_not_required_page() throws InterruptedException{


		driver.navigate().to("http://www.inis.gov.ie/en/INIS/Pages/non-visa-long-study");
		Thread.sleep(2000);
		driver.close();

	}

}

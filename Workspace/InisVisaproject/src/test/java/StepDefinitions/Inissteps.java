package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;

public class Inissteps {


	WebDriver driver =null;

	@Given("browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:/Workspace/InisVisaproject/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}

	@And("user is on the google search page")
	public void user_is_on_the_google_search_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.navigate().to("https://www.google.com/");

	}

	@When("user enters a text in the search box")
	public void user_enters_a_text_in_the_search_box() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(5000);
			driver.findElement(By.className("gLFyf gsfi")).click();

		}catch(Exception e) {
			System.out.println("exception" +e);
		}

	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException{
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException{
		// Write code here that turns the phrase above into concrete actions

		driver.getPageSource().contains("INIS");
		driver.navigate().to("http://www.inis.gov.ie/");
		Thread.sleep(2500);
		driver.close();  

	}



}

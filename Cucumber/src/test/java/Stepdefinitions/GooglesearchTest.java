package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglesearchTest {

	
	static WebDriver driver;
	@Given("broswer is open")
	public void openthebrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Browser is open");
	}
	
	@And("user is on google search page")
	public void Googlesearchpage()
	{
		driver.get("https://www.google.co.in/");
		System.out.println("Current on google search page");
	}
	
	@When("user to enter text in searchbox")
	public void typetext()
	{
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Cricbuzz");
		System.out.println("typed the text");
	}
	
	@And("user to click on search icon")
	public void clickonsearchbutton()
	{
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
		System.out.println("hit the button");
	}
	
	@Then("user to navigate to the search result")
	public void getsearchedresult()
	{
		driver.getPageSource().contains("Cricket Schedule");		
		System.out.println("Boom!!! result is here");
	}
}

package Stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm {

	static WebDriver driver;
	@Given("open the browser")
	public void openthebrowser()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Browser is open");
	}
	
	@And("user navigate to website")
	public void Googlesearchpage()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Current on google search page");
	}
	
	@When("^user to enter again (.*) and (.*)$")
	public void user_to_enter_again_username_and_password(String username,String password) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		System.out.println("typed the text");
	}
	
	@And("user to click on login button")
	public void clickonsearchbutton()
	{
		driver.findElement(By.xpath("//button[text()=' Login ']")).submit();
		System.out.println("hit the button");
	}
	
	@Then("user to login succesfully")
	public void getsearchedresult()
	{
			
		System.out.println("Boom!!! result is here");
	}
}



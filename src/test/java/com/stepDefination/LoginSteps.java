package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() { 
	    // Write code here that turns the phrase above into concrete actions
	     WebDriverManager.chromedriver().setup();
	     driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}
	

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	   driver.findElement(By.name("username")).sendKeys(username);
	   driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User successfully loged in");
	    Thread.sleep(5000);
	    driver.manage().window().minimize();
	    driver.quit();
	}
}

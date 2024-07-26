package StefDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps 
{
	WebDriver d;
	@Given("user is on homepage")
	public void user_is_on_homepage() throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		d= new FirefoxDriver();
		d.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gad_source=1&gclid=CjwKCAjwqMO0BhA8EiwAFTLgIJQpdIHfK9wLCOILRVnAKndSIZmFZWAsnlvphO9bLgbYQ8-SGv807RoCwcQQAvD_BwE");
		d.manage().window().maximize();
		Thread.sleep(3000); 
	}

	@When("user enters valid address,date and search")
	public void user_enters_valid_address_date_and_search() throws InterruptedException
	{
		d.findElement(By.xpath("//input[@placeholder='From Station']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[text()='Bangalore']")).click();
		Thread.sleep(3000);

		d.findElement(By.xpath("//input[@placeholder='To Station']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		d.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		Thread.sleep(3000);
	}

	@Then("user clicks price drop, bus partners and three options")
	public void user_clicks_price_drop_bus_partners_and_three_options() throws InterruptedException 
	{
		WebElement Checkbox = d.findElement(By.id("price-drop"));							
		Checkbox.click();		
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		List<WebElement> c = d.findElements(By.xpath("//div[@class='scrollable-container  primary ']//input"));
		for(int i=2; i<c.size();i++) 
		{
			c.get(i).click();		
		}
		Thread.sleep(5000);
	}

	@Then("user select seat and dropping point")
	public void user_select_seat_and_dropping_point() throws InterruptedException 
	{

		d.findElement(By.xpath("//button[text()='Show Seats'][1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//span[text()='U7']")).click();
		Thread.sleep(5000);

		WebElement c2 = d.findElement(By.xpath("//p[text()='Electronic City']"));							
		c2.click();		
		Thread.sleep(3000);
	}



}

package Bootcamp.Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy (xpath = "//span[contains(text(),'Flights')]")
	WebElement flightsbutton;
	
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void flightsbuttonclick() {
		flightsbutton.click();
	}
	
	

}

package Bootcamp.Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelerInfo {
	public WebDriver driver;
	
	@FindBy(xpath = "//body[contains(@class,'')]")
	WebElement firstname;
	@FindBy(id="lastname[0]")
	WebElement lastname;
	@FindBy (id="phone-number[0]")
	WebElement phonenumber;
	@FindBy (id="gender_male[0]")
	WebElement gender;

public TravelerInfo(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void firstnamefield() {
	firstname.sendKeys("yacine");
}
public void lastnamefield() {
	lastname.sendKeys("hamama");
}
public void phonenumberfield() {
	phonenumber.sendKeys("3172246832");
}
public void genderfield() {
	gender.click();
}
}

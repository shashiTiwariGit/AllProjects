package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	
	@FindBy(id="btn_basic_example")
	WebElement startPracticingButton;
	
	public void clickStartPracticing(){
		startPracticingButton.click();
	}
	
	

}

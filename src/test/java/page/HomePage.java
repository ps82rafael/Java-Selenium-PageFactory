package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTeste.BaseTeste;

public class HomePage extends BaseTeste{
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class=\"login\"]")
	private WebElement btnSignIn;

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}

	
}


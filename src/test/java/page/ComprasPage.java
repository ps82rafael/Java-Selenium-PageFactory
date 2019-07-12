package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTeste.BaseTeste;

public class ComprasPage extends BaseTeste{
	
	
	
	public ComprasPage(WebDriver driver) {
		BaseTeste.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@title='T-shirts' and parent::li/preceding-sibling::li/child::a[@title='Dresses']]")
	private WebElement tshirts;
	
	@FindBy(xpath = "//div[@class='button-container']/child::a[@title='Add to cart']")
	private WebElement adicionar;
		
	@FindBy(xpath ="//a[@class='product_img_link']/child::img[@class='replace-2x img-responsive']" )
	private WebElement mouseHover;
	
	@FindBy(xpath ="//div[@class='button-container']/child::a[@class='btn btn-default button button-medium']" )
	private WebElement checkuot;
	

	public WebElement getCheckuot() {
		return checkuot;
	}

	public WebElement getMouseHover() {
		return mouseHover;
	}

	public WebElement getAdicionar() {
		return adicionar;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

}

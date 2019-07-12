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
	private WebElement mousedresses;
	
	@FindBy(xpath ="//a[@class='product_img_link']/child::img[@src='http://automationpractice.com/img/p/8/8-home_default.jpg']" )
	private WebElement mouseaddx;
	
	@FindBy(xpath ="//a[@class='product_img_link']/child::img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']" )
	private WebElement mouseadds;
	

	@FindBy(xpath ="//div[@class='button-container']/child::a[@class='btn btn-default button button-medium']" )
	private WebElement checkuot;
	
	@FindBy(xpath ="//a[@title='Dresses' and parent::li/following-sibling::li/child::a[@title='T-shirts']]" )
	private WebElement dresses;
	
	@FindBy(xpath ="//div[@class='compare']/child::a[@data-id-product='3']" )
	private WebElement adicionarx;
	
	@FindBy(xpath ="//div[@class='compare']/child::a[@data-id-product='4']" )
	private WebElement adicionars;
	
	
	

	public WebElement getAdicionars() {
		return adicionars;
	}

	public WebElement getAdicionarx() {
		return adicionarx;
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCheckuot() {
		return checkuot;
	}

	public WebElement getMouseHover() {
		return mousedresses;
	}
	
	public WebElement getMouseaddx() {
		return mouseaddx;
	}
	
	public WebElement getMouseadds() {
		return mouseadds;
	}


	public WebElement getAdicionar() {
		return adicionar;
	}

	public WebElement getTshirts() {
		return tshirts;
	}

}

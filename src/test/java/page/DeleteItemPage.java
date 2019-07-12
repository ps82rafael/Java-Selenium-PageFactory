package page;

import baseTeste.BaseTeste;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteItemPage extends BaseTeste {

    public DeleteItemPage(WebDriver driver) {
        BaseTeste.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//a[@title='View my shopping cart']")
    private WebElement linkCart;
    @FindBy(xpath = "//td[@class='cart_delete text-center']/descendant-or-self::a[@id='3_13_0_0']")
    private WebElement btnDeletar;

    public WebElement getLinkCart() { return linkCart; }
}



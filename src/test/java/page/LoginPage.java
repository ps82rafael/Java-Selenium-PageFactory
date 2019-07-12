package page;

import baseTeste.BaseTeste;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTeste {

    public LoginPage (WebDriver driver) {
        BaseTeste.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//input[@id='email']")
    private WebElement inputEmailLogin;
    @FindBy (xpath = "//input[@id='passwd']")
    private WebElement inputSenhaLogin;
    @FindBy (xpath = "//button[@id='SubmitLogin']")
    private WebElement btnSignIn;

    public WebElement getInputEmailLogin() {return inputEmailLogin;}
    public WebElement getInputSenhaLogin() {return inputSenhaLogin;}
    public WebElement getBtnSignIn() {return btnSignIn;}

}

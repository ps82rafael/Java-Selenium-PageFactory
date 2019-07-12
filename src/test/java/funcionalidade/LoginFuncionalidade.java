package funcionalidade;


import baseTeste.BaseTeste;
import baseTeste.Utils;
import org.openqa.selenium.By;
import page.HomePage;
import page.LoginPage;

import java.sql.Driver;

public class LoginFuncionalidade extends BaseTeste {

    private HomePage homepage;
    private LoginPage loginPage;
    private static String url = "http://automationpractice.com/index.php";
    private Utils utils;

    public LoginFuncionalidade() {
        this.homepage = new HomePage(driver);
        this.loginPage = new LoginPage(driver);
        this.utils = new Utils();
    }

    public void loginSucesso() {

        driver.get(url);
        this.homepage.getBtnSignIn().click();
        this.utils.preencheCampoTexto(this.loginPage.getInputEmailLogin(), "Rafateste15@teste.com");
        this.utils.preencheCampoTexto(this.loginPage.getInputSenhaLogin(), "123456");
        this.loginPage.getBtnSignIn().click();
    }

    public String retornanome() {
        return driver.findElement(By.xpath("//a[@class='account']")).getText();
    }
}
package funcionalidade;

import baseTeste.BaseTeste;
import baseTeste.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.CadastroPage;
import page.HomePage;

public class FilterFuncionalidade extends BaseTeste {

    private HomePage homePage;
    private CadastroPage cadastroPage;
    private Utils utils;
    private static String url = "http://automationpractice.com/index.php";

    public FilterFuncionalidade() {
        this.homePage = new HomePage(driver);
        this.cadastroPage = new CadastroPage(driver);
        this.utils = new Utils();
    }

    public void filtroSucess() {
        driver.get(url);
    }
}
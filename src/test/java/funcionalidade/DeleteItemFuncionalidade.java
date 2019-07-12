package funcionalidade;

import baseTeste.BaseTeste;
import baseTeste.Utils;
import page.DeleteItemPage;
import page.HomePage;

public class DeleteItemFuncionalidade extends BaseTeste {

    private HomePage homepage;
    private DeleteItemPage deleteItemPage;
    private Utils utils;
    private String url = "http://automationpractice.com/index.php";

    public DeleteItemFuncionalidade(){

        this.homepage = new HomePage(driver);
        this.deleteItemPage = new DeleteItemPage(driver);
        this.utils = new Utils();
    }

    public void DeleteItemSucesso(){
        driver.get(url);
        this.deleteItemPage.getLinkCart().click();

    }

}

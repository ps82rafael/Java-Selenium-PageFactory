package funcionalidade;

import baseTeste.BaseTeste;
import baseTeste.Utils;
import page.ComprasPage;

public class ComprasFuncionalidade extends BaseTeste {

	private static String url = "http://automationpractice.com/index.php?controller=my-account";

	private ComprasPage comprasPage;

	private Utils utils;

	public ComprasFuncionalidade() {

		this.comprasPage = new ComprasPage(driver);
		this.utils = new Utils();
	}

	public void comprastshirts() {

		driver.get(url);
		
		this.comprasPage.getDresses().click();
		this.utils.mouseHover(this.comprasPage.getMouseaddx());
		this.comprasPage.getAdicionarx().click();
		this.utils.mouseHover(this.comprasPage.getMouseadds());
		this.comprasPage.getAdicionars().click();
		//this.comprasPage.getTshirts().click();
		//this.utils.mouseHover(this.comprasPage.getMouseHover());
        //this.comprasPage.getAdicionar().click();
        //driver.switchTo().parentFrame();
        //this.comprasPage.getCheckuot().click();
        
	}

}

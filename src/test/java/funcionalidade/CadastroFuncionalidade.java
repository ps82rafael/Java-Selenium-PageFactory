package funcionalidade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import baseTeste.BaseTeste;
import baseTeste.Utils;
import page.CadastroPage;
import page.HomePage;

public class CadastroFuncionalidade extends BaseTeste {
	
	private HomePage homePage;
	private CadastroPage cadastroPage;
	private Utils utils;
	private static String url = "http://automationpractice.com/index.php";
	
	public CadastroFuncionalidade() {
		this.homePage = new HomePage(driver);
		this.cadastroPage = new CadastroPage(driver);
		this.utils = new Utils();
	}
	
	
	public void cadstroSucesso() {
	driver.get(url);
	this.homePage.getBtnSignIn().click();
	this.utils.preencheCampoTexto(this.cadastroPage.getInputEmailCreate(),"teste12224@teste.com.br");
	this.cadastroPage.getBtnCreateanAccount().click();	
	wait.until(ExpectedConditions.invisibilityOf(this.cadastroPage.getGenderTitle()));                                              
	this.cadastroPage.getRadioGenderMr().click();
	this.cadastroPage.getInputName().sendKeys("Rafael");
	this.cadastroPage.getInputId().sendKeys("Pereira dos Santos");
	this.utils.selectByValue(this.cadastroPage.getCountry(), "21");
	this.utils.selectByValue(this.cadastroPage.getSelectDia(), "17");
	this.utils.selectByValue(this.cadastroPage.getSelectMes(), "9");
	this.utils.selectByValue(this.cadastroPage.getSelectAno(), "2006");
	this.utils.preencheCampoTexto(this.cadastroPage.getInputpasswd(), "Baratao");
	this.cadastroPage.getNewsletter().click();
	this.utils.preencheCampoTexto(this.cadastroPage.getCompany(), "Yaman");
	this.utils.preencheCampoTexto(this.cadastroPage.getAddress1(), "Alameda Rio Negro");
	this.utils.preencheCampoTexto(this.cadastroPage.getAddress2(), "Bloco 2 - 2º Andar, Barueri - SP");
	this.utils.preencheCampoTexto(this.cadastroPage.getCity(), "Alabama");
	this.utils.selectByValue(this.cadastroPage.getState(), "11");
	this.utils.preencheCampoTexto(this.cadastroPage.getinformation(),"Treinando Automação na Yaman:");
	this.utils.preencheCampoTexto(this.cadastroPage.getPostcode(), "06655");
	this.utils.preencheCampoTexto(this.cadastroPage.getPhone(), "011-42798-2983");
	this.utils.preencheCampoTexto(this.cadastroPage.getMobile(), "011-92798-2325");
	driver.findElement(By.xpath("//input[@id='alias']")).clear();
	driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Teste@teste2.com.br");
	driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	
	
	
}

public String retornanome() {
	return driver.findElement(By.xpath("//a[@class='account']")).getText();
			
}

}

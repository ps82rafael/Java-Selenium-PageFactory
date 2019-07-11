package baseTeste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils extends BaseTeste {
		
	/**
	 * Metodo irá selecionar o elemento
	 * @param select Recebe o valor do elemento
	 * @param value Esse parametro recebe o valor do campo select que voce pretende clicar 
	 */
	public void selectByValue(WebElement select, String value) {
		
		Select elemento = new Select(select);
		elemento.selectByValue(value);
	}
	
	public void preencheCampoTexto(WebElement elemento, String value) {
		
		elemento.sendKeys(value);		
		
	}
	

}


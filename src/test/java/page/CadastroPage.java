package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseTeste.BaseTeste;

public class CadastroPage extends BaseTeste {

	public CadastroPage(WebDriver driver) {
		BaseTeste.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"email_create\"]")
	private WebElement inputEmailCreate;

	@FindBy(xpath = "//button[@class=\"btn btn-default button button-medium exclusive\"]")
	private WebElement btnCreateanAccount;

	@FindBy(xpath = "//div[@class='radio-inline']/child::label[@class='top']/descendant::input[@id='id_gender1']")
	private WebElement radioGenderMr;

	@FindBy(xpath = "//div[@class='radio-inline']/child::label[@class='top']/descendant::input[@id='id_gender1']")
	private WebElement radioGenderTitle;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement inputName;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	private WebElement inputId;

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement inputpasswd;

	@FindBy(xpath = "//select[@id='days']")
	private WebElement selectDia;

	@FindBy(xpath = "//select[@id='months']")
	private WebElement selectMes;

	@FindBy(xpath = "//select[@id='years']")
	private WebElement selectAno;

	@FindBy(xpath = "//div[@id='uniform-newsletter']")
	private WebElement newsletter;

	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;

	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address1;

	@FindBy(xpath = "//input[@id='address2']")
	private WebElement address2;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement city;

	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement state;

	@FindBy(xpath = "//textarea[@id='other']")
	private WebElement information;
	
	@FindBy(xpath = "//select[@id='id_country']")
	private WebElement country;
	
	@FindBy(xpath = "//input[@id='postcode']")
	private WebElement postcode;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@id='phone_mobile']")
	private WebElement mobile;
	

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getinformation() {
		return information;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getNewsletter() {
		return newsletter;
	}

	public WebElement getSelectMes() {
		return selectMes;
	}

	public WebElement getInputId() {
		return inputId;
	}

	public WebElement getInputEmailCreate() {
		return inputEmailCreate;
	}

	public WebElement getBtnCreateanAccount() {
		return btnCreateanAccount;
	}

	public WebElement getRadioGenderMr() {
		return radioGenderMr;
	}

	public WebElement getInputName() {
		return inputName;
	}

	public WebElement getGenderTitle() {
		return radioGenderTitle;
	}

	public WebElement getInputpasswd() {
		return inputpasswd;
	}

	public WebElement getSelectDia() {
		return selectDia;
	}

	public WebElement getSelectAno() {
		return selectAno;
	}

}

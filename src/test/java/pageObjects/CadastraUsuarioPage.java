package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastraUsuarioPage {
	
	@FindBy(className = "login" )
	private WebElement botaoLogin; 
	
	@FindBy(id = "email_create" )
	private WebElement campoEmail; 
	
	@FindBy(name = "SubmitCreate" )
	private WebElement botaoCreat; 
	
	@FindBy(id = "id_gender1" )
	private WebElement checkSx; 
	
	@FindBy(name = "customer_firstname" )
	private WebElement campoFirstName; 
	
	@FindBy(name = "customer_lastname" )
	private WebElement campoLastName; 
	
	@FindBy(id = "passwd" )
	private WebElement campoPassw; 
	
	@FindBy(id = "days" )
	private WebElement dowData; 
	
	@FindBy(id = "months" )
	private WebElement dowMes; 
	
	@FindBy(id = "years" )
	private WebElement dowAno; 
	
	////////////////////////////////////
	
	@FindBy(name = "address1" )
	private WebElement campoAddress; 
	
	@FindBy(name = "city" )
	private WebElement campoCity; 
	
	@FindBy(name = "id_state" )
	private WebElement dowState; 
	
	@FindBy(name = "postcode" )
	private WebElement campoPost; 
	
	@FindBy(name = "phone_mobile" )
	private WebElement campoMobile; 
	
	@FindBy(name = "alias" )
	private WebElement campoAlias; 
	
	@FindBy(name = "submitAccount" )
	private WebElement botaoRegister; 
		
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
		
	}
	public void preencherCamporEmais(String usuario) {
		campoEmail.sendKeys(usuario);
		
	}
	public void acionarBotaoCreat() {
		botaoCreat.click();
	}
	public void selecionarChe() {
		checkSx.click();
		
	}
	public void preencherCampoFirstName(String fistName) {
		campoFirstName.sendKeys(fistName);
		
	}
	public void preencherCampoLastName(String lastName) {
		campoLastName.sendKeys(lastName);
		
	}
	public void preencherCampoPassword(String password) {
		campoPassw.sendKeys(password);
		
	}
	public void selecionaDia(String dia) {
		dowData.sendKeys(dia);
		
	}
	public void selecionaMes(String mes) {
		dowMes.sendKeys(mes);
		
	}
	public void selecionaAno(String ano) {
		dowAno.sendKeys(ano);
		
	}
	
	///////////////////////////////////////////////////
	
	public void preencherCampoAddress(String anddress) {
		campoAddress.sendKeys(anddress);
		
	}
	
	public void preencherCampoCity(String city) {
		campoCity.sendKeys(city);
		
	}
	
	public void selecionarCampoState(String State) {
		dowState.sendKeys(State);
		
	}
	
	public void preencherCampoPost(String post) {
		campoPost.sendKeys(post);
		
	}
	
	public void preencherCampoMobile(String mobile) {
		campoMobile.sendKeys(mobile);
		
	}
	
	public void preencherCampoAlias(String alias) {
		campoAlias.clear();
		campoAlias.sendKeys(alias);
		
	}
	
	public void acionarBotaoRegistre() {
		botaoRegister.click();
		
	}
	

}

package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(className = "login" )
	private WebElement botaoSing; 
	
	@FindBy(name = "email" )
	private WebElement campoEmail; 
	
	@FindBy(name = "passwd" )
	private WebElement campoPassw; 
	
	@FindBy(name = "SubmitLogin" )
	private WebElement botaoLogin; 
	
	public void acionarBotaoSingIn() {
		botaoSing.click();
	}
	
	public void preencherUsuario (String usuario) {
		campoEmail.sendKeys(usuario);
	}
	
	public void preencherSenha (String senha) {
		campoPassw.sendKeys(senha);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void acessarLogin(String usuario, String senha) {
		acionarBotaoSingIn();
		preencherUsuario(usuario);
		preencherSenha(senha);
		acionarBotaoLogin();
	}

}

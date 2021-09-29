package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Util.*;
import static utils.Util.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	
	@Quando("acionar o botao SingIn")
	public void acionarOBotaoSingIn() {
		Na(LoginPage.class).acionarBotaoSingIn();

	}

	@Quando("preencher o email  {string}")
	public void preencherOEmail(String email) {
		Na(LoginPage.class).preencherUsuario(email);

	}

	@Quando("preencher o campo password  {string}")
	public void preencherOCampoPassword(String senha) {
		Na(LoginPage.class).preencherSenha(senha);

	}

	@Quando("acionar no botao sing in")
	public void acionarNoBotaoSingIn() {
		Na(LoginPage.class).acionarBotaoLogin();

	}

	@Entao("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
		assertEquals("Lucas Dias", driver.findElement(By.xpath("//a[@class='account']")).getText());

	}

	
	
}

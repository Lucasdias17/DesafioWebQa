package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastraUsuarioPage;

import static org.junit.Assert.assertEquals;
import static utils.Util.*;

import org.openqa.selenium.By;

public class CadastroUsuarioSteps {
	
	@Quando("acionar o botao Sing in")
	public void acionarOBotaoSingIn() {
		Na(CadastraUsuarioPage.class).acionarBotaoLogin();

	}

	@Quando("preencher o email {string}")
	public void preencherOEmail(String email) {
		Na(CadastraUsuarioPage.class).preencherCamporEmais(email);

	}

	@Quando("acionar o botao create an account")
	public void acionarOBotaoCreateAnAccount() {
		Na(CadastraUsuarioPage.class).acionarBotaoCreat();

	}

	@Quando("selecionar o check Mr")
	public void selecionarOCheckMr() {
		Na(CadastraUsuarioPage.class).selecionarChe();

	}

	@Quando("preencher o campo first name {string}")
	public void preencherOCampoFirstName(String fistName) {
		Na(CadastraUsuarioPage.class).preencherCampoFirstName(fistName);

	}

	@Quando("preencher o campo last name {string}")
	public void preencherOCampoLastName(String lastName) {
		Na(CadastraUsuarioPage.class).preencherCampoLastName(lastName);

	}

	@Quando("preencher o campo password {string}")
	public void preencherOCampoPassword(String senha) {
		Na(CadastraUsuarioPage.class).preencherCampoPassword(senha);

	}

	@Quando("seleciona data {string}")
	public void selecionaData(String dias) {
		Na(CadastraUsuarioPage.class).selecionaDia(dias);

	}

	@Quando("seleciona mes {string}")
	public void selecionaMes(String mes) {
		Na(CadastraUsuarioPage.class).selecionaMes(mes);

	}

	@Quando("seleciona o ano {string}")
	public void selecionaOAno(String ano) {
		Na(CadastraUsuarioPage.class).selecionaAno(ano);

	}
	////////////////////////////////////////////

	@Quando("preenche o andrees {string}")
	public void preencheOAndrees(String anddres) {
		Na(CadastraUsuarioPage.class).preencherCampoAddress(anddres);

	}

	@Quando("preenche a city {string}")
	public void preencheACity(String city) {
		Na(CadastraUsuarioPage.class).preencherCampoCity(city);

	}

	@Quando("seleciona o estado {string}")
	public void selecionaOEstado(String state) {
		Na(CadastraUsuarioPage.class).selecionarCampoState(state);

	}

	@Quando("preenche o zip {string}")
	public void preencheOZip(String post) {
		Na(CadastraUsuarioPage.class).preencherCampoPost(post);

	}

	@Quando("preenche o phone {string}")
	public void preencheOPhone(String mobile) {
		Na(CadastraUsuarioPage.class).preencherCampoMobile(mobile);

	}

	@Quando("preencher o email reference {string}")
	public void preencherOEmailReference(String alias) {
		Na(CadastraUsuarioPage.class).preencherCampoAlias(alias);

	}

	@Quando("acionar o botao registe")
	public void acionarOBotaoRegiste() {
		Na(CadastraUsuarioPage.class).acionarBotaoRegistre();

	}

	@Entao("sera efetuado o cadastro de sucesso")
	public void seraEfetuadoOCadastroDeSucesso() {
		assertEquals("Lucas Dias", driver.findElement(By.xpath("//a[@class='account']")).getText());

	}


}

package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CompraPage;

import static org.junit.Assert.assertEquals;
import static utils.Util.*;

import org.openqa.selenium.By;

public class CompraSteps {
	
	@Quando("acionar o botao women")
	public void acionarOBotaoWomen() {
		Na(CompraPage.class).acionaBotaoWomen();
	}

	@Quando("selecionar item")
	public void selecionarItem() {
		Na(CompraPage.class).selecionaItem();
	}

	@Quando("acionar o botao add to carte para ir para o carrinho")
	public void acionarOBotaoAddToCarteParaIrParaOCarrinho() {
		Na(CompraPage.class).acionaBotaoAddTo();
	}

	@Quando("acionar o botao proceed to checkout para prosseguir com compra")
	public void acionarOBotaoProceedToCheckoutParaProsseguirComCompra() {
		Na(CompraPage.class).acionaBotaoProceedCart();
	}

	@Quando("adicionar a quantidade do iten")
	public void adicionarAQuantidadeDoIten() {
		Na(CompraPage.class).adicionaQuantidadeItem();
		Na(CompraPage.class).acionaBotaoProceedAdress();
	}

	@Quando("acionar o botao proceed to checkout para prosseguir para conferir endereco")
	public void acionarOBotaoProceedToCheckoutParaProsseguirParaConferirEndereO() {
		Na(CompraPage.class).acionaBotaoProceedShipp();
	}

	@Quando("acionar o botao proceed to checkout para prosseguir para forma de transporte")
	public void acionarOBotaoProceedToCheckoutParaProsseguirParaFormaDeTransporte() {
		Na(CompraPage.class).acionaCheckShipp();
		Na(CompraPage.class).acionaBotaoProceedPay();
	}

	@Quando("seleciona a forma de pagamento")
	public void selecionaAFormaDePagamento() {
		Na(CompraPage.class).acionaBotaoProceedPayBy();
	}

	@Quando("realiza a confirmacao da compra")
	public void realizaAConfirmacaoDaCompra() {
		Na(CompraPage.class).acionaBotaoProceedConfirm();
	}

	@Entao("sera realizado a compra do produto")
	public void seraRealizadoACompraDoProduto() {
		assertEquals("Order confirmation", driver.findElement(By.xpath("//span[@class='navigation_page']")).getText());

	}



}

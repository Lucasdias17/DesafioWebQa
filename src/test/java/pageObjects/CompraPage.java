package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompraPage {

	
	@FindBy(className = "sf-with-ul" )
	private WebElement botaoWomen;
	
	
	@FindBy(linkText = "Blouse" )
	private WebElement selecaoItem;
	
	
	@FindBy(name = "Submit" )
	private WebElement botaoAddTo;
	
	///////////////////////
	@FindBy(linkText = "Proceed to checkout" )
	private WebElement botaoProceedCart;
	
	
	@FindBy(id = "cart_quantity_up_2_7_0_573322" )
	private WebElement addQuant;
	
	
	@FindBy(linkText = "Proceed to checkout" )
	private WebElement botaoProcedAndress;
	
	
	@FindBy(name = "processAddress" )
	private WebElement botaoProcedShipp;
	
	
	@FindBy(id = "cgv" )
	private WebElement checkShipp;
	
	
	@FindBy(name = "processCarrier" )
	private WebElement botaoProcedPay;
	
	
	@FindBy(className = "bankwire" )
	private WebElement botaoPayBy;
	
	
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']" )
	private WebElement botaoConfirm;
	
	
	public void acionaBotaoWomen() {
		botaoWomen.click();
	}
	
	public void selecionaItem() {
		selecaoItem.click();
	}
	public void acionaBotaoAddTo() {
		botaoAddTo.click();
	}
	public void acionaBotaoProceedCart() {
		botaoProceedCart.click();
	}
	public void adicionaQuantidadeItem() {
		addQuant.click();
	}
	public void acionaBotaoProceedAdress() {
		botaoProcedAndress.click();
	}
	public void acionaBotaoProceedShipp() {
		botaoProcedShipp.click();
	}
	public void acionaCheckShipp() {
		checkShipp.click();
	}
	public void acionaBotaoProceedPay() {
		botaoProcedPay.click();
	}
	public void acionaBotaoProceedPayBy() {
		botaoPayBy.click();
	}
	public void acionaBotaoProceedConfirm() {
		botaoConfirm.click();
	}

}

#language: pt
#enconding: UTF-8

@compra
Funcionalidade: Adicinar Item no carrinho

Cenario: Adicionar item
		Quando acionar o botao women
		E selecionar item
		E acionar o botao add to carte para ir para o carrinho
		E acionar o botao proceed to checkout para prosseguir com compra
		E adicionar a quantidade do iten
		E acionar o botao proceed to checkout para prosseguir para conferir endereco
		E acionar o botao proceed to checkout para prosseguir para forma de transporte
		E seleciona a forma de pagamento
		E realiza a confirmacao da compra 
		
		Entao sera realizado a compra do produto
		

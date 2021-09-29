#language: pt
#enconding: UTF-8

@cadastro
Funcionalidade: Cadastrar usuario 

Cenario: Cadastro de usario
		Quando acionar o botao Sing in
		E preencher o email "lvieira6611@gmail.com"
		E acionar o botao create an account
		E selecionar o check Mr
		E preencher o campo first name "Lucas"
		E preencher o campo last name "Dias"
		E preencher o campo password "12345678"
		E seleciona data "10"
		E seleciona mes "july"
		E seleciona o ano "2019"
		E preenche o andrees "223 E. Concord Street"
		E preenche a city "Orlando"
		E seleciona o estado "Florida"
		E preenche o zip "00000"
		E preenche o phone "(00)0000-00000"
		E preencher o email reference "lvieira2166111@gmail.com"
		E acionar o botao registe
		
		Entao sera efetuado o cadastro de sucesso
		
		
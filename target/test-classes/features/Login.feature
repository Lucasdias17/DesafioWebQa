#language: pt
#enconding: UTF-8

@login
Funcionalidade: RealizarLogin

Cenario: login sucesso
		Quando acionar o botao SingIn
		E preencher o email  "lvieira216611@gmail.com"
		E preencher o campo password  "12345678"
		E acionar no botao sing in
		
		Entao login realizado com sucesso
		

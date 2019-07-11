#language: pt
#author: Marcos
#Encoding: UTF-8


 Funcionalidade: Teste
 
 	Cenario: Teste de tela
 		Dado acessar o site http://automationpractice.com
 		Quando clicar em Sign in
 		E preencher o endereço de e-mail
 		Entao clicar no botao "criar sua conta aqui"
 		
 		Cenario: CadastroUser
 		Dado 
		Quando
		E
		Entao 		
 		
 	
 	Esquema do Cenario: Teste Login 
 		Dado que acesso a tela de login
 		E insiro usuario e senha do <perfil>
 		Quando clico no botao login
 		Entao visualizo a <pagina>
 		
 	Exemplos:
 	| perfil     | pagina |
 	| 	adm	     | home   |
 	| user       | perfil |
 	| backoffice | config |
 	
 	
 	
 	Cenario: Teste Data table
 		Dado que acesso acesso a tela de login
 		E insiro usuario e senha
 		Quando clico no botao login 
 		Entao visualizo mensagem 
 		
 		| usuario | senha | mensagem       |
 		| adm			|				|  senha vazia   |
 		| 				| teste | usuario vazio  |
 		|         |       | usu/senh vazio |
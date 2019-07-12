package testes;

import org.junit.Test;

import baseTeste.BaseTeste;
import funcionalidade.CadastroFuncionalidade;
import junit.framework.Assert;
import page.CadastroPage;

public class LoginTeste{
	private static CadastroFuncionalidade cadastroFuncionalidade; 
	
	public LoginTeste() {
		this.cadastroFuncionalidade = new CadastroFuncionalidade();
	}
	
	
	@Test
	public void testeCadastro() {
		cadastroFuncionalidade.cadstroSucesso();
	Assert.assertEquals("Rafael Pereira dos Santos", cadastroFuncionalidade.retornanome());
	}
	

	
	
	
}

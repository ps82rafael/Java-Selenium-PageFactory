package testes;

import funcionalidade.LoginFuncionalidade;
import junit.framework.Assert;
import org.junit.Test;

public class LoginTeste {
	private LoginFuncionalidade loginFuncionalidade;

	public LoginTeste() {

		this.loginFuncionalidade = new LoginFuncionalidade();
	}
		@Test
		public void testeLogin () {
			loginFuncionalidade.loginSucesso();
			Assert.assertEquals("Rafael dos Santos Leite", loginFuncionalidade.retornanome());

		}

}

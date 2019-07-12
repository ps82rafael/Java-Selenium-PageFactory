package testes;

import funcionalidade.CadastroFuncionalidade;
import junit.framework.Assert;
import org.junit.Test;

public class CadastroTeste {
    private static CadastroFuncionalidade cadastroFuncionalidade;

    public CadastroTeste() {
        this.cadastroFuncionalidade = new CadastroFuncionalidade();
    }

    @Test
    public void testeCadastro() {
        cadastroFuncionalidade.cadstroSucesso();
        Assert.assertEquals("Rafael dos Santos Leite", cadastroFuncionalidade.retornanome());
    }
}
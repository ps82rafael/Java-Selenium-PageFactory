package testes;

import funcionalidade.DeleteItemFuncionalidade;
import org.junit.Test;

public class DeleteItemTeste {
    private DeleteItemFuncionalidade deleteItemFuncionalidade;

    public DeleteItemTeste(){
        this.deleteItemFuncionalidade = new DeleteItemFuncionalidade();
    }

    @Test

    public void testeDeleteItem(){
        deleteItemFuncionalidade.DeleteItemSucesso();


    }
}

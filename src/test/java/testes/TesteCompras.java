package testes;

import org.junit.Test;

import funcionalidade.ComprasFuncionalidade;

public class TesteCompras {
	
	private static ComprasFuncionalidade comprasFuncionalidade; 
	
	public TesteCompras() {
		this.comprasFuncionalidade = new ComprasFuncionalidade();
	}

	@Test
	public void TesteCompras() {
		this.comprasFuncionalidade.comprastshirts();
	}
	
}

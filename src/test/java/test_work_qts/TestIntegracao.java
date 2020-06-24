package test_work_qts;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import work_qts.SomaCalculadora;

public class TestIntegracao {

	private ArrayList lista;

	@Before
	public void init() {

		lista = new ArrayList();
	}

	@Test
	public void testInsert() {
		SomaCalculadora soma = new SomaCalculadora();
		int n1 = 10, n2 = 10;
		int r = soma.soma(n1, n2);
		lista.add(r);
	    assertNotNull(lista.size());	
	}

}

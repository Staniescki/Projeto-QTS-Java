package test_work_qts;

import org.junit.Assert;
import org.junit.Test;

import work_qts.SomaCalculadora;
import work_qts.subtraiCalculadora;

public class TestUnitarios {
	
	@Test
	public void testSoma() {
				
		SomaCalculadora soma = new SomaCalculadora();
		int ret = soma.soma(10, 10);
		int experado = 20;
		Assert.assertEquals(experado, ret);
		
	}


	@Test
	public void testSubtracao() {
				
		subtraiCalculadora sub = new subtraiCalculadora();
		int ret = sub.subtrair(15, 5);
		int experado = 10;
		Assert.assertEquals(experado, ret);
		
	}
	
	
	
}

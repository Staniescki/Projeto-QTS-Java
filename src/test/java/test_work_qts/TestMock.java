package test_work_qts;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;
import work_qts.SomaCalculadora;



@RunWith(MockitoJUnitRunner.class)

public class TestMock {

	
	
	@Test
	public void testSoma() {
	
		SomaCalculadora soma = Mockito.mock(SomaCalculadora.class);
		when(soma.soma(15, 15)).thenReturn(30);
		int result = soma.soma(15, 15);
		Assert.assertEquals(30, result);
		System.out.println(result);
	
	}
	
	
	
	
}

package com.duranco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.duranco.model.Examen;

@SpringBootTest
class Exercice2J4middlewareApplicationTests {

	Examen ex;
	@BeforeEach
	public void initialize()
	{
		ex=new Examen(18,15);
		
	}
	@Test
	public void getMoyenne()
	{
		assertEquals(17.1, ex.calculeMoyenne());
		
		
	}

}

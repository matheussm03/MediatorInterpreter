package interpreter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class ExpressaoTest {

	 @Test
	    void deveRetornar7() { 
		 	Expressao esquerda = new Soma(new Numero(5), new Numero(10));
			Expressao direita = new Soma(new Numero(2), new Numero(6));
			Expressao conta = new Subtracao(esquerda, direita);
			int resultado = conta.avalia();	
	        assertEquals(7 , resultado);
	    }
	
	 @Test
	    void deveRetornar20() { 
		 	Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
			Expressao direita = new Subtracao(new Numero(6), new Numero(2));
			Expressao conta = new Multiplicacao(esquerda, direita);
			int resultado = conta.avalia();	
	        assertEquals(20 , resultado);
	    }
	
	 @Test
	    void deveRetornar6() { 
		 	Expressao esquerda = new Multiplicacao(new Numero(4), new Numero(6));
			Expressao direita = new Multiplicacao(new Numero(2), new Numero(2));
			Expressao conta = new Divisao(esquerda, direita);
			int resultado = conta.avalia();	
	        assertEquals(6 , resultado);
	    }
	 
	 @Test
	    void deveRetornar12() { 
		 	Expressao esquerda = new Divisao(new Numero(16), new Numero(2));
			Expressao direita = new Divisao(new Numero(32), new Numero(8));
			Expressao conta = new Soma(esquerda, direita);
			int resultado = conta.avalia();	
	        assertEquals(12 , resultado);
	    }
	 
	 @Test
	    void somaDeveRetornar290() { 
		 	Expressao esquerda = new Soma(new Numero(100), new Numero(10));
			Expressao direita = new Soma(new Numero(200), new Numero(-20));
			Expressao conta = new Soma(esquerda, direita);
			int resultado = conta.avalia();	
	        assertEquals(290 , resultado);
	    }
	 
	 @Test
	    void subtracaoDeveRetornar200() { 
		 	Expressao esquerda = new Subtracao(new Numero(400), new Numero(150));
			Expressao direita = new Subtracao(new Numero(300), new Numero(250));
			Expressao conta = new Subtracao(esquerda, direita);
			int resultado = conta.avalia();	
	        assertEquals(200 , resultado);
	    }
	 
	 @Test
	    void multiplicacaoDeveRetornar180() { 
		 	Expressao esquerda = new Multiplicacao(new Numero(2), new Numero(2));
			Expressao direita = new Multiplicacao(new Numero(3), new Numero(15));
			Expressao conta = new Multiplicacao(esquerda, direita);
			int resultado = conta.avalia();	
	        assertEquals(180 , resultado);
	    }
	 

	 @Test
	    void divisaoDeveRetornar5() { 
		 	Expressao esquerda = new Divisao(new Numero(100), new Numero(2));
			Expressao direita = new Divisao(new Numero(60), new Numero(6));
			Expressao conta = new Divisao(esquerda, direita);
			int resultado = conta.avalia();	
	        assertEquals(5 , resultado);
	    }
	 
	 
	 

}

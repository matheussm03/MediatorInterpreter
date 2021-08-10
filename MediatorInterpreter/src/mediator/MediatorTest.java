package mediator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MediatorTest {

	 @Test
	    void deveRetornarNomeMaria() { 	
			InterfaceMediator mediator = new Mediator();
			UsuarioAbstrato usuario_1 = new Usuario(mediator, "Maria");
			mediator.adicionarUsuario(usuario_1);
	        assertEquals("Maria",  usuario_1.nome);
	    }
	 
	 @Test
	    void deveRetornarNomeJoao() { 
			InterfaceMediator mediator = new Mediator();
			UsuarioAbstrato usuario_2 = new Usuario(mediator, "Joao");
			mediator.adicionarUsuario(usuario_2);
	        assertEquals("Joao", usuario_2.nome);
	    }
	 
	 @Test
	    void deveRetornarNomeMarli() { 
			InterfaceMediator mediator = new Mediator();
			UsuarioAbstrato usuario_3 = new Usuario(mediator, "Marli");
			mediator.adicionarUsuario(usuario_3);
	        assertEquals("Marli", usuario_3.nome);
	    }
	 
	 
}
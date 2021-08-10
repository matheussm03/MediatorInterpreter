package mediator;

public class Principal {
	
	public static void main(String[] args) {
		
		InterfaceMediator mediator = new Mediator();
		UsuarioAbstrato usuario_1 = new Usuario(mediator, "Maria");
		UsuarioAbstrato usuario_2 = new Usuario(mediator, "Joao");
		UsuarioAbstrato usuario_3 = new Usuario(mediator, "Marli");
		
		mediator.adicionarUsuario(usuario_1);
		mediator.adicionarUsuario(usuario_2);
		mediator.adicionarUsuario(usuario_3);
		
		usuario_1.enviando("Sejam Bem-vindos");
	}
	
}
